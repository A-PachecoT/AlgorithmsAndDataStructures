/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uni.aed.sorting;

/**
 *
 * @author AndreP
 */

public class BubbleSort {
    int numSwaps,  numComps; // Counting up swaps and comparissons
    
    public BubbleSort() {
        this.numSwaps = 0;
        this.numComps = 0;
    }
    
    public int getNumSwaps() {
        return this.numSwaps;
    }
    
    public int getNumComparissons() {
        return this.numComps;
    }
    
    public Integer[] bubbleSort(Integer[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                numComps++;
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    numSwaps++;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
