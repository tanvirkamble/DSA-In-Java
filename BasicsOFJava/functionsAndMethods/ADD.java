package BasicsOFJava.functionsAndMethods;
 // make a function to add 2 no.s and reutrn the sm
import java.util.*;

public class ADD{
    public static int sum(int a,int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      // String inputA = sc.next();
      // String inputB = sc.next();

      // // Convert strings to integers
      // int a = Integer.parseInt(inputA);
      // int b = Integer.parseInt(inputB);

      int a = sc.nextInt();
      int b = sc.nextInt();

      int calculate = sum(a,b);
      System.out.println(calculate);
      sc.close();

    }
}