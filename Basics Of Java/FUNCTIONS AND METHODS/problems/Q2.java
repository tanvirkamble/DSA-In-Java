package problems;
import java.util.*;

public class Q2 {
    public static int oddSum(int n){
           int sum = 0;
           for (int i = 1 ; i <= n ; i++){
               if (i % 2 != 0) {
                   sum = sum + i;
                   System.out.println("current"+sum);
                }          
        } 
        return sum;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // oddSum(n);
        System.out.println(oddSum(n));
        sc.close();
    }
}
