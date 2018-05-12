
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eldrad
 */
public class BubbleSort {
    
    private int[] array;
    
    public BubbleSort(){};
    
    public void sort(int[] array){
        
        boolean swapped = true;
        int l = array.length;
        this.array = array;
        
        while(swapped){
            //reset flag
            swapped = false;
            //inside loop
            for (int i = 0; i < l - 1; i++) {

                if (array[i] > array[i + 1]) {
                    swap(i, i + 1);
                    swapped = true;
                    System.out.print("swapped items " + i + " and " + (i+1));
                }
            }
        }
        print(this.array);
    }
    
    
    public void swap(int x, int y){
        int temp;
        temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
    
    public void print( int[] arr){
        for (int i : arr) {
            System.out.println(i + ",");
            
        }
    }
}
