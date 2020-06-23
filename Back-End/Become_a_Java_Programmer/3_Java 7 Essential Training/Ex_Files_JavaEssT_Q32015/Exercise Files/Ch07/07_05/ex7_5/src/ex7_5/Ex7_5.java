/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex7_5;
import java.util.Scanner;
/**
 *
 * @author jinwang
 */
public class Ex7_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s1 = getInput("Enter val 1: ");
        String s2 = getInput("Enter val 2: ");
        String s3 = getInput("Enter val 3: ");
        
        double result = addValues(s1, s2);
        System.out.println("The ans is: " + result);
        
        double result2 = addValues(s1, s2, s3);
        System.out.println("The 3 val ans is: " + result2);
        
        double result3 = addValues(s1, s2, s3, s1, s2, s3);
        System.out.println("The unlimited val ans is: " + result3);
    }
    
    static String getInput(String prompt) {
        System.out.print(prompt);
        Scanner sc = new Scanner(System.in);
        
        return sc.nextLine();
    }
    
    static double addValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        
        double result = d1 + d2;
        
        return result;
    }
    
    static double addValues(String s1, String s2, String s3) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        double d3 = Double.parseDouble(s3);
        
        double result = d1 + d2 + d3;
        
        return result;
    }
    
    static double addValues(String ... values) {
        double result = 0;
        
        for ( String value: values ) {
            double d = Double.parseDouble(value);
            result += d;
        }
        
        return result;
    }
    
}
