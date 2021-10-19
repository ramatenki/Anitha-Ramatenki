/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringequalitytest;

/**
 *
 * @author anitha.ramatenki
 */
public class StringEqualityTest {
    
    public static void main(String[] args){
        
        String name1="Anitha";
        
        String name2="anitha";
        
        System.out.println(name1);
        
        System.out.println(name2);
        
        if(name1.equals(name2)){
        
            System.out.println(".equal is true");}
        
        else{
        
            System.out.println(".equal is false");}
        
    if(name1.equalsIgnoreCase(name2)){
        
        System.out.println(".equalsIgnoreCase is true");}
        
        else{
        
        System.out.println(".equalsIgnoreCase is false");}
    
    if(name1==name2){
        
     System.out.println(".== is true");}
        
        else{
        
            System.out.println(".==is false");}
        
    
    }
    }
    