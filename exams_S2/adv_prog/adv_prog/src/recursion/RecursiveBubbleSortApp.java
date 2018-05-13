/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

import java.util.Arrays;

/**
 *
 * @author eldrad
 */
public class RecursiveBubbleSortApp {
    
    public static void main(String[] args) {
        int[] arr = {443,3,56,643,4,22,6,2};
        
        RecursiveBubbleSort rs = new RecursiveBubbleSort();
        rs.sort(arr, arr.length );
                
        System.out.println(Arrays.toString(arr));
    }
}
