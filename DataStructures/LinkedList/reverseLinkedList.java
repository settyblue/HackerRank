/**
 * https://www.hackerrank.com/challenges/reverse-a-linked-list
 */


/**
 * @author rakshith
 *
 */
 
/*
  Reverse a linked list and return pointer to the head
  The input list will have at least one element  
  Node is defined as  
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 
Node Reverse(Node head) {
    if(head == null || head.next == null){
        return head;
    }
    
    Node temp1 = head;
    Node temp2 = head.next;
    while(head.next != null){
        head.next = head.next.next;
        temp2.next = temp1;
        temp1 = temp2;
        temp2 = head.next;
    }
    return temp1;
}