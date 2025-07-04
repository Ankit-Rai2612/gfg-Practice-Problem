class Solution {
    // Function to reverse words in a given string
    public String reverseWords(String s) {
        // Code here
        String[] arr = s.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder();
        
        for(int i=arr.length-1; i>=0; i--){
            reversed.append(arr[i]);
            if(i != 0){
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }
}
