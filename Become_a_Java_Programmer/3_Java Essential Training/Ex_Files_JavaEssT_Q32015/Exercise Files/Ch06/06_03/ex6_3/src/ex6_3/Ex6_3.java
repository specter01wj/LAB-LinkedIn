/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex6_3;

/**
 *
 * @author jinwang
 */
public class Ex6_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String wel = "Welcome";
        char[] chars = wel.toCharArray();
        try {
            char lastChar = chars[chars.length-1];
            System.out.println(lastChar);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
    
}
