/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex7_4;

/**
 *
 * @author jinwang
 */
public class Ex7_4 {
    
    static String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "June", 
            "July", "Augu", "Sept", "Oct", "Nov", "Dec"};
    
    public static void main(String[] args) {
        // TODO code application logic here

        loopIt("Month of the year:");
        loopIt("Rookie of the year:");
        loopIt("Player of the year:");
    }
    
    static void loopIt(String label) {
        System.out.println(label);
        for (int i = 0; i < label.length(); i++) {
            System.out.print("*");
            
        }
        System.out.println("");
        
        for (int i = 0; i < month.length; i++) {
            System.out.println(month[i]);
        }
    }
    
}
