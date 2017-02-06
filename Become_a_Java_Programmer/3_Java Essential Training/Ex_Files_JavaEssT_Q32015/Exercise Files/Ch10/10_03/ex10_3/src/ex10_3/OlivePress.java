/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex10_3;

import java.util.List;
import model.Olive;

/**
 *
 * @author jinwang
 */
public class OlivePress implements Press {
    
    private int currentOil;
    
    public int getOil(List<Olive> olives) {

		int totalOil = currentOil;
		for (Olive o : olives) {
			totalOil += o.crush();
		}

		return totalOil;

	}

    @Override
    public void setOil(int oil) {
        currentOil = oil;
    }
    
}
