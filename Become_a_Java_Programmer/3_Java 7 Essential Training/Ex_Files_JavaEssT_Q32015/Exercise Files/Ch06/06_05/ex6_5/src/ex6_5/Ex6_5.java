/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex6_5;

/**
 *
 * @author jinwang
 */
public class Ex6_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String wel = "Welcome";
        char[] chars = wel.toCharArray();
        try {
            
            if (chars.length<10){
                
                throw (new Exception("My throw!"));
              
            }
            
            char lastChar = chars[chars.length-1];
            System.out.println(lastChar);
            String sub = wel.substring(10);
        } catch (ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace();
            System.out.println("Arr Error!");
        } catch (StringIndexOutOfBoundsException e) {
//            e.printStackTrace();
            System.out.println("String Error!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
