package DSA.RECURSION;
// 1 to 5
public class recursion2 {
    public static void printN(int n){
        if (n == 6){
               return ;
        }
        System.out.println(n);
        printN(n+1);
    }
    public static void main(String args[]){
         int x = 1 ;
         printN(x);
    }
}
