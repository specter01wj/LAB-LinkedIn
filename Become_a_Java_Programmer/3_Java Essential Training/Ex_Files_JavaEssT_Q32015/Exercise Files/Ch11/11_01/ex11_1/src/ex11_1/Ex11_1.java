/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex11_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author jinwang
 */
public class Ex11_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String sourceFile = "files/loremipsum.txt";
        String targetFile = "files/target.txt";
        
        try (
                FileReader fReader = new FileReader(sourceFile);
                BufferedReader bReader = new BufferedReader(fReader);
                FileWriter writer = new FileWriter(targetFile);
                ) {
        
            while (true) {
                String line = bReader.readLine();
                if( line == null ) {
                    break;
                } else {
                    writer.write(line + "\n");
                }
            }
            System.out.println("File copy done!");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
