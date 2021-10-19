/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringBuilderDemo;

/**
 *
 * @author anitha.ramatenki
 */
public class StringBuilderDemo {
    
    public static void main(String[] args){ 
        
        String[] words={"My", "name", "is", "Anitha Ramatenki!"}; 
        
        StringBuilder mySB=new StringBuilder(); 
        
        for(String word: words){ 
            
            mySB.append(word); 
            
            mySB.append(" "); 
        } 
        
        System.out.println(mySB); 
    }
    
}
