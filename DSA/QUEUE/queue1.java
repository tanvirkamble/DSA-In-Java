package QUEUE;

public class queue1 {
    static class queue {
         int arr[];
         int size;
         int rear;
        queue(int x){
            this.size = x;
            arr = new int[x];
            rear = -1;
        }
        
        boolean isEmpty(){
            return rear == -1;
        }

        boolean isFull(){
            return rear == size-1;
        }

        void add(int x){
            if (isFull()) {
                System.out.println("queue is full");
                return ;
            }
            arr[++rear] = x; // Pre-increment: increment rear first, then use it to insert at the correct index

        }

        int remove(){
            if (isEmpty()) {
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i+1];
            }
            rear--; // Decrease rear after removing an element to update the size
            return front;
        }
        
        
        int peek(){
            if (isEmpty()) {
                return -1;
            }
            int front = arr[0];
            return front;
        }
    }


    public static void main(String[] args) {
        queue q = new queue(5);
        q.add(0);
        q.add(1);
        q.add(2);
        q.add(3);
        // q.add(4);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
        
    }
}
