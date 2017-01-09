/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex8_4;

import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author jinwang
 */
public class Ex8_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Map<String, String> map = new HashMap<>();
        map.put("CA", "Sacram");
        map.put("OR", "Salem");
        map.put("WA", "Olympia");
        System.out.println(map);
        
        map.put("AK", "Juneau");
        System.out.println(map);
        
        String cap = map.get("OR");
        System.out.println("the cap of OR is: " + cap);
        
        map.remove("CA");
        System.out.println(map);
    }
    
}
