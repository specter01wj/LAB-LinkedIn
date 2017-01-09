/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex8_2;

/**
 *
 * @author jinwang
 */
public class Ex8_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[][] states = new String[3][2];
        states[0][0] = "CA";
        states[0][1] = "TX";
        states[1][0] = "MA";
        states[1][1] = "MT";
        states[2][0] = "NE";
        states[2][1] = "NY";
        
        for (int i = 0; i < states.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append("The cap of ").append(states[i][0])
                    .append(" is ")
                    .append(states[i][1])
                    .append(".");
            System.out.println(sb);
            
        }
        
    }
    
}
