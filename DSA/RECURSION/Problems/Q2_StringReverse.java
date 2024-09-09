package RECURSION.Problems;
// abcd => dcba 
public class Q2_StringReverse {
// time complexity O(n)  

    /*public static void reverseStr(int i, String s){
        if (i==0){
            System.out.print(s.charAt(i));
            return;
        }

        System.out.print(s.charAt(i));
        reverseStr(i-1, s);
    }*/

    public static String reverseStr(int i, String s) {
        if (i == 0) {
            System.out.print(s.charAt(i));
            return String.valueOf(s.charAt(i));
        }

        System.out.print(s.charAt(i));
        // Concatenate the current character with the reversed substring from the previous indices to build the reversed string.
        return s.charAt(i) + reverseStr(i - 1, s);
    }

    public static void correctStr(int i, String s){
        if (i==s.length()-1){
            System.out.print(s.charAt(i));
            return;
        }

        System.out.print(s.charAt(i));
        correctStr(i+1, s);
    }
    public static void main(String[] args) {
        String x = "VRISTI";
        System.out.println("Length of the string: " + x.length());
        
        System.out.print("Reversed string: ");
        String reversed = reverseStr(x.length() - 1, x);  // Store reversed string
        System.out.println();  // New line for clarity

        // Reverse the reversed string back to the original
        System.out.print("Original string after reversing back: ");
        reverseStr(reversed.length() - 1, reversed);  // Reverse the reversed string
        System.out.println();  // New line for clarity
        
        System.out.print("Original string with plain logic of recusrsion ");
        correctStr(0, x);
    }
}
