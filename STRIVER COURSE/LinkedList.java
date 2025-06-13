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

    public static void printLL(Node head){
        // if (head == null) return null;
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void deleteTail(Node head){
        if (head == null || head.next == null) return;
        Node temp = head ;
            while (temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;
    }

    public static void deleteKthPostion(Node head, Node k){
        if (head == null || k == null) return;
        if (head == k) {
            head = head.next;
            return;
        }
        Node temp = head;
        if (k.next == null) {
            // deleteTail(head);
            while (temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;
            return;
        }
        while(temp.next != k){
            temp= temp.next;
        }
        temp.next = temp.next.next;
    }

    // Not for deleting tail node
    public static void deleteTheNode(Node n){
        if(n == null || n.next == null) return ;

        n.data = n.next.data;
        n.next = n.next.next;
    }

    public static Node deleteKthPostion2(Node head, int k){
        Node temp = head;
        Node prev = null;
        int count = 0;

        while(temp != null){
            if(count == k){
                if (prev == null) {
                    System.out.println("deleting head");
                    return head.next;  // return new head
                } else {
                    prev.next = temp.next;
                    return head; // head remains same
                }
            }
            count++;
            prev = temp;
            temp = temp.next;
        }
        return head; // If k is invalid
    }

    public static Node deleteTheNode(Node head, int e){
        if(head == null) return head;
        if(head.data == e) return head.next;
        Node temp = head;
        Node prev = null;
        while(temp != null){
            if(temp.data == e){
                prev.next = temp.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    public static Node insertHead(Node head, Node e){
        Node temp = head;
        head = e;
        head.next = temp;
        return head;
    }
    public static Node insertHead(Node head, int e){
        Node temp = new Node(e,head);
        return temp;
    }
    public static Node insertTail(Node head, Node e){
        // Node temp = head;
        // while(temp != null){
        //     if(temp.next == null){
        //         temp.next = e;
        //         return head;
        //     }
        //     temp = temp.next;
        // }
        // return head;

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = e;

        return head;
    }
    public static Node insertTail(Node head, int e){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(e);

        return head;
    }

    public static Node insertKthPostion(Node head, int e, int k){
        Node newNode = new Node(e);
        Node temp = head;
        int count = 0 ;   
        if(k == 1 ){
            newNode.next = temp;
            head = newNode;
            return head;
        }
        while(temp != null){
            count++;
            if(count == k-1){
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        } 

        return head;
    }
    
    public static Node insertBeforeVal(Node head, int val, int e){
        Node temp = head;
        Node newNode = new Node(e);
        if(head.data == val){
            newNode.next = temp; 
            head = newNode;
            return head;
        }
        
        while(temp != null){
            if(temp.next.data == val){
                newNode.next = temp.next;
                temp.next = newNode;
                return head;
            }
            temp = temp.next;
        }
        
        return head;
    }
    
    public static Node insertAfterVal(Node head, int val, int e){
        Node temp = head;
        Node newNode = new Node(e);
        while(temp != null){
            if(temp.data == val){
                newNode.next = temp.next;
                temp.next = newNode;
                return head;
            }
            temp = temp.next;
        }
        return head;
    }
    
     public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        // Node x = new Node(arr[3]);
        // Node y = new Node(arr[2], x);

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

        // System.out.println("Before:");
        // printLL(head);
        // deleteTail(head);
        // System.out.println("After:");
        // printLL(head);
        // deleteTail(head);
        // System.out.println("After:");
        // printLL(head);

        // System.out.println("Before:");
        // printLL(head);
        // Node k = head.next.next.next; // This is the 3rd position (0-indexed)
        // deleteKthPostion(head,k);
        // System.out.println("After deleting 4th position:");
        // printLL(head);
        
        // Node k = head.next.next.next; 
        // Node j = head.next.next; 
        // deleteTheNode(k);
        // deleteTheNode(j);
        // System.out.println("After deleting:");
        // printLL(head);


        // System.out.println("Before:");
        // printLL(head);

        // head = deleteKthPostion2(head, 3);
        // System.out.println("After deleting kth position:");
        // printLL(head);

        // head = deleteKthPostion2(head, 1);
        // System.out.println("After deleting kth position:");
        // printLL(head);

        // head = deleteKthPostion2(head, 0); // HEAD DELETE
        // System.out.println("After deleting kth position:");
        // printLL(head);
        // head = deleteKthPostion2(head, 1); // Tail DELETE
        // System.out.println("After deleting kth position:");
        // printLL(head);

        // System.out.println("Before:");
        // printLL(head);
        // head = deleteTheNode(head, 3);
        // System.out.println("After deleting kth position:");
        // printLL(head);
        // head = deleteTheNode(head, 1);
        // System.out.println("After deleting kth position:");
        // printLL(head);
        // head = deleteTheNode(head, 2); // HEAD DELETE
        // System.out.println("After deleting kth position:");
        // printLL(head);
        // head = deleteTheNode(head, 5); // Tail DELETE
        // System.out.println("After deleting kth position:");
        // printLL(head);

        // Node n = new Node(100);
        // Node h = insertHead(head, n);
        // printLL(h);

        // Node h = insertHead(head, 100);
        // printLL(h);
       
        // Node n = new Node(100);
        // Node h = insertTail(head, n);
        // printLL(h);
        // Node h = insertTail(head, 100);
        // printLL(h);
        
        // Node h2 = insertKthPostion(head, 100, 1);
        // printLL(h2);
        // Node h1 = insertKthPostion(h2, 200, 4);
        // printLL(h1);
        // Node h3 = insertKthPostion(h2, 300, 8);
        // printLL(h3);

        // Node h1 = insertBeforeVal(head, 1, 0);
        // printLL(h1);
        // Node h2 = insertBeforeVal(head, 3, 0);
        // printLL(h2);
        // Node h3 = insertBeforeVal(head, 5, 0);
        // printLL(h3);

        Node h1 = insertAfterVal(head, 1, 0);
        printLL(h1);
        Node h2 = insertAfterVal(head, 3, 0);
        printLL(h2);
        Node h3 = insertAfterVal(head, 5, 0);
        printLL(h3);

     } 
} 