/*
*  1672. Richest Customer Wealth
*  You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ 
*  customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
*
*  A customer's wealth is the amount of money they have in all their bank accounts. The richest 
*  customer is the customer that has the maximum wealth.
*/

class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for(int[] arr : accounts)
            if(arrSum(arr) > max)
                max = arrSum(arr);

        return max;
    }
    
    static int arrSum(int[] arr){
        int sum = 0;
        for(int ele:arr)
            sum += ele;

        return sum;
    }
}
