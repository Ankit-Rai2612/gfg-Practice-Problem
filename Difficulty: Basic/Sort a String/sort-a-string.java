// User function Template for Java
class Solution {
    String sort(String s) {
        // code here
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        
        String sorted = new String(charArray);
        
        return sorted;
    }
}