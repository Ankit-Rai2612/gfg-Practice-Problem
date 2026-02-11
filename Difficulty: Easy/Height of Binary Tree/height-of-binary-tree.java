/*
class Node {
    int data;
    Node left, right;

    Node(int val)
    {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public int height(Node root) {
        // code here
        if (root == null)
            return -1;  // edges count kar rahe hain
        
        // Recursive calls
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        
        // Return maximum depth
        return Math.max(leftHeight, rightHeight) + 1;
    }
}