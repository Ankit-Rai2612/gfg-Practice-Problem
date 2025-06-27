class Solution {
    int majorityElement(int arr[]) {
        // code here
        Map<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        int majorityElement=n/2;
        
        // ArrayList<Integer> result = new ArrayList<>();
        
        for(int nums : arr){
            map.put(nums,map.getOrDefault(nums, 0) + 1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue() > majorityElement){
            return entry.getKey();
            }
        }
        return -1;
    }
}