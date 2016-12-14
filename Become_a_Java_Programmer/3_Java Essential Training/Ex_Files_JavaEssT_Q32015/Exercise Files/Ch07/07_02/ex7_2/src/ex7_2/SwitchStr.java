/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex7_2;
import java.util.Scanner;
/**
 *
 * @author jinwang
 */
public class SwitchStr {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string: ");
        String input = sc.nextLine();
        
        switch(input) {
            case "Jan":
                System.out.println("January");
                break;
            case "Feb":
                System.out.println("February");
                break;
            case "Mar":
                System.out.println("March");
                break;
            default:
                System.out.println("Other month!");
        }
        
    }
}
