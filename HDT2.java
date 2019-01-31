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
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class HDT2 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyCalculator calculadora;
        calculadora = new MyCalculator();
        
        MyStack fifo;
        fifo = new MyStack();
        
        String archivo; 
        FileReader lector;
        BufferedReader lector1;
        String datos;
        try{
            lector = new FileReader(archivo);
            lector1 = new BufferedReader(lector);
            while ((datos=lector1.readLine())!=null){
                String partes[] = datos.split(" ");
                for (int i=0; i<partes.length; i++){
                    boolean convertir;
                    try{
                        Integer.parseInt(partes[i]);
                        convertir=true;
                    }
                    catch(NumberFormatException e){
                        convertir = false;
                    }
                    if (convertir){
                        Integer.parseInt(partes[i]);
                    }
                }
            }  
        }
        catch(FileNotFoundException e){
            
        }
        catch(IOException e){
            
        }
        
        
        
    }
    
}
