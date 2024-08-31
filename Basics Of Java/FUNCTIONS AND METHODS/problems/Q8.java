// Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
package problems;
import java.util.*;

public class Q8 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();// base
         int n = sc.nextInt();//power
         int powerval =1;
         for(int i = 1 ; i<=n ; i++){
              powerval = powerval * m;
         }
         System.out.println(powerval);
        sc.close();
    }
}
