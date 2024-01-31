// 1095.  https://leetcode.com/problems/find-in-mountain-array/

/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peakIndex = findPeakElement(mountainArr);

        if(mountainArr.get(peakIndex) == target)
            return peakIndex;
        
        // Applying Binary search from 0th index to peakIndex
        int index = orderAgnosticBinarySearch(0, peakIndex, target, mountainArr);
        if(index != -1)
            return index;
        else
            // Applying Binary search from peakIndex index to last index
            return orderAgnosticBinarySearch(peakIndex, mountainArr.length()-1, target, mountainArr);
    }

    // Order Agnostic Binary Search does the binary search on sorted array regardless of it being ascending or descending.
    public int orderAgnosticBinarySearch(int start, int end, int target, MountainArray mountainArr){
        boolean isDesc = mountainArr.get(start) > mountainArr.get(end);

        while(start <= end){
            int mid = start + (end-start)/2;
            if(target == mountainArr.get(mid))
                return mid;
            if(isDesc)  // for Descending ordered array
                if(target < mountainArr.get(mid))
                    start = mid+1;
                else
                    end = mid-1;
            else    // for Ascending ordered array
                if(target < mountainArr.get(mid))
                    end = mid-1;
                else
                    start = mid+1;
        }
        return -1;
    }

    // Returns the index of peak element in a Mountain Array
    public int findPeakElement(MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length()-1;

        while(start < end){
            int mid = start + (end-start)/2;
            if(mountainArr.get(mid) > mountainArr.get(mid+1))
                end = mid;
            else
                start = mid+1;
        }
        return start;
    }
}
