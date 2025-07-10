import java.util.*;

class Solution {
    // TrieNode definition
    static class TrieNode {
        Map<Character, TrieNode> children = new HashMap<>();
        boolean isEndOfWord = false;
    }

    // Function to insert word into the Trie
    public void insert(TrieNode root, String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            node.children.putIfAbsent(c, new TrieNode());
            node = node.children.get(c);
        }
        node.isEndOfWord = true;
    }

    // Function to check if all prefixes of word are present in the Trie
    public boolean areAllPrefixesPresent(TrieNode root, String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (!node.children.containsKey(c)) {
                return false;
            }
            node = node.children.get(c);
            // If it's not the end of a word at any point, return false
            if (!node.isEndOfWord && i < word.length() - 1) {
                return false;
            }
        }
        return true;
    }

    // Function to find the longest string with all prefixes
    public String longestString(String[] words) {
        TrieNode root = new TrieNode();
        for (String word : words) {
            insert(root, word);
        }
        
        String longest = "";
        for (String word : words) {
            // Check if all prefixes of word are present in the Trie
            if (areAllPrefixesPresent(root, word)) {
                // If this word is longer or lexicographically smaller, update the result
                if (word.length() > longest.length() || 
                    (word.length() == longest.length() && word.compareTo(longest) < 0)) {
                    longest = word;
                }
            }
        }
        return longest;
    }
}
