package problems;
import java.util.*;

public class Q3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        if (m>n){
            System.out.println(m+"is greater");
        } else {
            System.out.println(n+"is greater");
        }
        sc.close();

    }
}
