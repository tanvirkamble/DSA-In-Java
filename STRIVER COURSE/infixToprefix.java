import java.util.*;

public class infixToprefix {
    public static int preference(char e){
    if(e == '+' || e == '-') return 1;
    if(e == '/' || e == '*') return 2;
    if(e == '^') return 3;
    
    return -1;
}

public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        
        for(int i = 0 ; i < charArray.length ; i++){
            if(charArray[i] == '(') charArray[i] = ')';
            if(charArray[i] == ')') charArray[i] = '(';
        }
        return new String(charArray);
    }
public static String infixToPrefix(String e){
    Stack<Character> stack = new Stack<>();
    
    StringBuilder sb = new StringBuilder();
    
    String newExp = reverseString(e);
    int i = 0;
    
    while(i < newExp.length()) {
        if(Character.isLetterOrDigit(newExp.charAt(i)))
        sb.append(newExp.charAt(i));
        
        else if(newExp.charAt(i) == '(') stack.push(newExp.charAt(i));
        else if( newExp.charAt(i) == ')'){
            while (!stack.isEmpty() && stack.peek() != '(') {
                sb.append(stack.peek());
                stack.pop();
            }
                if (!stack.isEmpty()) stack.pop(); // pop '('
        } else {
            while(!stack.isEmpty() && preference(newExp.charAt(i)) < preference(stack.peek())){
                sb.append(stack.peek());
                stack.pop();
        }
        stack.push(newExp.charAt(i));
    }
        i++;
    
    
    }
    while(!stack.isEmpty()){
                sb.append(stack.peek());
                stack.pop();
    }
    
    return sb.reverse().toString();
}
    public static void main(String[] args) {
    String[] infixExpressions = {
        "a+b",                    // Simple addition
        "a+b*c",                  // Operator precedence
        "(a+b)*c",                // Brackets with precedence
        "a+(b*c)",                // Nested expression
        "a+b+c+d",                // Left associativity chain
        "a+b*c/d-e",              // Mixed operations
        "(a-b/c)*(a/k-l)",        // Multi-bracket, multi-op
        "a^b^c",                  // Right-associative operator
        "((a+t)*((b+(a+c))^(c+d)))", // Deeply nested
        "a+(b+(c+(d+e)))",        // Right-nested addition
        "(((a*b)+c)*d)-e",        // Left-nested mix
        "a*(b+c*(d-e))",          // Nested with mixed ops
        "a*b/(c+d)-e+f"           // Full mixed test
    };

    for (String infix : infixExpressions) {
        String prefix = infixToPrefix(infix);
        System.out.println("Infix : " + infix);
        System.out.println("Prefix: " + prefix);
        System.out.println("----------------------------------");
    }
}

}
