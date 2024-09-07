package DSA.STACK;


public class stack2 {
   Node head;
   int size;

   class Node {
    int data;
    Node next;

    Node(int x){
        this.data = x;
        this.next = null;
    }
}
    boolean isempty(){
          if (head == null) {
            return true;
          }
          return false;
    }
    void push(int x){
        Node tobeadded = new Node(x);
        if (isempty()) {
            head = tobeadded;
            return ;
        }
        tobeadded.next = head;
        head = tobeadded;
        return;
    }
    int pop(){
        if (isempty()) {
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
    }
    int peek(){
        if (isempty()) {
            return -1;
        }
        return head.data;
    }


   public static void main (String args[]){
      stack2 s = new stack2();
      s.push(1);
      s.push(2);
      s.push(3);
      s.push(4);
      while (!s.isempty()) {
            System.out.println(s.peek());
            s.pop();
      }
   }
}
