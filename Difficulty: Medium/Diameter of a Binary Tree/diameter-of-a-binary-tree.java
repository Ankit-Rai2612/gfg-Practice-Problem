/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    int ans=0;
    int diameter(Node root) {
        // Your code here
        binary(root);
        return ans;
    }
    public int binary(Node root){
        if(root == null) return 0;
        
        int left=binary(root.left);
        int right=binary(root.right);
        
        ans=Math.max(ans, left+right);
        
        return Math.max(left, right)+1;
    }
}