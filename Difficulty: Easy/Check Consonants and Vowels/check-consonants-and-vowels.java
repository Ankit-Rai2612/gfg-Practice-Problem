class Solution {

    static void checkString(String s) {
        int v = 0;
        int c = 0;

        // code here
        for(char ch : s.toCharArray()){
            if("aeiouAEIOU".indexOf(ch) != -1){
                v++;
            }else if(Character.isLetter(ch)){
                c++;
            }
        }
        if(v > c){
            System.out.print("Yes");
        }else if(v < c){
            System.out.print("No");
        }else{
            System.out.print("Same");
        }
        System.out.println();
    }
}