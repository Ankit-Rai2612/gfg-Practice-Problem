class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        int n = arr.length;
        int low = 0, high = n - 1;

        while (low <= high) {

            // Case 1: array already sorted
            if (arr[low] <= arr[high]) {
                return low;
            }

            int mid = low + (high - low) / 2;
            int prev = (mid - 1 + n) % n;
            int next = (mid + 1) % n;

            // Case 2: mid is minimum
            if (arr[mid] <= arr[prev] && arr[mid] <= arr[next]) {
                return mid;
            }

            // Case 3: left part sorted, go right
            if (arr[low] <= arr[mid]) {
                low = mid + 1;
            }
            // Case 4: right part sorted, go left
            else {
                high = mid - 1;
            }
        }
        return 0;
    }
}