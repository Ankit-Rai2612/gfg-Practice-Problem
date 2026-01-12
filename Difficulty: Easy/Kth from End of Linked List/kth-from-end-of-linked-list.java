/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        // Your code here
         int len = 0, i;
      
        // Pointer to store the copy of head
        Node temp = head;

        // Count the number of nodes in Linked List
        while (temp != null) {
            temp = temp.next;
            len++;
        }

        // Check if value of N is not more than length of the linked list
        if (len < k)
            return -1;

        temp = head;

        // Get the (len - N + 1)th node from the beginning
        for (i = 1; i < len - k + 1; i++)
            temp = temp.next;

        return temp.data;
    }
}