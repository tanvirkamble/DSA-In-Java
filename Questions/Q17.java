package Questions;
import java.util.*;

public class Q17 {
    // alternate positive and negatives
    public static void rearrange(int a[]){
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            if(a[i] > 0){
                positive.add(a[i]);
            }else {
                negative.add(a[i]);
            }
        }

        int pI = 0;
        int nI = 0;
        int i = 0;
        //adding elements
        while (pI < positive.size() && nI < negative.size()) {
            if (i%2 == 0) {
                a[i++] = positive.get(pI++);
            } else {
                a[i++] = negative.get(nI++);
            }
        }

        while (pI < positive.size()) {
            a[i++] = positive.get(pI++);
        }
        while ( nI < negative.size()) {
            a[i++] = negative.get(nI++);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -4, -1, 4,2,3,-1};
        rearrange(arr);
        for (int i = 0; i < arr.length; i++) 
            System.out.print(arr[i] + " ");
    }

}
