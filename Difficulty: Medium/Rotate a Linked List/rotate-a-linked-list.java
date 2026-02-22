/*
class Node {
    int data;
    Node next;

    Node(int d){
        data=d;
        next=null;
   }
}
*/

class Solution {
    public Node rotate(Node head, int k) {
        // code here
        if (k == 0 || head == null)
            return head;

        Node curr = head;
        int len = 1;
      
        // find the length of linked list
        while (curr.next != null) {
            curr = curr.next;
            len += 1;
        }

        // modulo k with length of linked list to handle
        // large values of k
        k %= len;
      
        if (k == 0)
            return head;
      
      	// make the linked list circular
        curr.next = head;

        // traverse the linked list to find the kth node
        curr = head;
        for (int i = 1; i < k; i++)
            curr = curr.next;

        // update the (k + 1)th node as the new head
        head = curr.next;
      
        // break the loop by updating next pointer
        // of kth node
        curr.next = null;
        return head;
    }

    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data);
            if(node.next != null){
                System.out.print(" -> ");
            }
            node = node.next;
        }
        System.out.println();

    }
}