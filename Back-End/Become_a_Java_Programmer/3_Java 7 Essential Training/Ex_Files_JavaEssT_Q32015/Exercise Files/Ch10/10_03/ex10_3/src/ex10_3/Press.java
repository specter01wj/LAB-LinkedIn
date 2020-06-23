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
public interface Press {
    
    public int getOil(List<Olive> olives);
    public void setOil(int oil);
    
}
