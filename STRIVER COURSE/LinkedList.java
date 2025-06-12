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
     public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        Node x = new Node(arr[3]);
        Node y = new Node(arr[2], x);

        System.out.println(x);
        System.out.println(x.data);
        System.out.println(y);
        System.out.println(y.data);

     }
}