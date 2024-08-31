package problems;
import java.util.*;

public class Q4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        // int circumference = 2 * (22/7) * m;
        double circumference = 2 * 3.14 * m;
        System.out.println(circumference); 
        sc.close();
    }
}
