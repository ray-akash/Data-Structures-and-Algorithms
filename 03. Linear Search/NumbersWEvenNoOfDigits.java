/*
*    1295. Find numbers with even number of digits
*    Given an array nums of integers, return how many of them contain an even number of digits.
*/

class Solution {
    public int findNumbers(int[] nums) {
        var counter = 0;
        for(var ele : nums)
            if((int)(Math.log10(ele)+1) %2 == 0) 
            counter++;

        return counter;
    }
}
