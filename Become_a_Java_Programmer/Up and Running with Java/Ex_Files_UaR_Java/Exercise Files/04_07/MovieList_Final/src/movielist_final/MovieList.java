/*
 * This program is for the challenge on creating classes
 */
package movielist_final;
import java.util.Scanner;
/**
 *
 * @author Peggy Fisher
 */
public class MovieList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String movie, rating;
        int year, runtime;
        Movie favoriteMovie;
        System.out.println("Please enter movie title: ");
        movie = in.nextLine();
        System.out.println("Please enter movie rating: ");
        rating = in.nextLine();
        System.out.println("Please enter year produced: ");
        year = in.nextInt();
        System.out.println("Please enter total runtime: ");
        runtime = in.nextInt();
        favoriteMovie = new Movie(movie, rating, year, runtime);
        System.out.println(favoriteMovie.toString());
    }
    
}
