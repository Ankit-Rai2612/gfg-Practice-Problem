class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // code here
        Map<String,ArrayList<String>> anagramMap = new HashMap<>();
        
        for(String word:arr){
            char[] charArray=word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord=new String(charArray);
            
            anagramMap.computeIfAbsent(sortedWord, k->new ArrayList<>()).add(word);
        }
        return new ArrayList<>(anagramMap.values());
    }
}
