class Solution {
    int maxLength(int arr[]) {
        // code here
        int n = arr.length;
        HashMap<Integer, Integer> firstSeen = new HashMap<>();
        int prefixSum = 0;
        int maxLen = 0;
        
        firstSeen.put(0, -1);
        
        for(int i=0; i<n; i++){
            prefixSum += arr[i];
            
            if(firstSeen.containsKey(prefixSum)){
                int prevIndex = firstSeen.get(prefixSum);
                int length = i - prevIndex;
                maxLen = Math.max(maxLen, length);
            }else{
                firstSeen.put(prefixSum, i);
            }
        }
        return maxLen;
    }
}