class Solution {
    public boolean isPalinSent(String s) {
        // code here
        
        
        int len = s.length();
        StringBuilder str = new StringBuilder();
        for(int i=0; i<len; i++){
            if(Character.isLetterOrDigit(s.charAt(i)))
            str.append(Character.toLowerCase(s.charAt(i)));
        }
        
        
        String original = str.toString();
        String reversed = new StringBuilder(original).reverse().toString();
        
        return original.equals(reversed);
    }
}