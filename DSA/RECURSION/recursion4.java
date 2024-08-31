package DSA.RECURSION;
//factorial
public class recursion4 {
    public static int calculateFact(int x){
         if(x==0){
            return 1;
         }
        System.out.println(x);
        int M = calculateFact(x-1);
        int n = x*M;
        
        return n;
          
    }
    public static void main(String args[]){
        int x = 5 ;
        int a = calculateFact(x); 
        System.out.println(a);
    }
    
}
