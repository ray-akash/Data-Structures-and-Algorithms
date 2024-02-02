// Find the #Rotation in RSA: https://www.geeksforgeeks.org/problems/rotation4723/1

class Solution {
    int findKRotation(int[] arr, int n) {
        int nRotation = findPivot(arr, n);
        
        if(nRotation == -1)
            return 0;
        else
            return nRotation+1;
    }
    
    public static int findPivot(int[] arr, int length){
        int start = 0;
        int end = length-1;
        
        while(start <= end){
            int mid = start+(end-start)/2;
            
            if(mid+1 <= end && arr[mid] > arr[mid+1])
                return mid;
            if(mid-1 >= start && arr[mid] < arr[mid-1])
                return mid-1;
                
            if(arr[start] <= arr[mid])
                start = mid+1;
            else
                end = mid-1;
        }
        return -1;
    }
}
