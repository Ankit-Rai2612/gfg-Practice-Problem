class Solution {
    // Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root) {
        // code here.
        return balanceChecked(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    private boolean balanceChecked(Node node, long min, long max){
        if(node == null) return true;
        
        if(node.data <= min || node.data >= max){
            return false;
        }
        
        return balanceChecked(node.left, min, node.data) && 
        balanceChecked(node.right, node.data, max);
    }
}