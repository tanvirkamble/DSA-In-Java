package STACK;

class stack1 {
    static Node head;
    int size;
    
    class Node {
       int data;
       Node next;

       //constructor
       Node(int x){
        this.data = x;
        this.next = null;
       }
    }
   
  
    boolean isempty(){
        return head == null;
    }
    void push(int x){
        Node tobePushed = new Node(x);
        if (isempty()) {
            head = tobePushed;
            return ;
        }
        
      
        tobePushed.next = head;
        head = tobePushed;
        return;
         
    }
    
    int pop(){
        if (isempty()) {
            return -1;
        }
        int top = head.data;
        head = head.next;

        return top ;

    }
    int peek(){
        if (isempty()) {
            return -1;
        }
        return head.data;
    }
    // just to check the reel order of list before poping
    void printList(){
        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + " -> ");      
            currNode= currNode.next;      
        }
        System.out.println("null");
        System.out.println();
    }
    

    public static void main (String args[]){
          stack1 s = new stack1();
          s.push(0);
          s.push(1);
          s.push(2);
         s.printList(); 
        
            while (!s.isempty()) {
                System.out.println(s.peek());
                s.pop();
            }

          s.pop();         
    }
}
