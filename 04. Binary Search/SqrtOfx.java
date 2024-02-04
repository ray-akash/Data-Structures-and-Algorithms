// 69. https://leetcode.com/problems/sqrtx/

class Solution {
    public int mySqrt(int x) {
        int start = 0;
        int end = 46340;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(mid*mid > x)
                end = mid-1;
            else if(mid*mid < x)
                start = mid+1;
            else
                return mid;
        }
        return end;
    }
}
