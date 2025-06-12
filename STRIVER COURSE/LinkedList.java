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

        Node temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }

     }
} 