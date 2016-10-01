/**
 * https://www.hackerrank.com/challenges/delete-duplicate-value-nodes-from-a-sorted-linked-list
 */


/**
 * @author rakshith
 *
 */

/*
Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node RemoveDuplicates(Node head) {
  // This is a "method-only" submission. 
  // You only need to complete this method. 
    Node first, second;
    first = head;
    second = head.next;
    while(second != null){
        if(first.data != second.data){
            first.next = second;
            first = first.next;
            second = second.next;
        }else{
            second = second.next;
        }
    }
    first.next = second;
    return head;
}
