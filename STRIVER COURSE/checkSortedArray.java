public class checkSortedArray {
    public static int isSorted(int n, int []a) {
        // Write your code here.
           for (int i = 0; i < a.length-1 ; i++) {
               if (a[i] > a[i + 1]) {
                   return 0;
               }
           }  
           return 1; 
           }
}
