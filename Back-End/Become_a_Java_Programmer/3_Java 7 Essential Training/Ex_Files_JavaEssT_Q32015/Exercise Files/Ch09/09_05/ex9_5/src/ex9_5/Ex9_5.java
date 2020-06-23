/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex9_5;

import ex9_5.model.Olive;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jinwang
 */
public class Ex9_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<Olive> olives = new ArrayList<>();
        Olive olive1 = new Olive();
        olives.add(olive1);
        Olive olive2 = new Olive();
        olives.add(olive2);
        Olive olive3 = new Olive();
        olives.add(olive3);
        
        OlivePress press = new OlivePress();
        press.getOil(olives);
        
    }
    
}
