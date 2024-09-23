package Questions;
import java.util.*;

public class Q8 {
    public static int[] reArrange(int[] x){
        int [] y = new int[x.length];
        int j = 0;
        for (int i = 0; i < x.length; i++) {
            // if (-1*(x[i]/x[i]) == -1) {
            if (x[i] < 0) {
                    y[j] = x[i];
                    j++;
            }
        }
        for (int i = 0; i < x.length; i++) {
            if (x[i] >= 0) {
                    y[j] = x[i];
                    j++;
            }
        }
        
        return y;
    }
    public static void main(String[] args) {
        int[] a = {-12,11,-13,-5,6,-7,5,-3,-6};
        int[] b = reArrange(a);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+ " ");
        };
        System.out.println();
        int[] x = {10,3,2,4,-1,3,-1,-4,-4};
        Arrays.sort(x);
        for (int i : x) {
            System.out.print(i + " ");
        }

    }
}
