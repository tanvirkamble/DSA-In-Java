package DSA.RECURSION.Problems;

import java.util.ArrayList;

public class Q14_subsetOfSetOfNumbers {
//O((2)^n)
    // Static counter to keep track of subset index
    private static int subsetIndex = 0;
    
    public static void printSubets(ArrayList<Integer> subset) {
        System.out.println("Subset no. " + subsetIndex);
        if (subset.isEmpty()) {
            System.out.println("empty subset");
        } else {
            for (int i = 0; i < subset.size(); i++) {
                System.out.print(subset.get(i) + " ");
            }
            System.out.println();
        }
        subsetIndex++; 
    }

    public static void findSubset(int n, ArrayList<Integer> subset ){
       if(n==0){
           printSubets(subset);
        return;
       }

       //add n
       subset.add(n);
       findSubset(n-1, subset);
       
       //remove n
       subset.remove(subset.size()-1);
       findSubset(n-1, subset);
    }
    public static void main(String[] args) {
        int n=3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubset(n, subset);
    }
}
