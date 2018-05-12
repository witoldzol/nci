/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

import java.io.IOException;

/**
 *
 * @author esu
 */
public class ExceptionMethod {
    
    public int test(int[] arr) throws IOException{
        if(arr.length > 2){
            throw new IOException("array cannot be that big");
        }
        return arr[4];
    }
    
    public int test2(int[] arr) {
        return arr[0];
    }
}
