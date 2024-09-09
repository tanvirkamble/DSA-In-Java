package LINKEDLIST;
import java.util.*;
/*Reverse a Linked List without using extra space.*/
public class linkedList2 {
    
    // Iterative Method : Space complexity - O(1) | Time complexity - O(n)

    Node head;
    int size;

    linkedList2(){
        size = 0;
    }

    public class Node{
          int data;
          Node next;

        Node(int x){
          this.data = x;
          this.next = null;
          size++;
        }

    }

        public void add(int x){
            Node newNode = new Node(x);
            //add the address of current node in the newNode next position linking it to the list
            newNode.next = head;
            //replpacing the newNOde as head making it intial node hence the first node
            head = newNode;
        }

    
        public void iterativeReverse (){
            if (head == null || head.next == null) {
                return;
            }

            Node prevNode = head;
            Node currNode = head.next;
            while (currNode != null) {
                Node nextNode = currNode.next;
                currNode.next = prevNode;

                // reassigning values
                prevNode = currNode;
                currNode = nextNode;
            }
            head.next = null;
            head = prevNode;
        }

        public void printList(){
            Node currNode = head;
            while (currNode != null){
                System.out.print(currNode.data + " -> ");
                currNode=currNode.next;//Move to the next node in the li
            }
            System.out.print("null");
            System.out.println();
        }

        // Recursive Method : Time complexity - O(n) | Space complexity - O(1) 
        public Node recursiveReverse(Node head){
            if (head == null || head.next == null) {
                return head;
            }

            Node newHead = recursiveReverse(head.next);//till last node
            head.next.next = head;
            head.next = null;
            return newHead;

        }        
        
        public static void main(String[] args) {
            
            linkedList2 list = new linkedList2();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
            
            System.out.println("iteravtive");
            list.printList();
            list.iterativeReverse();
            list.printList();        
            
            System.out.println("recursive");
            list.printList();
            list.head = list.recursiveReverse(list.head);
            list.printList();
            
       // collections Method : Time complexity - O(n) | Space complexity - O(1)  

       LinkedList<Integer> list2 = new LinkedList<>();
       list2.add(1);
       list2.add(2);

       System.out.println("using collectons");
       System.out.println(list2);
       Collections.reverse(list2);
       System.out.println(list2);

    }
    
}


/**
 * Reverses the linked list iteratively.
 * 
 * This method reverses the linked list by iterating through each node 
 * and changing the direction of the `next` pointers.
 * 
 * Algorithm:
 * 1. Start with two pointers: `prevNode` (initialized to the head) and `currNode` (initialized to the second node).
 * 2. Traverse the list while `currNode` is not null:
 *    - Save the next node (`nextNode`) for future traversal.
 *    - Reverse the `next` pointer of the current node to point to `prevNode`.
 *    - Move the `prevNode` and `currNode` pointers one step forward.
 * 3. After the loop, set the head's `next` to null (as it becomes the last node).
 * 4. Update the `head` pointer to the new head (`prevNode`).
 * 
 * Time Complexity: O(n), where n is the number of nodes in the list.
 * Space Complexity: O(1), since no extra space is used apart from a few pointers.
 */


/**
 * Reverses the linked list recursively.
 * 
 * This method reverses the linked list by breaking the problem into smaller sub-problems.
 * Each recursive call processes the remainder of the list after the current node, 
 * then reverses the link between the current node and the next node.
 * 
 * Algorithm:
 * 1. Base Case: If the list is empty or has only one node, return the current head as it is already reversed.
 * 2. Recursive Step: Call the function recursively for the next node (`head.next`) to reverse the rest of the list.
 * 3. Once the recursion starts returning:
 *    - Reverse the `next` pointer of the next node to point to the current node (`head.next.next = head`).
 *    - Set the current node's `next` to null to break the original link (`head.next = null`).
 * 4. Return the `newHead`, which is the last node in the original list and becomes the first node in the reversed list.
 * 
 * Time Complexity: O(n), where n is the number of nodes in the list.
 * Space Complexity: O(n) due to the recursive call stack.
 * 
 * @param head The head node of the linked list
 * @return The new head node of the reversed linked list
 */