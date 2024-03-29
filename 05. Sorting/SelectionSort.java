/*
*    Time Complexity: O(n^2)
*    Space Complexity: O(1)
*    Unstable
*/
package Sorting;

import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {3, 7, 3, 4, 4, 6, 7, -7, 7, 0, 0, 1, 4, 3, 6, 5, -5, 4, 2,};
        System.out.println(Arrays.toString(arr));    // [3, 7, 3, 4, 4, 6, 7, -7, 7, 0, 0, 1, 4, 3, 6, 5, -5, 4, 2]
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));    // [-7, -5, 0, 0, 1, 2, 3, 3, 3, 4, 4, 4, 4, 5, 6, 6, 7, 7, 7]
    }

    static void selectionSort(int[] arr){
        for (int i = arr.length-1; i >= 0; i--) {
            // Get the index of max element in range [0,i]
            int index = getMaxIndex(arr, i);

            // Place max element at correct position
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }

    static int getMaxIndex(int[] arr, int lastIndex){
        int maxIndex = 0;
        for(int i=1; i<=lastIndex; i++)
            if(arr[i] > arr[maxIndex])
                maxIndex = i;

        return maxIndex;
    }
}
