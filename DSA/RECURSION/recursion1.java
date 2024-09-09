package RECURSION;

public class recursion1 {

    public static void printN(int n){
         if (n==0){
            return;
         }// base case
         System.out.println(n);//function
         printN(n-1);//recrusion
    }
    public static void main (String args[]){
        int x = 5;
        printN(x);

    }
    
}
