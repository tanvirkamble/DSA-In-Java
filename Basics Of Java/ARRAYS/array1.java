import java.util.*;
public class array1 {
    public static void main (String args[]){
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int number[] = new int[n];

    //  input
     for (int i = 0;i < n; i++){
        System.out.println("input no." + i);
        number[i]=sc.nextInt();
     } 
    
     // output
     for (int i = 0;i < n; i++){
        System.out.println("output no." + i);
        System.out.println(number[i]);
    }  
    sc.close();

    }
}
