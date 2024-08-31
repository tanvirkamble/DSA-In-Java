package problems;
import java.util.*;

public class Q5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        // int n = sc.nextInt();

        if (m>18){
            System.out.println("adult and can vote");
        } else {
            System.out.println(" not adult");
        }
        sc.close();
    }
}
