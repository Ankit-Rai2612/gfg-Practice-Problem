/* A Binary Tree node

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer> answer = new ArrayList<>();
        inorder(root, answer);
        return answer;
    }
    public void inorder(Node root, List<Integer> answer){
        if(root == null) return;
        
        inorder(root.left, answer);
        answer.add(root.data);
        inorder(root.right, answer);
    }
}