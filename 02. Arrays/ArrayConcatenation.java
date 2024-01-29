/*
*   1929.Concatenation of Array
*   Given an integer array nums of length n, you want to create an array ans of length 2n where
*   ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
*/

public class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] res = new int[(nums.length)*2];
        int start = 0;
        int end = nums.length;

        while(start < nums.length){
            res[start] = nums[start];
            res[end] = res[start];
            start++;
            end++;
        }
        return res;
    }
}
