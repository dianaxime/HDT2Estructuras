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
    
    public void MyStack(){
    
    mivector = new Vector<E>(10,2);
    
    }
    
    public void push(E item){
        
        mivector.addElement(item); 
    }
   
   public E pop(){
       
       return mivector.remove(mivector.size()-1);
   }
   
   public E peek(){
       
       return mivector.get(mivector.size()-1);
   }
   
   public boolean empty(){
       
       return size()==0;
   }
   
   public int size(){
       
       return mivector.size();
   }  
}
