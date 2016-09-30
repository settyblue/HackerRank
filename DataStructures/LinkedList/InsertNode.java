/**
 * https://www.hackerrank.com/challenges/insert-a-node-into-a-sorted-doubly-linked-list
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
     Node prev;
  }
*/

Node SortedInsert(Node head,int data) {
    if(head == null){
        Node temp = new Node();
        temp.data = data;
        temp.next = null;
        temp.prev = null;
        return temp;
    }
    Node storeHead = head;
    Node temp = head;
    Node prevTemp = head;
    Node node = new Node();
    node.data = data;
    while(temp != null){
        if(temp.data < data){
            prevTemp = temp;
            temp = temp.next;
            continue;
        }else{
            node.next = temp;
            node.prev = temp.prev;
            temp.prev = node;
            node.prev.next = node;
            if(node.prev == null)return node;
            else return storeHead;
        }
    }
    prevTemp.next = node;
    node.prev = prevTemp;
    return storeHead;
}
