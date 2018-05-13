/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author eldrad
 */
public class Fibonacci {
    
    public int fibonacci(int n ){
        int fib;
        
        if( (n==1) || (n==2) ){
            fib = 1;
        } 
        else {
            fib = fibonacci(n - 1) + fibonacci(n - 2);
        }
        return fib;
        
    }
    
    public void series(int n){
        
        for (int j = 1; j < n; j++) {
            System.out.println("element " + " is " + fibonacci(j));
        }
    }
}
