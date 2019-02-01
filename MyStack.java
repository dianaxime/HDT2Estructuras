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
import java.util.*;

public class MyStack<E> implements Stack<E> {
    
    protected Vector<E> mivector;
    
    public MyStack(){
    
        //Crea un vector tamaño 10 y cuando alcance el maximo le suma 2 
    mivector = new Vector<>(10,2);
    System.out.println(mivector);
            
    
    }
    
    @Override
    public void push(E item){
        //
        mivector.addElement(item); 
    }
   
    @Override
   public E pop(){
       
       return mivector.remove(mivector.size()-1);
   }
   
    @Override
   public E peek(){
       
       return mivector.get(mivector.size()-1);
   }
   
    @Override
   public boolean empty(){
       
       return size()==0;
   }
   
    @Override
   public int size(){
       
       return mivector.size();
   }  
}
