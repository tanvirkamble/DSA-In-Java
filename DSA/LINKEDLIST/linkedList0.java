package LINKEDLIST;

public class linkedList0{

    Node head;
    private int size;

    //Constructor: 
    linkedList0() {
        size =0;
    }

    public class Node{
        String data;
        Node next;

        //Constructor: 
        Node(String x){
            this.data = x;
            this.next = null;
            size++;
        }
    }

            public void addFirst(String x){
                Node newNode = new Node(x);
                //add the address of current node in the newNode next position linking it to the list
                newNode.next = head; // Link newNode to the current head

                //replpacing the newNOde as head making it intial node hence the first node
                head = newNode;// Update head to newNode
            }

            public void addLast(String x){
                Node newNode = new Node(x);
                if (head == null) {
                    System.out.println("empty list");
                    return;
                }
                Node lastNode = head;
                while (lastNode.next != null) {
                    lastNode = lastNode.next;//Move to the next node in the li
                }

                lastNode.next = newNode;
            }

            public void addInMid(int i,String x){
                Node newNode = new Node(x);

                if(i > size || i < 0){
                    System.out.println("invalid i (index) value");
                    return;
                }

                if (i == 0) {
                    newNode.next = head;
                    head = newNode;
                    return;
                }

                Node currNode = head;
                for (int j = 1; j < i; j++) {
                    currNode = currNode.next;
                }
                
                newNode.next = currNode.next;
                currNode.next = newNode;

            }

            public void removeFirst(){
                
                if (head == null) {
                    System.out.println("Empty List, nothing to delete");
                    return;
                }
                head = this.head.next;//This line updates the head to point to the second node in the list (this.head.next). Now the ealier head has no connection to this list as its head is empty
                size--;//Decrease the size of the list by 1 because a node will be removed.
            }

            public void removeLast(){
                    
                if (head == null) {
                    System.out.println("Empty List, nothing to delete");
                    return;
                }

                size--;//Decrease the size of the list by 1 because a node will be removed.

                // If the list has only one node (head.next is null), the list will become empty after removing this node. So, set head to null and exit the method using return;.                
                if (head.next == null) {
                    head = null;
                    return;
                }
        
                Node currNode = head;
                Node lastNode = head.next;
                while (lastNode.next != null) {
                    currNode = currNode.next;//keeps track of the second-last node.
                    lastNode = lastNode.next;//keeps track of the last node.
                }
        
                currNode.next = null;

            }

            public int getSize(){
                return size;
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

            public static void main(String[] args) {
                linkedList0 list = new linkedList0();

                list.addFirst("this");
                list.addFirst("hi");
                list.printList();
                System.out.println("Size: " + list.getSize());
                
                list.addLast("is");
                list.addLast("a");
                list.addLast("list");
                list.printList();
                System.out.println("Size: " + list.getSize());

                list.addInMid(2, "new");
                list.printList(); // Output: this -> is -> new -> a -> list -> null
                System.out.println("Size: " + list.getSize()); // Output: Size: 5

                list.removeFirst();
                list.printList(); // Output: is -> new -> a -> list -> null
                System.out.println("Size: " + list.getSize());

                list.removeLast();
                list.printList(); // Output: is -> new -> a -> null
                System.out.println("Size: " + list.getSize());



            }
}
