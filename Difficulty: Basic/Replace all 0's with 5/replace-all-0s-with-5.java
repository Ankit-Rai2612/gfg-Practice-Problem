class Solution {
    public int convertFive(int n) {
        // code here
        String str = String.valueOf(n);
        char[] chars = str.toCharArray();
        for(int i = 0;i<str.length();i++){
            if(chars[i] == '0'){
                chars[i] = '5';
            }
        }
        String str1 = String.valueOf(chars);
        int number = Integer.parseInt(str1);
        return number;
    }
}