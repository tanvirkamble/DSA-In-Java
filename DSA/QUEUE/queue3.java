package QUEUE;

public class queue3 {
    static class Node{
        int data;
        Node next;
        Node(int x){
            this.data = x;
            this.next = null;
        }
    }
    static class queue {
        Node head = null;  // Head points to the front of the queue
        Node tail = null;  // Tail points to the end of the queue

        boolean isEmpty(){
            return head == null && tail == null;
        }

        // The queue can never be "full" in a linked list implementation unless memory is full
        
        void add(int x){
            Node tobeadded = new Node(x);

            // If the queue is empty, both head and tail point to the new node
            if (isEmpty()) {
                head = tail = tobeadded;
                return;
            }
            // Otherwise, add the new node after the current tail and update the tail
            else {
                tail.next = tobeadded;
                tail =tobeadded;
            }

        }

        int remove(){
            if (isEmpty()) {
                return -1;
            }
            int front = head.data;
            if(head == tail){
                System.out.println("emptied queue");
                tail = null;
            }
            // Move the head pointer to the next node (removing the front element)
            head = head.next;
            return front;
        }
        int peek() {
            if(isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
           
            return head.data;
        }
 
    }

    public static void main(String[] args) {
        queue q = new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
 
        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
   
    }
    
}
