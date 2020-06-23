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
public class Ex7_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a num: ");
        String input = sc.nextLine();
        int monthNum = Integer.parseInt(input);
        
        switch(monthNum) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("March");
                break;
            default:
                System.out.println("Other month!");
        }
        
    }
    
}
