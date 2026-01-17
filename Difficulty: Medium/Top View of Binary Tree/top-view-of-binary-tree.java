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
    public ArrayList<Integer> topView(Node root) {
        // code here
         ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) return ans;

        // Queue for level order traversal storing node and horizontal distance
        Queue<NodeHd> q = new LinkedList<>();
        q.add(new NodeHd(root, 0));

        // Map to store first node at each horizontal distance
        Map<Integer, Integer> mp = new HashMap<>();
        int minHd = Integer.MAX_VALUE;

        while (!q.isEmpty()) {
            NodeHd temp = q.poll();
            Node node = temp.node;
            int hd = temp.hd;
            minHd = Math.min(minHd, hd);

            // store the first node encountered at this horizontal distance
            if (!mp.containsKey(hd)) {
                mp.put(hd, node.data);
            }

            if (node.left != null) q.add(new NodeHd(node.left, hd - 1));
            if (node.right != null) q.add(new NodeHd(node.right, hd + 1));
        }

        // convert map to list in order from leftmost to rightmost
        int maxHd = Integer.MIN_VALUE;
        for (int key : mp.keySet()) {
            maxHd = Math.max(maxHd, key);
        }

        for (int i = minHd; i <= maxHd; i++) {
            ans.add(mp.get(i));
        }

        return ans;
    }
}