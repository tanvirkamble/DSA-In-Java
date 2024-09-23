package Questions;
import java.util.*;

class Q3{
    public static void main(String[] args) {
        // int[] a = {1,2,3,4,555,54,3};
        int[] a = {1,2,3,4,5,6,7,8,9};
        int [] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            b[i] = a[a.length -i-1];
        }
        System.out.println(Arrays.toString(b));

    }
}