/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt2;

/**
 *
 * @author DIANA
 */
public class MyCalculator implements Calculator {
    
    @Override
    public int calculate (int num1, int num2, String op){
        int resultado;
        resultado = 0;
        switch (op){
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                resultado = num1 / num2;
                break;
        }
        return resultado;
    }
    
}
