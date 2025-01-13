public class nonZeroAtEndOfArray {
        //brute
        public static int[] moveZeros(int n, int []a) {
        // Write your code here.
        int b[] = new int[n]; 
        int j = 0;
        for (int i = 0; i < n; i++) {
        if (a[i] != 0) { // dont use while bc it will fall in infite loop
            b[j] = a[i];
            j++;
        }
            
        }
        for (int i = j; i < n; i++) {
            b[i] = 0;
        }
        return b;
    }

    //optimal
        public static void swap(int k[], int a,int b){
            int temp = k[a];
            k[a] = k[b];
            k[b] = temp;
        }
        public static int[] moveZeros2(int n, int []a) {
        // Write your code here.

        int j=-1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                j = i;
                break;
            }
        }
        // If no zero is found, return the array as is
        if (j == -1) {
            return a;
        }

        for (int i = j+1; i < a.length; i++) {
            if( a[i] != 0){
                swap(a,i,j);
                j++;
            }
        }
            
        
        return a;
    }

 
}
