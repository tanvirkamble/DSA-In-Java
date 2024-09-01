// Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)
package BasicsOFJava.functionsAndMethods.problems;
import java.util.*;

public class Q9 {
   //GCD & LCM 
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
         int n = sc.nextInt();
         while (n % m != 0){
            int temp = n % m;//(m is divisor n is dividend and temp is remainder)
            n = m; // m is the new dividend
            m = temp ; // temp is the new divisor
            // now it again checks if the n % m == 0 if no it will divided the new n from m then substitutes value again 
        }
        int GCD = m ; // the divisor for which the remainder is zero
        int LCM = (m*n)/GCD;
        System.out.println("gcd and lcm are " +GCD + " and "+ LCM);
        sc.close();
    }
}
