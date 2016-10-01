/**
 * https://www.hackerrank.com/challenges/find-the-merge-point-of-two-joined-linked-lists
 */


/**
 * @author rakshith
 *
 */

/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    Node first, second;
    first = head;
    second = head;
    if(head == null || head.next == null){
        return false;
    }
    while(second != null && second.next != null){
        first = first.next;
        second = second.next.next;
        if(first == second){
            return true;
        }
    }
    return false;
}
