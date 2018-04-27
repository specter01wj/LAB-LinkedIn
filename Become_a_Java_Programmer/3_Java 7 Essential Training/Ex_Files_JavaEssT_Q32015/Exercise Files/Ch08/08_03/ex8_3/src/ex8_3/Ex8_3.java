/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex8_3;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author jinwang
 */
public class Ex8_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> list = new ArrayList<>();
        list.add("CA");
        list.add("OR");
        list.add("WA");
        
        System.out.println(list);
        
        list.add("AK");
        System.out.println(list);
        
        list.remove(0);
        System.out.println(list);
        
        String state = list.get(1);
        System.out.println("The 2nd state is: " + state);
        
        int pos = list.indexOf("AK");
        System.out.println("AK is the at pos: " + pos);
    }
    
}
