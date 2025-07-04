// User function Template for Java

class Solution {
    String removeDups(String s) {
        // code here
        boolean[] seen = new boolean[256];
        
        StringBuilder result = new StringBuilder();
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            
            if(!seen[ch]){
                result.append(ch);
                seen[ch]=true;
            }
        }
        return result.toString();
    }
}