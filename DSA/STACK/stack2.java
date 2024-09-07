package DSA.STACK;

import java.util.*;

public class stack2 {
   
    static class stack {
    
        
        static ArrayList<Integer> list = new ArrayList<>();
        boolean isempty(){
            return list.size() == 0;
        }
        void push(int data){
            list.add(data);
        }
        int pop(){
            if (isempty()) {
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(top);
            return top;
        }
        int peek(){
            if (isempty()) {
                return -1;
            }
            return list.get(list.size()-1);
        }
        
    }
   public static void main (String args[]){
     stack s = new stack();
     s.push(0);
     s.push(1);
     s.push(2);
     s.push(3);

     while (!s.isempty()) {
        System.out.println(s.peek());// prints top of stack
        s.pop(); // pops the stack moves to next element
     }
   }
}
