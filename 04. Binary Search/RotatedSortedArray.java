// 33.  https://leetcode.com/problems/search-in-rotated-sorted-array/

class Solution {
    public static int search(int[] nums, int target) {
        // 1. Find pivot
        int pivotIndex = findPivot(nums);

        // If the array is not rotated, do binary search over whole array
        if(pivotIndex == -1) {
            return binarySearch(nums, target, 0, nums.length-1);
        }

        // If pivot is only the target 
        if(nums[pivotIndex] == target)
            return pivotIndex;

        // 2. Search for target in both halves
        if(nums[0] <= target)
            return binarySearch(nums, target, 0, pivotIndex-1);
        else
            return binarySearch(nums, target, pivotIndex+1, nums.length-1);
    }

    public static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start+(end-start)/2;
            if(mid+1 <= end && arr[mid] > arr[mid+1])
                return mid;
            if(mid-1 >= start && arr[mid] < arr[mid-1])
                return mid-1;
            if(arr[start] >= arr[mid])
                end = mid-1;
            if(arr[start] < arr[mid])
                start = mid+1;
        }
        // In case the array is not rotated, -1 will be returned
        return -1;
    }

    public static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start+(end-start)/2;
            if(arr[mid] < target)
                start = mid+1;
            else if(arr[mid] > target)
                end = mid-1;
            else
                // target found
                return mid;
        }
        // target not found
        return -1;
    }
}
