/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inertionSort;

/**
 *
 * @author eldrad
 */
public class insertionSort {
    
    public void insertionSort(int[] arr){
        
        //start from 1 not 0 ( we don't have to look at first ele)
        for( int i = 1; i<arr.length; i++){
            
            int value = arr[i];
            int j = i -1;
            
            while( j>=0 && arr[j] > value){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = value;
        }
        
        for (int i : arr) {
            System.out.println(i + ", ");
        }
    }
    
}
