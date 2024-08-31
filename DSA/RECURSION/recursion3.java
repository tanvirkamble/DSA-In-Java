package DSA.RECURSION;
// sum = 1 + 2 +3 ... + n
public class recursion3 {

    public static void Sum (int i,int n, int sum){
        if(i == n){
            sum=sum+i;
            System.out.println(sum);
            return;
        }
        // if(i == n+1){
        //     System.out.println(sum);
        //     return;
        // }
        sum = sum + i;//func
        Sum(i+1,n,sum);
    }
    
    public static void main (String args[]){
         Sum(1, 5, 0);
    }
}
