/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex11_3;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author jinwang
 */
public class Ex11_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        File sourceFile = new File("files/loremipsum.txt");
        File targetFile = new File("files/target.txt");
        
        try {
            FileUtils.copyFile(sourceFile, targetFile);
            System.out.println("file copied!");
        } catch(IOException e) {
            e.printStackTrace();
        }
        
    }
    
}
