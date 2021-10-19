/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LexicographicDemo;

/**
 *
 * @author anitha.ramatenki
 */
public class LexicographicDemo 
{
    public static void main(String[] args){ 
        String name1="smith, Fam"; 
        String name2="Smith, Sam"; 
        System.out.println(name1.compareTo(name2)); 
        System.out.println(name1.compareToIgnoreCase(name2)); 
                if(name1.compareTo(name2)<=0){ 
                    System.out.println(name1); 
                    System.out.println(name2); 
                }
                else{ 
                    System.out.println(name2); 
                    System.out.println(name1); 
                } 
    }    
}
