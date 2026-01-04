/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> leftView(Node root) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        leftView(root, 0, result);
        return result;
        
    }
    static void leftView(Node root, int level, ArrayList<Integer> result){
        if(root == null) return;
        
        if(level == result.size()){
            result.add(root.data);
        }
        leftView(root.left, level+1, result);
        leftView(root.right, level+1, result);
    }
}