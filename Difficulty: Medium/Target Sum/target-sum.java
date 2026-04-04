import java.util.*;

class Solution {
    public int totalWays(int[] arr, int target) {
        Map<String, Integer> dp = new HashMap<>();
        return findTargetSumWays(arr, target, 0, dp);
    }
    
    private int findTargetSumWays(int[] arr, int target, int index, Map<String, Integer> dp) {
        if (index == arr.length) {
            return target == 0 ? 1 : 0;
        }

        String key = target + "|" + index;
        if (dp.containsKey(key)) {
            return dp.get(key);
        }

        int add = findTargetSumWays(arr, target - arr[index], index + 1, dp);
        int subtract = findTargetSumWays(arr, target + arr[index], index + 1, dp);

        int ways = add + subtract;
        dp.put(key, ways);

        return ways;
    }
}