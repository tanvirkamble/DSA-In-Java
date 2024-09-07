package DSA.STACK;
import java.util.*;

public class stack4 {
    static void pushToBottom(int x ,Stack<Integer> s){
        if (s.isEmpty()) {
            s.push(x);
            return;
        }
         int top = s.pop();
         pushToBottom(x,s);
         s.push(top);

    }
    static void reverse(Stack<Integer> s){
        if (s.isEmpty()) {
            return;
        }
         int top = s.pop();
         reverse(s);
         //s.push(top); // This will add elements to the top of the stack in the original order

         pushToBottom(top,s);// this will reverse the order
    }
    
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(0);
        s.push(1);
        s.push(2);
        System.out.println(s);
        reverse(s);
        System.out.println(s);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
      
    }
}
