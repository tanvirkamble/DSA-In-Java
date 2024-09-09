package RECURSION.Problems;

public class Q10_Permutation {
// O(n*n!)
    public static void printPermut(String x,String permutation) {
        // Base case: if the input string is empty, print the permutation
        if (x.length() == 0) {
            System.out.println(permutation);
            return;
        }

        // Loop through each character in the input string
        for (int i = 0; i < x.length(); i++) {
            // currrentChar is 'a' for i=0
            char currentChar = x.charAt(i);
            
            // Create a new string without the current character i.e Create a new string 'newStr' that excludes the character at index 'i' from the original string 'x'.
            // This is done by concatenating the substring before index 'i' and the substring after index 'i'. 
            String newStr = x.substring(0, i) + x.substring(i+1);

            // Recursively call the function with the new string and updated permutation
            printPermut(newStr, permutation+currentChar);

        }
        
    }
    public static void main(String[] args) {
        String x ="abc";
        printPermut(x, "");
    }
}


/*  
Example with "abc"
Let's see how the code works with the input string "abc":

1. Initial Call: printPermut("abc", "")

    x = "abc"
    permutation = ""

2.First Level of Recursion:

  The loop runs three times, once for each character in "abc":

    First Iteration (i = 0):
        currentChar = 'a'
        newStr = "bc" (remove 'a' from "abc")
        Recursive call: printPermut("bc", "a")
    Second Iteration (i = 1):
        currentChar = 'b'
        newStr = "ac" (remove 'b' from "abc")
        Recursive call: printPermut("ac", "b")
    Third Iteration (i = 2):
        currentChar = 'c'
        newStr = "ab" (remove 'c' from "abc")
        Recursive call: printPermut("ab", "c")

3. Second Level of Recursion:

  Let's continue with the recursive call from the first iteration: printPermut("bc", "a").

  x = "bc"
  permutation = "a"
  
  The loop runs twice, once for each character in "bc":

    First Iteration (i = 0):
        currentChar = 'b'
        newStr = "c" (remove 'b' from "bc")
        Recursive call: printPermut("c", "ab")
    Second Iteration (i = 1):
        currentChar = 'c'
        newStr = "b" (remove 'c' from "bc")
        Recursive call: printPermut("b", "ac")

4. Third Level of Recursion:


  Continue with the recursive call from the first iteration: printPermut("c", "ab").

  x = "c"
  permutation = "ab"

  The loop runs once because "c" has only one character:

    First Iteration (i = 0):
        currentChar = 'c'
        newStr = "" (remove 'c' from "c")
        Recursive call: printPermut("", "abc")

5. Base Case Reached:

  Now, printPermut("", "abc") is called:

  x = "" (empty string)
  permutation = "abc"

The base case is reached, and "abc" is printed.

This process continues for all recursive paths, generating all permutations: "abc", "acb", "bac", "bca", "cab", "cba". 
*/

/*
visual representation :

printPermut("abc", "")  <-- Initial call
    |
    |---(i = 0) 'a' is selected
    |    currentChar = 'a', newStr = "bc"
    |    printPermut("bc", "a")
    |       |
    |       |---(i = 0) 'b' is selected
    |       |    currentChar = 'b', newStr = "c"
    |       |    printPermut("c", "ab")
    |       |       |
    |       |       |---(i = 0) 'c' is selected
    |       |       |    currentChar = 'c', newStr = ""
    |       |       |    printPermut("", "abc")
    |       |       |    * Base case: print "abc"
    |       |
    |       |---(i = 1) 'c' is selected
    |            currentChar = 'c', newStr = "b"
    |            printPermut("b", "ac")
    |               |
    |               |---(i = 0) 'b' is selected
    |               |    currentChar = 'b', newStr = ""
    |               |    printPermut("", "acb")
    |               |    * Base case: print "acb"
    |
    |---(i = 1) 'b' is selected
    |    currentChar = 'b', newStr = "ac"
    |    printPermut("ac", "b")
    |       |
    |       |---(i = 0) 'a' is selected
    |       |    currentChar = 'a', newStr = "c"
    |       |    printPermut("c", "ba")
    |       |       |
    |       |       |---(i = 0) 'c' is selected
    |       |       |    currentChar = 'c', newStr = ""
    |       |       |    printPermut("", "bac")
    |       |       |    * Base case: print "bac"
    |       |
    |       |---(i = 1) 'c' is selected
    |            currentChar = 'c', newStr = "a"
    |            printPermut("a", "bc")
    |               |
    |               |---(i = 0) 'a' is selected
    |               |    currentChar = 'a', newStr = ""
    |               |    printPermut("", "bca")
    |               |    * Base case: print "bca"
    |
    |---(i = 2) 'c' is selected
         currentChar = 'c', newStr = "ab"
         printPermut("ab", "c")
            |
            |---(i = 0) 'a' is selected
            |    currentChar = 'a', newStr = "b"
            |    printPermut("b", "ca")
            |       |
            |       |---(i = 0) 'b' is selected
            |       |    currentChar = 'b', newStr = ""
            |       |    printPermut("", "cab")
            |       |    * Base case: print "cab"
            |
            |---(i = 1) 'b' is selected
                 currentChar = 'b', newStr = "a"
                 printPermut("a", "cb")
                    |
                    |---(i = 0) 'a' is selected
                    |    currentChar = 'a', newStr = ""
                    |    printPermut("", "cba")
                    |    * Base case: print "cba"
 */