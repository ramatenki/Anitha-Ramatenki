/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thestringreplace;

/**
 *
 * @author anitha.ramatenki
 */
public class StringReplaceDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        // TODO code application logic here
        String phrase="the cat and the dog"; 
        
        String result=phrase.replace("the", "a"); 
        
        System.out.println(result); 
        
        System.out.println(); 
        
        String sentence="This is a sentence! What about a question?"; 
        
        result=sentence.replaceAll("\\p{Punct}", ""); 
        
        System.out.println(result); 
        
        for(String word : result.split("\\s+")){ 
           
            System.out.println(word);
        
        }
    }
}
