package DSA.RECURSION.Problems;
// first time element occurend and last time it occured
public class Q3_Occurance {
// time complexity O(n)  
    
    // Static variables to store the first and last occurrence of the character
    // Initialized to -1 to indicate that the character hasn't been found yet
    public static int first = -1;
    public static int last = -1;

    public static void findOccuance(int i, char element,String x){

        if ( i == x.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }

        // Check if the current character matches the element we are searching for
        char currentChar = x.charAt(i);
        if (currentChar == element) {
        
            // If this is the first occurrence (first is -1), update the first occurrence index
            if (first == -1 ) {
                first = i;
            } 
            // Otherwise, update the last occurrence index
            else {
                last = i;
                
            }
        } 

        findOccuance(i+1, element, x);
    }
    public static void main(String[] args) {
        String x = "acsdfsdasdfasdad";
        findOccuance(0, 'a', x);
    }
}
