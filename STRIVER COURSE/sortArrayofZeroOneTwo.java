import java.util.* ;

public class sortArrayofZeroOneTwo {
    // brute
        public static void sortArray(ArrayList<Integer> arr, int n) {
        // Write your code here.
        int c1 = 0,c2 = 0, c3 = 0,j = 0; 

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 0) {
                c1++;
            } else if (arr.get(i) == 1) {
                c2++;
            } else if (arr.get(i) == 2) {
                c3++;
            }
        }

        for (int i = 0; i < c1; i++) {
            arr.set(j++, 0);
        }
        for (int i = 0; i < c2; i++) {
            arr.set(j++, 1);
        }
        for (int i = 0; i < c3; i++) {
            arr.set(j++, 2);
        }
    }

    // dutch flag algorithm
        public static void swap(ArrayList<Integer> a, int i,int j){
                int temp = a.get(i);
                a.set(i, a.get(j));
                a.set(j, temp);
            }
        public static void sortArray2(ArrayList<Integer> arr, int n) {
            // Write your code here.
            int l = 0,m = 0, h = n-1; 
    
            while (m <= h ) {
                if( arr.get(m) == 0){
                    swap(arr,m,l);
                    m++;
                    l++;
                } else if(arr.get(m) == 1){
                    m++;
                } else if (arr.get(m) == 2){
                    swap(arr,h,m);
                    h--;
                }
            }
    
        }
    }
    


