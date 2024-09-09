package RECURSION;
//fibonacci series
public class recursion6 {

    public static void fibo(int a,int b, int x ){
        if ( x==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        a=b;
        b=c;
        fibo(a, b, x-1);
    }
    public static void main(String arg[]){
      int a =0,b=1;
      System.out.println(a);
      System.out.println(b);
      int n =7; 
      fibo(a,b,n-2);//1&0 printed
    }



    
}
