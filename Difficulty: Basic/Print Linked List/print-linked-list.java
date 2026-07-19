/*
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public ArrayList<Integer> printList(Node head) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();

        solve(head, list);

        return list;
    }

    void solve(Node head, ArrayList<Integer> list) {

        if (head == null)
            return;

        list.add(head.data);

        solve(head.next, list);
    }
}