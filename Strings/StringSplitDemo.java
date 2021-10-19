/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringsplitdemo;

/**
 *
 * @author anitha.ramatenki
 */
public class StringSplitDemo {
    
    public static void main(String[] args){ 
    
    String sentence="This is a sentence!";
   
    String phone="(555) 234-9876"; 
    
    String url="oracle.com"; 
    
    for(String word: sentence.split("\\s+"))
    {
        
        System.out.println(word); 
    }
    
    System.out.println(); 
    
    for(String part: phone.split("\\D+"))
    {
        
    System.out.println(part); 
    
    }
    System.out.println(); 
    
    String[] urlParts=url.split("://"); 

    if(urlParts.length>1)
    { 
    
    System.out.println(urlParts[0]); 
    }
    
    else{
    System.out.println("http"); 
    }
}
}