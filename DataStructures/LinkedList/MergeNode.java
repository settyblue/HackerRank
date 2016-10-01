/**
 * https://www.hackerrank.com/challenges/find-the-merge-point-of-two-joined-linked-lists
 */


/**
 * @author rakshith
 *
 */

/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int FindMergeNode(Node headA, Node headB) {
    // Complete this function
    // Do not write the main method. 
    int size1 = 0;
    int size2 = 0;
    Node temp = headA;
    while(temp != null){
        temp = temp.next;
        size1++;
    }
    temp = headB;
    while(temp != null){
        temp = temp.next;
        size2++;
    }
    
    int n = size2 - size1;
    int i = 0;
    if(size1 < size2){
        temp = headB;
        while(i<n){
            temp = temp.next;
            i++;
        }
        Node temp2 = headA;
        int count = 0;
        while(temp != temp2){
            temp = temp.next;
            temp2 = temp2.next;
            count++;
        }
        return temp.data;
    }else{
        temp = headA;
        while(i<n){
            temp = temp.next;
            i++;
        }
        Node temp2 = headB;
        int count = size1 - size2;
        while(temp != temp2){
            temp = temp.next;
            temp2 = temp2.next;
            count++;
        }
        return temp.data;
    }
}