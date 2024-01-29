/*
*  34. Find First and Last Position of Element in Sorted Array
*  Given an array of integers nums sorted in non-decreasing order, find the starting and 
*  ending position of a given target value.
*
*  If target is not found in the array, return [-1, -1].
*
*  You must write an algorithm with O(log n) runtime complexity.
*/

class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length > 0) {
            int index1 = firstPos(nums, target);
            int index2 = lastPos(nums, target);

            if(nums[index1] == target && nums[index2] == target)
                return new int[]{index1, index2};
            else
                return new int[]{-1, -1};
        }
        else
            return new int[]{-1, -1};
    }

    public static int firstPos(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(target > arr[mid])
                start = mid+1;
            else
                end = mid-1;
        }
        return start%arr.length;
    }

    public static int lastPos(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(target < arr[mid])
                end = mid-1;
            else
                start = mid+1;
        }
        return end%arr.length;
    }
}
