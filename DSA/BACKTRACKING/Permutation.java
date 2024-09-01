package DSA.BACKTRACKING;

public class Permutation {
//O(n! * n)  => n1 is total combination and muultiply by n denotes the time to reach a single combination.
    private static int permutationCount = 0;

    public static void printPermutation(String x, String permutation){
       if (x.length() == 0) {
           permutationCount++;
           System.out.println(permutationCount);
        System.out.println(permutation);
        return;
       } 

       for (int i = 0; i < x.length(); i++) {
        char currentChar = x.charAt(i);
        String newStr = x.substring(0, i) + x.substring(i+1);
        printPermutation(newStr, permutation + currentChar);
       }
    }
    public static void main(String[] args) {
        String x ="abcd";
        printPermutation(x, "");
        System.out.println("total count : "+permutationCount);

    }
}
