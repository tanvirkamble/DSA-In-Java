package DSA.LINKEDLIST;
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

            Node newHead = recursiveReverse(head.next);
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
