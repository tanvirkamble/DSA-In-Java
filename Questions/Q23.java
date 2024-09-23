package Questions;
import java.util.*;

public class Q23 {
    public static void findFactor(int n){
        if(n == 0 ){
            System.out.println("no factors of zero");
        }
        n = Math.abs(n);
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (i != n) {
                    System.out.print( i + " , ");
                } else {
                    System.out.print(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scaneer = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scaneer.nextInt();
        scaneer.close();
        findFactor(n);
    }
    
}
