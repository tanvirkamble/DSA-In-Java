package Questions;
import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        int[] a ={1,2,3,45};
        int max = a[0];
        int min = a[0];

        for (int i = 0; i < a.length; i++) {
                
                if (a[i] > max) {
                    max = a[i];
                }
                if (a[i] < min){
                    min = a[i];

                }
                
            }
            System.out.println("min : "+ min);
            System.out.println("max : "+ max);

        Integer[] b = {1,3,4,453,5,3};
        Arrays.sort(b);
        System.out.println( b[b.length-1]);
        System.out.println( b[0]);

        Arrays.sort(b , Collections.reverseOrder());
        System.out.println("reverse order: "+Arrays.toString(b));

    }
}
