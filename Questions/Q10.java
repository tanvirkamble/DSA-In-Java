package Questions;

public class Q10 {
    static void rotate2(int[]a , int n ){
        //rotate the array circularly n number of times
        n= n% a.length;// when n is greater the array length
        for (int i = 0; i < n; i++) { // will do the loop n no. of times
            rotate(a);
        }
    }
    static void rotate(int[] a){
        int last = a[a.length - 1];
        for (int i = a.length-1; i > 0; i--) {
            a[i] = a[i-1];
        }
        a[0]= last ;

    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        // int arr[] = { 2, 3, 4, 5,1};
        rotate(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        rotate2(arr, 3);
        for (int i : arr) {
            System.out.print(i + " ");

        }

    }
}
