import java.util.Stack;

public class infixToPostfix {
    public static int priority(char operand){
        if(operand == '+' || operand == '-')  return 1;
        if(operand == '/' || operand == '*')  return 2;
        if(operand == '^' )  return 3;

        return -1;
    }
    public static String infixToPostfix(String exp) {
        // Write your code here
        Stack<Character> stack = new Stack<>();



        int i = 0;
        StringBuilder s = new StringBuilder() ;

        while(i < exp.length()){
            // if(exp.charAt(i) == '1' || exp.charAt(i) == '2' || exp.charAt(i) == '3' || exp.charAt(i) == '4' || exp.charAt(i) == '5' || exp.charAt(i) == '6' || exp.charAt(i) == '7' || exp.charAt(i) == '8' || exp.charAt(i) == '9' || exp.charAt(i) == '0')
            // if(exp.charAt(i) >= '0' &&  exp.charAt(i) <= '9') s.append(exp.charAt(i));
            // else if(exp.charAt(i) >= 'a' &&  exp.charAt(i) <= 'z') s.append(exp.charAt(i));
            // else if(exp.charAt(i) >= 'A' &&  exp.charAt(i) <= 'Z') s.append(exp.charAt(i));

            if (Character.isLetterOrDigit(exp.charAt(i))) {
                s.append(exp.charAt(i));
            }

            else if(exp.charAt(i) == '(') stack.push(exp.charAt(i));
            else if(exp.charAt(i) == ')') {
                while(!stack.isEmpty() && stack.peek() != '('){
                    s.append(stack.peek());
                    stack.pop();
                }
                if (!stack.isEmpty()) stack.pop();
            }
            else {
                while(!stack.isEmpty() && priority(stack.peek()) >= priority(exp.charAt(i))){
                    s.append(stack.peek());
                    stack.pop();
                }
                stack.push(exp.charAt(i));
            }



            i++;
        }
            while(!stack.isEmpty()){
                    s.append(stack.peek());
                    stack.pop();
            }
            
        return s.toString();
    }  
}
