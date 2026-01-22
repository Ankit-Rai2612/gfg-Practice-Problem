/*
class Node
{
    int data;
    Node next;
}
*/

class Solution {
    public static void removeLoop(Node head) {
        // code here
        HashSet<Node> st = new HashSet<>();
        // pointer to prev node
        Node prev = null;
        while (head != null) {
            // if node not present in the map,
            // insert it in the map
            if (!st.contains(head)) {
                st.add(head);
                prev = head;
                head = head.next;
            }
            // if present, it is a cycle, make
            // last node's next pointer NULL
            else {
                prev.next = null;
                break;
            }
        }
    }
}