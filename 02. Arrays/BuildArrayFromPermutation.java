/*
*   1920.Build array from permutation
*   Given a zero-based permutation nums (0-indexed), build an array ans of the same length where
*   ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
*/

public class Solution {
    public int[] buildArray(int[] nums) {
        int i = 0;
        int[] res = new int[nums.length];
        for(int ele : nums){
            res[i] = nums[ele];
            i++;
        }
        return res;
    }
}
