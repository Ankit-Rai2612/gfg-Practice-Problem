/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) {
        // code here
         Node newNode = new Node(x);

        // If the Linked List is empty, make
        // the new node as the head and return
        if (head == null) {
            return newNode;
        }

        // Store the head reference in a temporary variable
        Node last = head;

        // Traverse till the last node
        while (last.next != null) {
            last = last.next;
        }

        // Change the next pointer of the last node 
        // to point to the new node
        last.next = newNode;

        // Return the head of the list
        return head;
    }

    // This function prints the contents 
    // of the linked list starting from the head
    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data);
            if (node.next != null) {
                System.out.print(" -> ");
            }
            node = node.next;
        }
        System.out.println();
    }
}