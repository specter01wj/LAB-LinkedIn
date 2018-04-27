/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex8_1;
import java.util.Arrays;
/**
 *
 * @author jinwang
 */
public class Ex8_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Array of primitives");
        int[] ints = {12,3,6,9};
        Arrays.sort(ints);
        
        for (int i = 0; i < ints.length; i++) {
            
            System.out.println(ints[i]);
        }

        System.out.println("Array of strings");
        String[] strings = {"Red", "Green", "Blue"};
        Arrays.sort(strings);
        for (String color: strings) {
            System.out.println(color);
        }

        System.out.println("Setting an initial size");
        int[] sized = new int[10];
        for (int i = 0; i < sized.length; i++) {
            sized[i] = i * 100;
            
        }
        for ( int value: sized ) {
            System.out.println(value);
        }

        System.out.println("Copying an array");
        int[] copied = new int[5];
        System.arraycopy(sized, 5, copied, 0, 5);
        for ( int value: copied ) {
            System.out.println(value);
        }
    }
    
}
