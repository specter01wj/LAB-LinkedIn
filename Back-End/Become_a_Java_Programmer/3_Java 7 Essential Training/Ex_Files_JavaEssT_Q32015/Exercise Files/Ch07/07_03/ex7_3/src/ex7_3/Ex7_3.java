/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex7_3;

/**
 *
 * @author jinwang
 */
public class Ex7_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "June", 
            "July", "Augu", "Sept", "Oct", "Nov", "Dec"};
        
//        for (int i = 0; i < month.length; i++) {
//            System.out.println(month[i]);
//        }
        
        for ( String mon: month ) {
            System.out.println(mon);
        }

        
    }
    
}
