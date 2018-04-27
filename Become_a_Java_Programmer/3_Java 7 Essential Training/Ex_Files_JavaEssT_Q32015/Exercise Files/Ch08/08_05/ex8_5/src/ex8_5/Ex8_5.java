/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex8_5;

import java.util.*;
/**
 *
 * @author jinwang
 */
public class Ex8_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ordered data");
        ArrayList<String> list = new ArrayList<String>();
        list.add("California");
        list.add("Oregon");
        list.add("Washington");

        System.out.println("toString() output");
        System.out.println(list);
        System.out.println("");
        
        System.out.println("Arraylist iterator");
        Iterator<String> iterator = list.iterator();
        while ( iterator.hasNext() ) {
            String value = iterator.next();
            System.out.println(value);
        }
        System.out.println("");
        
        System.out.println("Arraylist Foreach");
        for ( String value: list ) {
            System.out.println(value);
        }
        System.out.println("");
        
        System.out.println("Java 8 method reference");
        list.forEach(System.out::println);
        System.out.println("");
        
        System.out.println("Unordered data");
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("California", "Sacramento");
        map.put("Oregon", "Salem");
        map.put("Washington", "Olympia");
        System.out.println(map);
        System.out.println("");
        
        System.out.println("HashMap Iterator");
        Set<String> keys = map.keySet();
        Iterator<String> iterator1 = keys.iterator();
        while ( iterator1.hasNext() ) {
            String key = iterator1.next();
            System.out.println("the cap of " + key + " is " + map.get(key));
        }
        System.out.println("");

        System.out.println("HashMap ForEach");
        for ( String key: keys ) {
            System.out.println("the cap of " + key + " is " + map.get(key));
        }
        System.out.println("");
    }
    
}
