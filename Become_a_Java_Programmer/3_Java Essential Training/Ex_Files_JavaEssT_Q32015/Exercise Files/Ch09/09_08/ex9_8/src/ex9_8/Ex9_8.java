/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex9_8;

import ex9_8.model.Olive;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jinwang
 */
public class Ex9_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Olive> olives = new ArrayList<>();
        
        olives.add(new Olive(Olive.KA, 0x2E0854, 3));
        olives.add(new Olive("King", 0x000000, 6));
        olives.add(new Olive(Olive.KA, 0xFFFFFF, 19));
        olives.add(new Olive("King", 0x000000, 6));
        olives.add(new Olive("King", 0x000000, 6));
        
        OlivePress press = new OlivePress();
        int totalOil = press.getOil(olives);
        System.out.println("Total olive oil: " + totalOil);
    }
    
}
