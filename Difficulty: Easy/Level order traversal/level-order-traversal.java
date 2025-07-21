/*
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        // Your code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            int levelsize = queue.size();
            ArrayList<Integer> level = new ArrayList<>();
            
            for(int i=0; i<levelsize; i++){
                Node curr = queue.poll();
                level.add(curr.data);
                
                if(curr.left != null)queue.add(curr.left);
                if(curr.right!= null)queue.add(curr.right);
            }
            ans.add(level);
        }
        return ans;
    }
    
}