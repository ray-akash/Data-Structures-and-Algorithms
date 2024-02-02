// Q. Find the pivot in Rotated Sorted Array with duplicate elements
// Constraints : arr.length > 1 ; as array must have at least one duplicate element.

public class FindPivotWDuplicates {
    public static void main(String[] args){
        int[] arr = {2, 2, 9, 2, 2, 2, 2, 2, 2, 2, 2, 2}; // sorted array rotated 3 times
        int pivotIndex = findPivot(arr);

        System.out.println(pivotIndex);
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

            // Decreasing the search area by 1 from both sides in case start, mid and end are equal
            if(arr[start] == arr[mid] && arr[mid] == arr[end]){
                // before ignoring the 'start', checking if it's the pivot
                if(arr[start] > arr[start+1])
                    return start;
                else
                    start++;

                // before ignoring the 'end', checking if it's the pivot
                if(arr[end] < arr[end-1])
                    return end-1;
                else
                    end--;
            }

            // Slightly modified conditions compared to findPivot() in Rotated Sorted Array with distinct values
            if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[end] < arr[mid]))
                start = mid+1;
            else    //if (arr[start] > arr[mid])
                end = mid-1;
        }
        // In case the sorted array is not rotated, -1 will be returned.
        return -1;
    }
}
