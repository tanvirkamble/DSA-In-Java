package Practice;

public class Q2 {
    public static void reverse(int a[], int s , int y  ){
        // int temp[] = new int [a.length];
        // for (int i = 0; i < a.length; i++) {
        //     temp[i] = a[a.length - i - 1];
        //  }
        // for (int i = 0; i < a.length; i++) {
        //     a[i] = temp[i];
        // }

        while (s < y) {
            int temp  = a[s];
            a[s] = a[y];
            a[y] = temp;
            s++;
            y--;             
        }
    }

    public static void rotateright(int a[], int k){
        k = k % a.length;//2
        // 1,2,3,4,5
        reverse(a, 0, a.length-1);//5,4,3,2,1
        reverse(a, 0, k-1);//4,5,3,2,1
        reverse(a, k, a.length-1);//4,5,1,2,3
        
    }
    public static void rotateleft(int a[], int k){
        k = k % a.length;//2
        // 1,2,3,4,5
        reverse(a, 0, k-1);//[2, 1, 3, 4, 5]
        reverse(a, k, a.length-1);// [2, 1, 5, 4, 3]
        reverse(a, 0, a.length-1);// [3, 4, 5, 1, 2]
        
    }
    public static void reverse2(int a[],int s ,int e){
        while(s < e){
            int temp = a[s];
             a[s] = a[e];
             a[e] = temp;
             s++;
             e--;
        }

    }

    public static void main(String args[]){
        int[] arr = { 1, 4, 3, 2, 6, 5 };
        int[] arr1 = { 1, 2,3,4,5 };
        int[] arr2 = { 1, 2,3,4,5 };

        reverse(arr,0,arr.length-1);
        rotateleft(arr1, 2);
        rotateright(arr2, 2);

  
        System.out.print("Reversed array: ");
        for (int i = 0; i < arr.length; i++) 
            System.out.print(arr[i] + " ");
        
        // Print left-rotated array
        System.out.print("\nLeft-rotated array: ");
        for (int i = 0; i < arr1.length; i++) 
            System.out.print(arr1[i] + " ");
        
        // Print right-rotated array
        System.out.print("\nRight-rotated array: ");
        for (int i = 0; i < arr2.length; i++) 
            System.out.print(arr2[i] + " ");
    }
}
