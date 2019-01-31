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
        String archivo; 
        
        FileReader lector;
        BufferedReader lector1;
        String datos;
        try{
            lector = new FileReader(archivo);
            lector1 = new BufferedReader(lector);
            while ((datos=lector1.readLine())!=null){
            
            }  
        }
        catch(FileNotFoundException e){
            
        }
        catch(IOException e){
            
        }
        
        
        
    }
    
}
