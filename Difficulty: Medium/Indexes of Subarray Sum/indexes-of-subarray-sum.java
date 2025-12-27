
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        int n = arr.length;
        int currSum = 0;
        int start = 0;
        ArrayList<Integer> result = new ArrayList<>();
        for(int end=0; end<n; end++){
            currSum += arr[end];
            while(currSum > target && start <= end){
                currSum -= arr[start];
                start++;
            }
            if(currSum == target){
                result.add(start + 1);
                result.add(end + 1);
                return result;
            }
        }
        result.add(-1);
        return result;
    }
}
