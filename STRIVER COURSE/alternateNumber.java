import java.util.*;
public class alternateNumber {
    //brute
    public static int[] alternateNumbers(int []a) {
        // Write your code here.
        int n = a.length/2;
        int b[] = new int[n]; 
        int c[] = new int[n];
        int m=0 , q=0; 
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                b[m] = a[i];// neg
                m++;
            } else {
                c[q] = a[i]; // pos and zero
                q++;
            }
        }
        m=0;
        q=0;
        for (int j = 0; j < a.length; j++) {
            if(j % 2 == 0 && m < c.length){
                a[j] = c[m];
                m++;
            } else if (j % 2 != 0 && q < b.length) {
                a[j] = b[q];
                q++;
            }
        }

        return a;
    }

    //optimal
    public static int[] alternateNumbers2(int []a) {
    
        int pos = 0 , neg = 1;
        int b[] = new int[a.length];
    
        for (int i = 0; i < b.length; i++) {
            if (a[i] < 0 ) {
                b[neg] = a[i];
                neg = neg + 2;
            } else {
                b[pos] = a[i];
                pos = pos + 2;
            }
        }
        
        return b;
        }
}
