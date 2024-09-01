// Write a program to print Fibonacci series of n terms where n is input by user : 0 1 1 2 3 5 8 13 21 ..... 
// In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.

package BasicsOFJava.functionsAndMethods.problems;
import java.util.*;

//fibo=1,1,2,3,5,8,13...
//m=   1,2,3,4,5,6,7...
public class Q10 {
    public static int fibo(int m){
        int a=0, b=1;
        int c=0;
        if (m == 0) {
            return a;
        } else if (m == 1) {
            return b;
        } else {
            for(int i = 2 ; i<=m ; i++){
                c = a + b;//1,1,2,3,5,8,13...
                a = b; //a=1,1,1,2,3,5....
                b = c; // b=1,2,3,3,5,8...
            }
            return c;
        }
         
    }
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();

    System.out.println(fibo(m));
    sc.close();   
   }
}
