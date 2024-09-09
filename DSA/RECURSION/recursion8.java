package RECURSION;
// x^n wwhere stack height is logn
public class recursion8 {
    public static int nPower(int x, int n){
        if (n==0) {
            return 1;
        }
        if (x==0){
            return 0;
        }
        // Recursively calculate x^(n/2)
        int halfpower = nPower(x, n/2) ;
        // For example, when calculating nPower(2, 10):
        // halfPower = nPower(2, 5) will be computed first

        if(n%2 == 0){
            // If n is even, x^n = (x^(n/2)) * (x^(n/2))
            // Example: nPower(2, 10) will return halfPower * halfPower
            return  halfpower*halfpower;
        }else {
             // If n is odd, x^n = (x^(n/2)) * (x^(n/2)) * x
            // Example: nPower(2, 5) will return halfPower * halfPower * x
            return  halfpower*halfpower*x;

        }
    }
    public static void main(String args[]){
     int ans = nPower(2, 10);
     System.out.println(ans);
    }
}

