/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author esu
 */
public class ExceptionApp {
    
    public static void main(String[] args) {
        int[] arr = {1,2,3};
          
        ExceptionMethod em = new ExceptionMethod();
        try{
        em.test(arr);
        } catch (Exception e){
            System.err.println(e);
        }
        
        System.out.println("after catch");
    }
}
