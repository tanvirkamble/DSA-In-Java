import java.util.*;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int d, Node n,Node p){
        this.data = d;
        this.next = n;
        this.prev = p;
    }
    Node(int d){
        this.data = d;
        this.next = null;
        this.prev = null;
    }
}

public class DoublyLinkedList {
    public static Node array2DLL(int arr[]){
        Node head = new Node(arr[0]);
        Node current = head;
        for(int i = 1; i < arr.length; i++){
            Node newNode = new Node(arr[i]);
            current.next = newNode;
            newNode.prev = current;
            current = newNode;
        }
        return head;
    }
    public static void printLL(Node head) {
    Node temp = head;
    while (temp != null) {
        String prevData = (temp.prev == null) ? "null" : String.valueOf(temp.prev.data);
        String nextData = (temp.next == null) ? "null" : String.valueOf(temp.next.data);
        System.out.print(temp.data + "(" + prevData + "," + nextData + ") ");
        temp = temp.next;
    }
    System.out.println();

}

public static Node DeleteHeadOfDLL(Node head){
    Node deletedNode = head;

    String prevData = (deletedNode.prev != null) ? String.valueOf(deletedNode.prev.data) : "null";
    String nextData = (deletedNode.next != null) ? String.valueOf(deletedNode.next.data) : "null";

    System.out.println("Deleted node: " + deletedNode.data +" (prev: " + prevData + ", next: " + nextData + ")");

    nextData = null;

    head = head.next;
    if (head != null) head.prev = null;  // Important line!



    return head;
}
public static Node DeleteTailOfDLL(Node head){
    Node temp = head;
    while(temp.next.next != null){
        temp = temp.next;
    }
    Node deletedNode = temp.next;

    String prevData = (deletedNode.prev != null) ? String.valueOf(deletedNode.prev.data) : "null";
    String nextData = (deletedNode.next != null) ? String.valueOf(deletedNode.next.data) : "null";

    System.out.println("Deleted node: " + deletedNode.data + " (prev: " + prevData + ", next: " + nextData + ")");
    prevData = null;
    System.out.println("Deleted node: " + deletedNode.data + " (prev: " + prevData + ", next: " + nextData + ")");

    temp.next = null;
    
    return head;
}

public static Node deleteAtKthPosition(Node head, int k){
    if(k == 0) {
        head = head.next;
        if (head != null) head.prev = null;  // Important line!
        return head;
    }
    Node temp = head;
    int c = 0;
    while(temp != null){
        // if( c == k-1){
        //     temp.next = temp.next.next;
        //     Node nextNode = temp.next  == null ? null : temp.next ;
        //     nextNode.prev = temp; 
        //     break;
        // }// doesnt work for last node

         if (c == k - 1 && temp.next != null) {
            Node toDelete = temp.next;
            temp.next = toDelete.next;
            if (toDelete.next != null) {
                toDelete.next.prev = temp;  // only if it's not null
            }
            break;
        }

        c++;
        temp = temp.next;
    } 

    return head;
}

private static Node insertBeforeHead(Node head, int e ){
    Node temp = head;
    Node newNode = new Node(e);
    
    temp.prev = newNode;
    newNode.next = temp;
    head = newNode;
    
    
    return head;
}
private static Node insertAfterHead(Node head, int e ){
    Node temp = head;
    Node newNode = new Node(e);

    Node afterHead = head.next;
    head.next = newNode;
    newNode.prev = head;
    newNode.next = afterHead;
    afterHead.prev = newNode;

    return head;
}

private static Node insertBeforeTail(Node head, int e){    
    Node temp = head;
    Node newNode = new Node(e);
    while(temp.next.next != null){
        temp = temp.next;
    }
    Node tail = temp.next;
    temp.next = newNode;
    newNode.prev = temp;
    newNode.next = tail;
    tail.prev = newNode;

        
    return head;
}
private static Node insertAfterTail(Node head, int e){    
    Node temp = head;
    Node newNode = new Node(e);

    while(temp.next != null){
        temp = temp.next;
    }
    Node tail = temp;
    tail.next = newNode;
    newNode.prev = tail;

    return head;
}

public static Node insertBeforeKthPostion(Node head, int val, int k){
    Node temp = head;
    Node newNode = new Node(val);

    if(k == 0){
        newNode.next = temp;
        temp.prev = newNode;
        head = newNode;
        return head;
    }
    
    int c = 0;

    while(temp != null){
        if(c == k-1){
            if(temp.next == null){
                break;
            }
            Node nexNode = temp.next;
            temp.next = newNode;
            newNode.prev = temp;
            newNode.next = nexNode;
            nexNode.prev = newNode;
            break;
        }
        c++;
        temp = temp.next;
    }
    return head;
}

private static Node insertAfterKthPostion(Node head, int val, int k){

    Node temp = head;
    Node newNode = new Node(val);
    
    if(k == 0){
        Node nexNode = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
        newNode.next = nexNode;
        nexNode.prev = newNode;
        return head;
    }

    int c = 0; 
    while( temp != null){
        if(c == k){
            if(temp.next == null){
                temp.next =  newNode;
                newNode.prev = temp;
                break;
            }
            Node nextNode = temp.next ;
            temp.next = newNode;
            newNode.prev = temp;
            newNode.next = nextNode;
            nextNode.prev = newNode;
            break;
        }
        c++;
        temp = temp.next;
    }
    return head;
}

private static Node reverseDLL(Node head){
    Node temp = head;
    Node newHead = null;
    while(temp != null){
        Node next = temp.next;
        temp.next = temp.prev;
        temp.prev = next;

        newHead = temp; // to keep track of new head which will be the tail
        temp = next;
    }

    return newHead;
}

private static Node reverseDLL2(Node head){

    ArrayList<Integer> arr = new ArrayList<>();
    Node temp = head;

    while(temp != null){
        arr.add(temp.data);
        temp = temp.next;
    }

    temp = head;
    int c = arr.size() - 1;

    while(temp != null){
        temp.data = arr.get(c);
        c--;
        temp = temp.next;
    }


    return head;
}
 public static Node reverseBetween(Node head, int left, int right) {
        ArrayList<Integer> arr = new ArrayList<>();
        Node temp = head;

        while(temp != null){
            arr.add(temp.data);
            temp = temp.next;
        }

        left = left - 1;
        right = right - 1;
        int subArraySize = right;
            // System.out.println(" left , right and mid : "+ left + "," + right + " and " + subArraySize );

        for(int i = left ; i <= subArraySize ; i++){
            if( i <= right ){

            int x = arr.get(i);
            arr.set(i,arr.get(right));
            arr.set(right,x);
            // System.out.println("arr at " + i + " and element " + arr.get(i));
            // System.out.println("arr at " + right + " and element " + arr.get(right));
            right--;
            } 
        }

        temp = head;
        int c = 0;

        while(temp != null && c < arr.size()){
            temp.data = (arr.get(c));
            c++;
            temp = temp.next;
        }

        return head;
}
public static Node reverseBetween2(Node head, int left, int right) {
        if (head == null || left == right) return head;

        Node dummy = new Node(0);
        dummy.next = head;// creates a node before head so incase of reversal from we get a node before head for our logic

        Node NodeBeforeLeftStart = dummy;
        for(int i = 1 ; i < left ; i++){
            NodeBeforeLeftStart = NodeBeforeLeftStart.next;
        }

        Node start = NodeBeforeLeftStart.next;
        Node temp = start;

        for(int i = 1 ; i < right-left + 1 ; i++){
            Node nextNode = temp.next;
            temp.next = nextNode.next;
            nextNode.next = NodeBeforeLeftStart.next;
            NodeBeforeLeftStart.next = nextNode;
        }

        /*
            📌 Dry Run: reverseBetween(head = [1, 2, 3, 4, 5], left = 2, right = 4)

            Goal: Reverse the sublist from position 2 to 4
            Initial: dummy → 1 → 2 → 3 → 4 → 5
                                ↑    ↑
                            NBL  temp & start

            🌀 Iteration 1:
            - nextNode = temp.next        → 3
            - temp.next = nextNode.next  → 2 → 4
            - nextNode.next = NBL.next   → 3 → 2
            - NBL.next = nextNode        → 1 → 3

            List after Iteration 1:
            dummy → 1 → 3 → 2 → 4 → 5
                            ↑    ↑
                            NBL  temp

            🌀 Iteration 2:
            - nextNode = temp.next        → 4
            - temp.next = nextNode.next  → 2 → 5
            - nextNode.next = NBL.next   → 4 → 3
            - NBL.next = nextNode        → 1 → 4

            List after Iteration 2:
            dummy → 1 → 4 → 3 → 2 → 5
                            ↑         ↑
                            NBL      temp

            ✅ Final List after reversal:
            [1, 4, 3, 2, 5]

            📌 Key Pointer Roles:
            - dummy: helper node before head
            - NBL (NodeBeforeLeftStart): node at position left-1 (acts as anchor)
            - start/temp: the node at 'left' (fixed during reversal)
            - nextNode: node being moved to the front of the reversed part
        */


        return dummy.next;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        Node head = array2DLL(arr);
        printLL(head);
        
        // Node h = DeleteHeadOfDLL(head);
        // printLL(h);
        // Node h = DeleteTailOfDLL(head);
        // printLL(h);
        // Node h = deleteAtKthPosition(head,0);
        // printLL(h);// 0 indexed
        
        
        // Node h = insertBeforeHead(head,100);
        // printLL(h);
        // Node h = insertAfterHead(head,100);
        // printLL(h);
        // Node h = insertBeforeTail(head,100);
        // printLL(h);
        // Node h = insertAfterTail(head,100);
        // printLL(h);
        // Node h = insertBeforeKthPostion(head,100,0);//0 indexed
        // printLL(h);
        // Node h = insertBeforeKthPostion(head,100,3);//0 indexed
        // printLL(h);
        // Node h = insertBeforeKthPostion(head,100,5);//0 indexed
        // printLL(h);
        // Node h = insertAfterKthPostion(head,100,0);//0 indexed
        // printLL(h);
        // Node h = insertAfterKthPostion(head,100,6);//0 indexed
        // printLL(h);
        // Node h = insertAfterKthPostion(head,100,3);//0 indexed
        // printLL(h);
        
        // Node h = reverseDLL(head);
        // printLL(h);
        // Node h = reverseDLL2(head);
        // printLL(h);
        // Node h = reverseBetween(head , 1 , 4);// in question u pass left and right as '1' based indexed i.e. starting from 1
        // printLL(h);
        Node h = reverseBetween2(head , 1 , 4);// in question u pass left and right as '1' based indexed i.e. starting from 1
        printLL(h);

    }
}
