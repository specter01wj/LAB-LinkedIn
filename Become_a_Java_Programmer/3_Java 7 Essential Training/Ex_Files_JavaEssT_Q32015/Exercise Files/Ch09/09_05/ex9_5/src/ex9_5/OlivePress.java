/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex9_5;

import ex9_5.model.Olive;
import java.util.List;
/**
 *
 * @author jinwang
 */
public class OlivePress {
    
    public int getOil(List<Olive> olives) {
        
        for ( Olive o: olives ) {
            System.out.println(o.name);
        }
        
        return 0;
        
    }
    
}
