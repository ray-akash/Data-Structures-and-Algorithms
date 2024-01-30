/*
*  852. Peak Index in a Mountain Array
*  An array arr is a mountain if the following properties hold:
*  arr.length >= 3
*  There exists some i with 0 < i < arr.length - 1 such that:
*  arr[0] < arr[1] < ... < arr[i - 1] < arr[i] 
*  arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
*  Given a mountain array arr, return the index i such that 
*  arr[0] < arr[1] < ... < arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].
*
*  You must solve it in O(log(arr.length)) time complexity.
*/

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 1;
        int end = arr.length-2;
        int mid = 1;

        while(start <= end){
            mid = start + (end-start)/2;
            if(arr[mid] < arr[mid+1])
                start = mid+1;
            else if(arr[mid] < arr[mid-1])
                end = mid-1;
            else
                return mid;
        }
        return mid;
    }
}
