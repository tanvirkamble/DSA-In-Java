package LINKEDLIST;
//find a node from behind and delete it
public class linkedList3 {
    //    Constructor
    linkedList3(){
        size = 0;
    }
    Node head;
    public int size;
    public class Node{
       int data;
       Node next;

    //    Constructor
        Node(int x){
           this.data = x;
           this.next = null;
        }
    }

    public void addfirst(int x){
        Node addedNode = new Node(x);

        addedNode.next = head;
        head = addedNode;       // Update head to the new node
        size++;

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

    public void findNodeAndDelete (int x){
        Node tobeDeleted = new Node(x);
        if (head.next == null) {
            return;
        }

        if(tobeDeleted.data == head.data){
            head = head.next;
            size--;//since the first node is delted and size is reduced
            return; 
        }
        
        Node prev_ptf = head;

        // while (prev_ptf.next != null && prev_ptf.next.data != x) {
        //     prev_ptf = prev_ptf.next;
        // }
    

        int ptf = size - x ;//position to find

        int i = 0;

        while (i != ptf) {
            prev_ptf= prev_ptf.next;
            i++;
        }
        //now we found prev node so
        prev_ptf.next = prev_ptf.next.next;      

       return ;
    }
    
    public int findNodeAndPrint(int x){
    //    Node tobePrinted = new Node(x);
       if (head == null) {
        System.out.println("List is empty.");
        return -1; 
        }


        int positionFromStart = size - x + 1;
        if (positionFromStart < 0 || positionFromStart >= size) {

            System.out.println("Invalid position.");
            return -1; // Indicate that the position is invalid
        }

        Node currNode = head;
        int i = 0;
        while ( i < positionFromStart) {
            currNode = currNode.next;
            i++;
            System.out.print("i " +i);
            System.out.print(" currNode " + currNode.data);
            System.out.println();
            
        }
       
        
        return currNode.data;

    }

    public static void main(String[] args) {
        linkedList3 list = new linkedList3();
        list.addfirst(034);
        list.addfirst(123);
        list.addfirst(2);
        list.addfirst(32);
        list.addfirst(43);
        list.addfirst(54);
        list.addfirst(64);
        list.printList();
        
        
        int y = list.findNodeAndPrint(4 );
        System.out.println(y);
        
        list.findNodeAndDelete(3);
        list.printList();
    }
}