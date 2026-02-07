class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        if (arr.length == 0) return 0;
        Arrays.sort(arr); // Sorting the array

        int result = 1, count = 1;
        for (int i = 1; i < arr.length; i++) {

            // Skip duplicates
            if (arr[i] == arr[i - 1])
                continue;

            // Check if the current element is equal
            // to previous element + 1
            if (arr[i] == arr[i - 1] + 1) {
                count++;
            }
            else {
                // Reset the count
                count = 1;
            }

            // Update the result
            result = Math.max(result, count);
        }
        return result;
    }
}