package Practice;

public class Q10 {
    public static int secLargest(int a[],int n){
        int largest = Integer.MIN_VALUE;
        int sLargest = Integer.MIN_VALUE;

        for( int i = 0 ; i < n ; i++){
            if (a[i] > largest) {
                sLargest = largest;
                largest = a[i];
            } else if  (a[i] < largest && a[i] > largest
             ){
                sLargest = a[i];
            }
        }
        return sLargest;
    }
    public static int secSmallest(int a[], int n){
        int smallest = Integer.MAX_VALUE;
        int secSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < smallest) {
                secSmallest = smallest;
                smallest = a[i];
            } else if (a[i] > smallest && a[i] < secSmallest){
                secSmallest = a[i];
            }
        }
        return secSmallest;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,7};
        int n = a.length;
        System.out.println(secLargest(a,n));
        System.out.println(secSmallest(a,n));
    }
}
