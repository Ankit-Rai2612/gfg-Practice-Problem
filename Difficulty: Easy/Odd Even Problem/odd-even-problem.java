
class Solution {
    public static String oddEven(String s) {
        // code here
        int[] freq = new int[26];
        
        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }
        int count = 0;
        for(int i=0; i<26; i++){
            if(freq[i] > 0){
                int position = i + 1;
                
                if((position % 2 == 0 && freq[i] % 2 == 0) ||
                (position % 2 == 1 && freq[i] % 2 == 1)){
                    count++;
                }
            }
        }
        return (count % 2 == 0) ? "EVEN" : "ODD";
    }
}
