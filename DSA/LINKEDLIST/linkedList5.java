package DSA.LINKEDLIST;

public class linkedList5 {
    
    Node head;
    public int size;

    public class Node {
       int data;
       Node next;
       Node(int x){
        this.data = x;
        this.next = null;

       }
    }
    
    public void addFirst(int x){
        Node tobeAdded = new Node(x);

        tobeAdded.next = head;
        head = tobeAdded;
        size++;

    }

    public void printList(){
        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + " -> ");      
            currNode= currNode.next;      
        }
        System.out.println("null");
        System.out.println();
    }

    public boolean hasCycle(){

        if (head == null) {
            return false;
        }

        Node slow = head;
        Node fast = head;
        
        while (fast != null && fast.next != null) {
            
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                return true;
            }
        }

        return false;

    }

    public void removeCycle(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            fast=fast.next.next;
            slow= slow.next;
            if (slow == fast) {
                break;
            }
        }

        if (fast == null || fast.next == null) {
            return;
        }

        //to find start of cycle
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        Node cycleStart = slow;
        Node cycleNext = cycleStart;

        while (cycleNext != cycleStart) {
            cycleNext = cycleNext.next;
        }
       cycleNext.next = null;
    }

    public static void main(String[] args) {
        linkedList5 list = new linkedList5();
    
        // Test case 1: List without a cycle
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(4);
        list.addFirst(4);
        list.addFirst(4);
        list.printList();
        
        // Check if the list has a cycle
        boolean hasCycle = list.hasCycle();
        System.out.println("list 1");    
        System.out.println("List has a cycle: " + hasCycle);

        list.removeCycle();
        list.printList();


    
        // Test case 2: List with a cycle
        // Reset the list
        list = new linkedList5();
        Node first = list.new Node(1);
        Node second = list.new Node(2);
        Node third = list.new Node(3);
        Node fourth = list.new Node(4);
        Node fifth = list.new Node(4);
        Node sixth = list.new Node(4);
        Node seventh = list.new Node(4);
    
        list.head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
        seventh.next = second; // Creating a cycle here
    
        // dont print this test list as it is an infinite loop
        System.out.println("list 2");    
        // Check if the list has a cycle
        hasCycle = list.hasCycle();
        System.out.println("List has a cycle: " + hasCycle);

          // Remove the cycle
          list.removeCycle();

          // Check again if the list has a cycle
          hasCycle = list.hasCycle();
          System.out.println("List has a cycle after removal: " + hasCycle);
  
          // Print the list to verify it's no longer cyclic
          list.printList();
    }
}
