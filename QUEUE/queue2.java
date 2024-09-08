package QUEUE;
//circular queue
public class queue2 {
    static class queue{
        int arr[];
        int size;
        int rear;
        int front;

        //constructor
        queue(int x){
            this.size = x;
            arr = new int[x];
            rear = -1;
            front = -1;
        }
        boolean isEmpty(){
            return rear == -1 && front == -1; // True if both front and rear are -1
        }
        boolean isFull(){
            return (rear+1) % size == front; // if it shows the front as value that means the circular queue is full 
        }

        void add(int x){
            if (isFull()) {
                System.out.println("queue is full");
                return;
            }
            //imp if while adding the first element
            if (front == -1) {
                front = 0; // If adding the first element, set front to 0
            }
            // Move rear to the next position in a circular manner
            rear = (rear+1) % size;// (rear+1)%size if rear is 7 it will give ans as 1 and the new elemnt will be added at 1st position in array also the rear will be now at 1st position
            arr[rear] = x; 
             // If this is the first element, set front to 0
        }
        int remove(){
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            int y = arr[front]; // Store the element at the front of the queue
            if (front == rear) {
                front = rear = -1;//If there's only one element left, reset the queue
            } else {
                front = (front+1)%size;// Move front to the next position in a circular manner
         
            }
            return y;
        }
        int peek() {
            if(isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
           
            return arr[front];
        }
    }
 
    
    public static void main(String[] args) {
    queue q = new queue(5);


       q.add(1);
       q.add(2);
       q.add(3);
       q.add(4);
       q.add(5);
       System.out.println("removed : " + q.remove());
       q.add(6);
       System.out.println("removed : " + q.remove());
       q.add(7);
          System.out.println(q.isEmpty());
          System.out.println(q.isFull());
          System.out.println("the queue :");
       while(!q.isEmpty()) {
           System.out.println(q.remove());
       }

    }
}
