/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public boolean isPalindrome(Node head) {
        // code here
        Node[] start = new Node[]{head};

        // Recursively check the ll and return
        return isPalindromeRecur(head, start);
    }
    static boolean isPalindromeRecur(Node end, Node[] start) {

        // base case
        if (end == null) return true;

        // Recursively check the right side.
        boolean right = isPalindromeRecur(end.next, start);

        // Compare the start and end nodes.
        boolean ans = right && start[0].data == end.data;

        // Update the start node 
        start[0] = start[0].next;

        return ans;
    }
}