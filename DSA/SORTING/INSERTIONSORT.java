package DSA.SORTING;
import java.util.*;
// sort in ascending 1,2,... n
public class INSERTIONSORT {
    //time complexity O(n^2)
    public static void printval(int arr[]){
        System.out.println("sorted array elements");
        for (int x = 0; x < arr.length; x++) {
            System.out.print(arr[x] + " ");
        }
    }
    public static void main(String args[]){
        // int arr[]= {7,8,3,5,4};

        Scanner sc = new Scanner(System.in);
        System.out.println("no. of array elements?");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("type array the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Traverse from the second element to the last
       for (int i = 1; i < arr.length; i++) {
          int current = arr[i];// The current or first element to be inserted into the sorted portion (from unsorted array)
          int j = i-1;// Index of the last element in the sorted portion 
          while(j>=0 && current < arr[j]){
            arr[j+1] = arr[j];// Shift element one position to the right
            j--;  // Move to the next element in the sorted portion
        }
        arr[j+1] = current;// Place the key in its correct position
       }

        printval(arr);
        sc.close();
    }
}

/*
 For the array {12, 11, 13, 5, 6}, the sorting steps would be:

Pass 1 (i = 1):

key = 11
Move 12 (since 12 > 11), resulting in {12, 12, 13, 5, 6}
Insert 11 at the beginning, resulting in {11, 12, 13, 5, 6}
Pass 2 (i = 2):

key = 13
13 is already in the correct position, array remains {11, 12, 13, 5, 6}
Pass 3 (i = 3):

key = 5
Move 13, 12, and 11, resulting in {11, 12, 13, 13, 6}, {11, 12, 12, 13, 6}, {11, 11, 12, 13, 6}
Insert 5, resulting in {5, 11, 12, 13, 6}
Pass 4 (i = 4):

key = 6
Move 13 and 12, resulting in {5, 11, 12, 13, 13}, {5, 11, 12, 12, 13}
Insert 6, resulting in {5, 6, 11, 12, 13}
The array is now sorted: {5, 6, 11, 12, 13}.
 */

