class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
       int n = s.length();
        int i = 0, j = 0;
        int cnt = 0;
        int maxi = -1;
        int[] fre = new int[26];
        
        // cnt represents the number of 
        // unique characters in the current window

        while (j < n) {

            // include s[j] into the window
            fre[s.charAt(j) - 'a']++;

            // it is the first occurrence of 
            // this character in the window
            if (fre[s.charAt(j) - 'a'] == 1) cnt++;

            // shrink the window if the number of
            // unique character is more than k
            while (cnt > k) {
                fre[s.charAt(i) - 'a']--;

                // one unique character removed
                if (fre[s.charAt(i) - 'a'] == 0) cnt--;
                i++;
            }

            // we have exactly k unique characters
            if (cnt == k) {
                maxi = Math.max(maxi, j - i + 1);
            }

            j++;
        }

        return maxi;

    }
}
