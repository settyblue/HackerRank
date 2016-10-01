/**
 * https://www.hackerrank.com/challenges/get-the-value-of-the-node-at-a-specific-position-from-the-tail
 */


/**
 * @author rakshith
 *
 */
 
/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
int GetNode(Node head,int n) {
    Node fwdNode, returnNode;
    fwdNode = head;
    returnNode = head;
    int count = 0;
    while(fwdNode != null){
        if(count <= n){
            fwdNode = fwdNode.next;
            count++;
        }else{
            fwdNode = fwdNode.next;
            returnNode = returnNode.next;
            count++;
        }
    }
    return returnNode.data;
}
