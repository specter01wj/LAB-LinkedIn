/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex9_3;


import ex9_3.utilities.MathHelper;
import java.util.Scanner;
/**
 *
 * @author jinwang
 */
public class Ex9_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Ex9_3 calc = new Ex9_3();
        calc.calculate();
        
    }

    protected boolean calculate() {
        // TODO code application logic here
        InputHelper helper = new InputHelper();
        String s1 = helper.getInput("Enter a numeric value: ");
        String s2 = helper.getInput("Enter a numeric value: ");
        String op = helper.getInput("Choose an operation (+ - * /):");
        double result = 0;
        try {
            switch (op) {
                case "+":
                    result = MathHelper.addValues(s1, s2);
                    break;
                case "-":
                    result = MathHelper.subtractValues(s1, s2);
                    break;
                case "*":
                    result = MathHelper.multiplyValues(s1, s2);
                    break;
                case "/":
                    result = MathHelper.divideValues(s1, s2);
                    break;
                default:
                    System.out.println("Unrecognized operation!");
                    return true;
            }
            System.out.println("The answer is " + result);
        }catch (Exception e) {
            System.out.println("Number formatting exception " + e.getMessage());
        }
        return false;
    }
    
    class InputHelper {
        private String getInput(String prompt) {
          System.out.print(prompt);
          Scanner sc = new Scanner(System.in);
          return sc.nextLine();
        }  
    }
    
    

    
}
