class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
          
            // If the current element is equal to 
            // target, increment the result
            if (arr[i] == target)
                res++;
        }
      
        return res;
    }
}
