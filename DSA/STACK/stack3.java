package DSA.STACK;

import java.util.Stack;

public class stack3 {
    static void pushAtBottom(int x , Stack<Integer> s){
        if(s.isEmpty()){
            s.push(x);
            return;
        }
        int top = s.pop();
        pushAtBottom(x, s);
        s.push(top);
        return;
    }
    public static void main(String[] args) {
          Stack<Integer> s = new Stack<>();
    s.push(0);
    s.push(1);
    s.push(2);
    System.out.println(s);
    pushAtBottom(5,s);
    System.out.println(s);
  
      while (!s.isEmpty()) {
          System.out.println(s.peek());
          s.pop();
      }
  
    }
}
