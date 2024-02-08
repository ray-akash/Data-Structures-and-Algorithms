/*
*   Time Complexity: O(n^2)
*   Space Complexity: O(1)
*   Stable
*/
package Sorting;

import java.util.Arrays;
public class InsertionSort {
    public static void main(String[] args){
        int[] arr = {3, 7, 3, 4, 4, 6, 7, -7, 7, 0, 0, 1, 4, 3, 6, 5, -5, 4, 2,};
        System.out.println(Arrays.toString(arr));    // [3, 7, 3, 4, 4, 6, 7, -7, 7, 0, 0, 1, 4, 3, 6, 5, -5, 4, 2]
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));    // [-7, -5, 0, 0, 1, 2, 3, 3, 3, 4, 4, 4, 4, 5, 6, 6, 7, 7, 7]
    }

    static void insertionSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j>0; j--){
                if(arr[j] < arr[j-1])
                    swap(arr, j, j-1);
                else
                    break;
            }
        }
    }

    static void swap(int[]arr, int i, int j){
        arr[i] = arr[i]+arr[j];
        arr[j] = arr[i]-arr[j];
        arr[i] = arr[i]-arr[j];
    }
}
