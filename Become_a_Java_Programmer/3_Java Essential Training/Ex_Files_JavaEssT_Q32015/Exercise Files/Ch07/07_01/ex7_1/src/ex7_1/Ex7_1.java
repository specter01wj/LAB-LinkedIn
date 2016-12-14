/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex7_1;

/**
 *
 * @author jinwang
 */
public class Ex7_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int monthNum = 13;
        
        if ( monthNum >= 1 && monthNum <= 3 ){
            System.out.println("you're in Quar 1 !");
        } else if ( monthNum >= 4 && monthNum <= 6 ){
            System.out.println("you're in Quar 2 !");
        } else if ( monthNum >= 7 && monthNum <= 9 ){
            System.out.println("you're in Quar 3 !");
        } else if ( monthNum >= 10 && monthNum <= 12 ){
            System.out.println("you're in Quar 4 !");
        } else {
            System.out.println("Unknown!");
        }
    }
    
}
