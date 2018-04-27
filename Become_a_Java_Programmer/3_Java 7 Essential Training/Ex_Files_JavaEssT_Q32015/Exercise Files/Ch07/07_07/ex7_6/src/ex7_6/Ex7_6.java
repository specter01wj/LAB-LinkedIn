/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex7_6;

/**
 *
 * @author jinwang
 */
public class Ex7_6 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        int org = 10;
        System.out.println("orgi before: " + org);
        incrementValue(org);
        System.out.println("orgi after: " + org);
        
        int[] org1 = {10, 20, 30};
        System.out.println("orgi[] before: " + org1[0]);
        incrementValue(org1);
        System.out.println("orgi[] after: " + org1[0]);
        
        String org2 = "Original!";
        System.out.println("orgi before: " + org2);
        changeString(org2);
        System.out.println("orgi after: " + org2);
    }
    
    static int incrementValue(int inMethod) {
        inMethod ++;
        System.out.println("in method: " + inMethod);
        return inMethod;
    }
    
    static int[] incrementValue(int[] inMethod) {
        inMethod[0] ++;
        System.out.println("in method: " + inMethod[0]);
        return inMethod;
    }
    
    static String changeString(String inMethod) {
        inMethod = "New!";
        System.out.println("in method: " + inMethod);
        return inMethod;
    }
}
