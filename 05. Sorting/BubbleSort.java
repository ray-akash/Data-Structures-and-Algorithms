package Sorting;
/*
*  Time Complexity: O(n^2)
*  Space Complexity: O(1)  ignore the driver code
*/
import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {3, 3, 4, 4, 7, 0, 1, 4, 6, 5, 5, 4, 2};
        System.out.println(Arrays.toString(arr));        // [3, 3, 4, 4, 7, 0, 1, 4, 6, 5, 5, 4, 2]
        int[] sortedArr = bubbleSort(arr);
        System.out.println(Arrays.toString(sortedArr));  // [0, 1, 2, 3, 3, 4, 4, 4, 4, 5, 5, 6, 7]
    }

    static int[] bubbleSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-i; j++){
                if(j+1<arr.length && arr[j] > arr[j+1]){
                    arr[j] = arr[j]+arr[j+1];
                    arr[j+1] = arr[j] - arr[j+1];
                    arr[j] = arr[j] - arr[j+1];
                }
            }
        }
        return arr;
    }
}
