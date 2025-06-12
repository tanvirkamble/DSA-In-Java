class Node {
    int data;
    Node next;

    Node (int d, Node n){
        this.data = d;
        this.next = n;
    }
    Node (int d){
        this.data = d;
        this.next = null;
    }
}

public class LinkedList {
    private static Node arrayToLL(int arr[]){
        if (arr.length == 0) return null;
        Node head = new Node(arr[0]);
        Node current = head;

        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }
        return head;
    }

    private static int count(Node head){
        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }

        return count;
    }

    public static boolean exist(Node head, int element) {
        if(head == null) return false;
        if(head.data == element ) return true;
        Node temp = head;
        while (temp != null ){
            if(temp.data == element) return true;
            temp = temp.next;
        }
        return false;
    }

    public static Node deleteHead(Node head){
        // Node temp = head;
        head = head.next;
        return head;
    }
     public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        Node x = new Node(arr[3]);
        Node y = new Node(arr[2], x);

        // System.out.println(x);
        // System.out.println(x.data);
        // System.out.println(y);
        // System.out.println(y.data);

        Node head = arrayToLL(arr);
        // System.out.println(head.data);

        // Node temp = head;
        // while (temp != null){
        //     System.out.println(temp.data);
        //     temp = temp.next;
        // }

      // 🔗 How Linked List Nodes Chain Together in Java:
            //
            // • Each Node is created like: new Node(data, next)
            //   → This means: store 'data' and a REFERENCE to the next Node.
            //
            // • So temp.next = new Node(3, y) means:
            //   → temp is linked to a node holding 3,
            //   → and that node points to another node 'y'.
            //
            // • This creates a recursive, nested structure:
            //   (1, (2, (3, (4, (5, null)))))
            //
            // • Visually, it's like a chain:
            //   head → [1] → [2] → [3] → [4] → [5] → null
            //
            // • At every step:
            //   currentNode.data = value
            //   currentNode.next = reference to the next node (or null)
            //
            // • Java uses *references*, not pointers — but they behave similarly:
            //   You don't need to manually allocate memory or handle addresses.
            //
            // TL;DR:
            // temp.next doesn’t *create* a chain — it *links* one node to the next.
            // You build the list step-by-step like a chain reaction 🚀

        // System.out.println("Count of nodes: " + count(head));

        // System.out.println("Does 3 exist? " + exist(head, 3));
        // System.out.println("Does 6 exist? " + exist(head, 6));

        // head = deleteHead(head);        
        // System.out.println("After deleting head, new head is: " + head.data);


        

     }
} 