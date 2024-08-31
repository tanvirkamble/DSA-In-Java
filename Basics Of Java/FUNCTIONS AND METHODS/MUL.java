import java.util.*;

public class MUL {
    public static int multiply(int a,int b){
       return a*b;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("product is " + multiply(a,b));
        sc.close();
    }
}
