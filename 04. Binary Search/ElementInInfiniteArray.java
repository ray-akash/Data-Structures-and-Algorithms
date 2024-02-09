/*
*   Q. Find the element in infinite sorted array
*/

public class PosOfEleInInfArr {
    public static void main(String[] args){
        int[] arr = {-67, -50, -38, -38, -19, -1, -1, 0, 1, 1, 2, 2, 2, 2, 2, 3, 4, 4, 4, 5, 6, 6, 7, 7, 7, 7, 7, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 11, 11, 12, 13, 14, 14, 15, 15, 15, 15, 15, 15, 16, 17, 17, 18, 19, 20, 20, 20, 21, 22, 22, 22, 22, 22, 23, 24, 25, 26, 27, 27, 27, 27, 28, 28, 29, 30, 30, 30, 30};
        int start = 0;
        int end = 1;
        int target = 9;

        // Finding the starting and ending index of the chunk in infinite array where target is present.
        while(arr[end] < target){
            start = end+1;
            end *= 2;
        }

        // Applying Binary Search on that chunk to find the target.
        int index = binarySearch(arr, target, start, end);
        if(index == -1)
            System.out.println(target+ " is not present in infinite array.");
        else
            System.out.println(target+ " is found at index "+ index+ ".");
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target < arr[mid])
                end = mid-1;
            else if(target > arr[mid])
                start = mid+1;
            else
                return mid;
        }
        return -1;
    }
}
