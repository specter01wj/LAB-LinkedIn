/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex9_9.model;

/**
 *
 * @author jinwang
 */
public enum OliveName {
    
    KA("Kalicistal"), LA("Luciacl");
    
    private String name;
    
    OliveName(String name) {
        this.name = name;
    }
    
    //override
    public String toString() {
        return name;
    }
    
}
