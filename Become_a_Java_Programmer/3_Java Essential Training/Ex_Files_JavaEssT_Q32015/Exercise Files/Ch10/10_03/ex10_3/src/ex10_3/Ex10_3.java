/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex10_3;

import java.util.ArrayList;
import java.util.List;
import model.Kalamata;
import model.Ligurian;
import model.Olive;

/**
 *
 * @author jinwang
 */
public class Ex10_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Olive> olives = new ArrayList<>();
        olives.add(new Kalamata());
        olives.add(new Kalamata());
        olives.add(new Ligurian());
        olives.add(new Ligurian());
        olives.add(new Ligurian());
        olives.add(new Ligurian());

        Press press = new OlivePress();
        press.setOil(500);
        int totalOil = press.getOil(olives);

        System.out.println("You got " + totalOil + " units of oil");
        
//        Press p2 = new Press() {
//            @Override
//            public int getOil(List<Olive> olives) {
//
//		return 0;
//
//            }
//
//            @Override
//            public void setOil(int oil) {
//                
//            }
//        }
        
    }
    
}
