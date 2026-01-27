/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {

    int getLength(Node head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }

    int getMiddle(Node head) {
        int length = getLength(head);
        int midIndex = length / 2;

        while (midIndex > 0) {
            head = head.next;
            midIndex--;
        }

        return head.data;
    }
}
