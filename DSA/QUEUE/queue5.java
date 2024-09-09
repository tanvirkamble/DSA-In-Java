package QUEUE;
import java.util.*;;

public class queue5 {
    static class queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        boolean isempty(){
            return s1.isEmpty();
        }

        void add(int x){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(x);
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }
        int Remove() {
            return s1.pop();
        }
 
 
        int Peek() {
            return s1.peek();
        }
 
    }

    public static void main(String[] args) {
        queue q = new queue();
        q.add(1);
        q.add(2);
        q.add(3);
 
 
        while(!q.isempty()) {
            System.out.println(q.Peek());
            q.Remove();
        }
 
    }
}
