/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eldrad
 */
public class FactorialLogic {
    int result = 1;
    
    public int getFactorial(int n){
        
        if(n == 1){
            return result;
        } else {
            System.out.println("resu" + result + " n value is " + n);
            result = result * n;
            return getFactorial(n-1);
        }
        
    }
        
}
