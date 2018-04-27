import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		String[] s = { "", "", "" };

		Scanner in = new Scanner(System.in);

		System.out.println("Enter a year (2006-2014)");
		s[0] = in.nextLine();
		System.out.println("Enter a month (01-12)");
		s[1] = in.nextLine();
		System.out.println("Enter a day (01-31)");
		s[2] = in.nextLine();
		in.close();
		ArrayList<Double> windGust = getData("Wind_Gust", s);
		ArrayList<Double> airTemp = getData("Air_Temp", s);
		ArrayList<Double> pressure = getData("Barometric_Press", s);
		System.out.println("Wind Gust:  mean " + mean(windGust) + ", median "
				+ median(windGust));
		System.out.println("Air Temp:  mean " + mean(airTemp) + ", median "
				+ median(airTemp));
		System.out.println("Pressure:  mean " + mean(pressure) + ", median "
				+ median(pressure));
	}

	public static ArrayList<Double> getData(String type, String[] s)
			throws NumberFormatException, IOException {
		URL dataSource = new URL("http://lpo.dt.navy.mil/data/DM/" + s[0] + "/"
				+ s[0] + "_" + s[1] + "_" + s[2] + "/" + type);
		BufferedReader data = new BufferedReader(new InputStreamReader(
				dataSource.openStream()));
		ArrayList<Double> windData = new ArrayList<Double>();
		String inputLine;
		while ((inputLine = data.readLine()) != null)
			windData.add(Double.parseDouble(inputLine.substring(20)));
		data.close();
		return windData;
	}

	public static double mean(ArrayList<Double> a) {
		double sum = 0;
		for (double i : a) {
			sum += i;
		}
		return sum / a.size();
	}

	public static double median(ArrayList<Double> a) {
		Collections.sort(a);
		if (a.size() / 2 * 2 == a.size()) {
			return (a.get(a.size() / 2) + a.get(a.size() / 2 - 1)) / 2;
		} else {
			return a.get(a.size() / 2);
		}
	}
}