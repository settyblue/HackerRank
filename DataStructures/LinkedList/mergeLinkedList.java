/**
 * https://www.hackerrank.com/challenges/merge-two-sorted-linked-lists
 */


/**
 * @author rakshith
 *
 */
 
/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node MergeLists(Node headA, Node headB) {
     // This is a "method-only" submission. 
     // You only need to complete this method 
    Node head,temp;
    if(headA == null){
        return headB;
    }
    if(headB == null){
        return headA;
    }
    
    if(headA.data < headB.data){
        head = headA;
        temp = head;
        headA = headA.next;
    }else{
        head = headB;
        temp = head;
        headB = headB.next;
    }
    
    while(headA != null && headB != null){
        if(headA.data < headB.data){
            temp.next = headA;
            temp = temp.next;
            headA = headA.next;
        }else{
            temp.next = headB;
            temp = temp.next;
            headB = headB.next;
        }
    }
    
    if(headA == null){
        temp.next = headB;
    }else{
        temp.next = headA;
    }
    
    return head;
}
