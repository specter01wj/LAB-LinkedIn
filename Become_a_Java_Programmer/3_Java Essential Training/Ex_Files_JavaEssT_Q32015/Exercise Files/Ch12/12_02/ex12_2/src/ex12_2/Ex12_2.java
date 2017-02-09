/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex12_2;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 *
 * @author jinwang
 */
public class Ex12_2 {

    /**
     * @param args the command line arguments
     */
    private static final String FLOWERS_FEED =
            "http://services.hanselandpetal.com/feeds/flowers.xml";
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        InputStream stream = null;
        BufferedInputStream buf = null;

        try {
            URL url = new URL(FLOWERS_FEED);
            stream = url.openStream();
            buf = new BufferedInputStream(stream);

            StringBuilder sb = new StringBuilder();

            while (true) {
                int data = buf.read();

                if (data == -1) {
                    break;
                } else {
                    sb.append((char)data);
                }
            }

            System.out.println(sb);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            stream.close();;
            buf.close();
        }
        
    }
    
}
