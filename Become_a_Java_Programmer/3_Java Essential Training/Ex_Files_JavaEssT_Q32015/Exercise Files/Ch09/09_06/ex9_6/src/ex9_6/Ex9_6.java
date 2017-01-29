/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex9_6;

import ex9_6.model.Olive;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jinwang
 */
public class Ex9_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Olive> olives = new ArrayList<>();
        Olive olive1 = new Olive();
        olives.add(olive1);
        Olive olive2 = new Olive();
        olive2.setOil(1);
        olives.add(olive2);
        Olive olive3 = new Olive();
        olives.add(olive3);
        olive3.setOil(4);
        OlivePress press = new OlivePress();
        int totalOil = press.getOil(olives);
        System.out.println("Total olive oil: " + totalOil);
        
    }
    
}
