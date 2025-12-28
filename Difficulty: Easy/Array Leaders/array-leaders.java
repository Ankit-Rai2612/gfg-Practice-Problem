class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> leaders = new ArrayList<>();
        int maxFromRight = arr[arr.length-1];
        leaders.add(maxFromRight);
        
        for(int i=arr.length-2; i>=0; i--){
            if(arr[i] >= maxFromRight){
                leaders.add(arr[i]);
                
                maxFromRight = arr[i];
            }
        }
        Collections.reverse(leaders);
        return leaders;
    }
}
