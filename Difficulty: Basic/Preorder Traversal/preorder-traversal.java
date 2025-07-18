class Solution {
    // Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root) {
        // write code here
        ArrayList<Integer> ans = new ArrayList<>();
        preOrder(root, ans);
        return ans;
    }
    public static void preOrder(Node root, List<Integer> ans){
        if(root == null) return;
        ans.add(root.data);
        preOrder(root.left, ans);
        preOrder(root.right, ans);
    }
}