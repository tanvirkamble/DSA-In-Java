
public class secondOrderElements {
        public static int[] getSecondOrderElements(int n, int []a) {
            // Write your code here.
            int b = Integer.MIN_VALUE;
            int c = Integer.MIN_VALUE;
    
            for (int i = 0; i < a.length; i++) {
                if (a[i] > b ){
                    c = b;
                    b = a[i];
                } else if (a[i] > c && a[i] != b   ){
                    c = a[i];
                }
            }
            int d = Integer.MAX_VALUE;
            int e = Integer.MAX_VALUE;
    
            for (int i = 0; i < a.length; i++) {
                if ( a[i] < d) {
                    e =d;
                    d = a[i] ;
                } else if (a[i] < e && a[i] != d ){
                    e = a[i];
                }
            }
    
            return new int[] {c,e};
        }
    
}
