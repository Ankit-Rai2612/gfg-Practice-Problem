class Solution {

    public int peakElement(int[] arr) {
        // code here
         int low = 0, high = arr.length - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            // Check if mid is a peak
            if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == arr.length - 1 || arr[mid + 1] <= arr[mid])) {
                return mid;
            }
            // If left is greater, move to the left side
            else if (mid > 0 && arr[mid - 1] > arr[mid]) {
                high = mid - 1;
            }
            // If the right is greater, move to the right side
            else {
                low = mid + 1;
            }
        }
        
        return -1; 
    }
}