/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package optimisedbubblesort;

/**
 *
 * @title ObjectBubbleSort.java
 * @author James Mitchell 92020474
 * @date 12/09/2019
 * 
 */

public class OptimisedBubbleSort {
    
    public static int parseCounter = 0;
    public static int swapCheckCounter = 0;

    public void doOptimisedBubbleSort(int[] a) {
        int lastSwap = a.length-1;
        for(int i=1; i<a.length; i++) {
            parseCounter++;
            boolean is_sorted = true;
            int currentSwap = -1;

            for(int j=0; j < lastSwap; j++) {
                if(a[j] > a[j+1]) {
                   int temp = a[j];
                   a[j] = a[j+1];
                   a[j+1] = temp;
                   is_sorted = false;
                   currentSwap = j;
                   swapCheckCounter++;
                }
            }

            if(is_sorted) return;
            lastSwap = currentSwap;
        }
    }

    /* Prints the array */
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
        System.out.println();
    }

    // Driver method to test above
    public static void main(String args[])
    {
        OptimisedBubbleSort ob = new OptimisedBubbleSort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("The Unsorted array is");
        ob.printArray(arr);

         //apply sort
        ob.doOptimisedBubbleSort(arr);
        System.out.println("The Optimised Bubble Sorted array is");
        ob.printArray(arr);
        
        // parse counter
        System.out.println("The number of times the array was parsed was " + parseCounter);
        
        // swap check counter
        System.out.println("The number of compare operations was " + swapCheckCounter);
    }
    
}
