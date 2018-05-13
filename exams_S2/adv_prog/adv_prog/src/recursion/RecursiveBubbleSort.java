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
public class RecursiveBubbleSort {
  
    //recursion
    public void sort(int[] arr, int n){
        if(n == 1)
            return;
        
        //one pass of normal bubble sort to place larges 
        //item last
        for (int i = 0; i < n-1; i++) {
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        
        //largest element is fixe, we can run again without last ele
        sort(arr, n-1);
        
    }
}