package DSA.LINKEDLIST;
//palindrome
public class linkedList4 {

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
    /*
    public Node findMiddle ( ){
        Node toFind = head;
        int postnOfMiddle = size/2;
        int i = 0;
        while (postnOfMiddle != i) {
            toFind = toFind.next;
            i++;
        }
        System.out.println("postion of middle from start is " + i + " and middle node is " + toFind.data);
        System.out.println("size is " + size);
        return toFind;
    }
    */

    public Node findMiddle (){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node reverse(Node x){
        // //usually for reversal
        // Node prevNode = head;
        // Node currNode = head.next;

        Node prevNode = null;
        Node currNode = x;

        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;

        }
        //usually for reversal
        // head.next = null;
        // head = prevNode;
        
        return prevNode;
    }
    
    

    public boolean ispalindrome(){
       if(head == null || head.next == null){
            return true;
       }

       Node middleNode = findMiddle(); // 1st half end
       Node secondHalfStart = reverse(middleNode.next);// middle .next is the new head for the other half string
       

       Node firstHalfStart = head;
       while (secondHalfStart != null) {
        System.out.println(firstHalfStart.data);
        System.out.println(secondHalfStart.data);
           if(firstHalfStart.data != secondHalfStart.data){
            return false;
           }

           firstHalfStart = firstHalfStart.next;
           secondHalfStart = secondHalfStart.next;
       }


        return true;
    }

    public static void main(String[] args) {
        linkedList4 list = new linkedList4();

        // Test with a palindrome list
        
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        
        //doesnt wprk w this list
        // list.addFirst(1);
        // list.addFirst(1);
        // list.addFirst(1);
        // list.addFirst(2);
        // list.addFirst(2);
        // list.addFirst(2);

        // list.addFirst(3);
        // list.addFirst(1);
        // list.addFirst(212);
        // list.addFirst(3);
        // list.addFirst(4);
        list.printList();
        
            /*
            list.findMiddle();
            System.out.println(list.head.data);
            list.reverse(list.head);
            System.out.println("Reversed List:");
            list.printList();//prints a node less 
            */


        boolean yes = list.ispalindrome();
        if (yes) {
            System.out.println("it is a palindrome");
        } else {
            System.out.println("its not a palindrome");
        }
    }
}
