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
    head = head.next;
    if (head != null) head.prev = null;  // Important line!

    return head;
}
public static Node DeleteTailOfDLL(Node head){
    Node temp = head;
    while(temp.next.next != null){
        temp = temp.next;
    }
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

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        Node head = array2DLL(arr);
        printLL(head);
        
        // Node h = DeleteHeadOfDLL(head);
        // printLL(h);
        // Node h = DeleteTailOfDLL(head);
        // printLL(h);
        Node h = deleteAtKthPosition(head,5);
        printLL(h);

    }
}
