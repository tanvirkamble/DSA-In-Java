package Questions;
import java.util.*;

public class Q4 {
    public static int kthElement(int[] x,int k){
        Arrays.sort(x);
        System.out.println(Arrays.toString(x));
        return x[k-1];
    }
    public static void main(String[] args) {
        // int[] a = {7,10,4,5,20,15};
        int[] a = {7,10,4,5,20,15,3,43,5,535};

        int i = kthElement(a, 6);
        System.out.println(i);

    }
    
}
