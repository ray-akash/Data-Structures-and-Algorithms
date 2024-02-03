// 410. https://leetcode.com/problems/split-array-largest-sum/

class Solution {
    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end += nums[i];
        }

        while(start < end){
            int mid = start+(end-start)/2;
            int sum = 0;
            int pieces = 1;

            for(int ele : nums){
                if(sum+ele > mid){
                    sum = ele;
                    pieces++;
                }
                else
                    sum += ele;
            }
            if(pieces > k)
                start = mid+1;
            else
                end = mid;
        } 
        return end; // start = end
    }
}
