package SORTING;
import java.util.*;
// to sort the array in ascending order n,n-1...1
public class BUBBLESORT {
    // time complexity = O(n*n) = O(n^2)
    
       public static void printval(int arr[]){
        System.out.println("ascending order sorted array elements");
        for (int x = 0; x < arr.length; x++) {
            System.out.print(arr[x] + " ");
        }
       }
       public static void main (String args[]){
        // int arr[]= {7,8,3,5,4};

        Scanner sc = new Scanner(System.in);
        System.out.println("no. of array elements?");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        System.out.println("type array the elements");
        for (int i = 0; i < n; i++) {
             arr[i] = sc.nextInt();            
        }

        /* (i < arr.length-1) bc the last remain element wont need any sorting
        In this loop i is the no. of times  traversing is happen in the array */
        for (int i = 0; i < arr.length-1; i++) {
            
             /* This loop performs the comparison and swapping for each pass
             here j and j+1 checks the elements at those position and compare them */
             for (int j = 0; j < arr.length-i-1  ; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j]; // temp = 7
                    arr[j] = arr[j+1]; // arr[j] = 8
                    arr[j+1] = temp;  // arr[j+1] = 7
                }
             // after j reches the end of the loop it get out of its loop and then for loop i is incresed by one and so new traversing happen w previously updated array
             }

             
            }
        printval(arr);
        sc.close();
       }
}

/*
Pass (i): Sorting the array
After each pass, the largest element in the unsorted portion moves to its correct position

    Pass 1 (i = 0)
        **Inner Loop Step (j = 0): Compare 5 and 3
            Since 5 > 3, swap them.
            Array after swap: [3, 5, 8, 4, 2]
        **Inner Loop Step (j = 1): Compare 5 and 8
            Since 5 < 8, no swap needed.
            Array remains: [3, 5, 8, 4, 2]
        **Inner Loop Step (j = 2): Compare 8 and 4
            Since 8 > 4, swap them.
            Array after swap: [3, 5, 4, 8, 2]
        **Inner Loop Step (j = 3): Compare 8 and 2
            Since 8 > 2, swap them.
            Array after swap: [3, 5, 4, 2, 8]
            
            After the first pass, the largest element 8 is in its correct position.

    Pass 2 (i = 1)
        **Inner Loop Step (j = 0): Compare 3 and 5
            Since 3 < 5, no swap needed.
            Array remains: [3, 5, 4, 2, 8]
        **Inner Loop Step (j = 1): Compare 5 and 4
            Since 5 > 4, swap them.
            Array after swap: [3, 4, 5, 2, 8]
        **Inner Loop Step (j = 2): Compare 5 and 2
            Since 5 > 2, swap them.
            Array after swap: [3, 4, 2, 5, 8]
            
            After the second pass, the second largest element 5 is in its correct position.

    Pass 3 (i = 2)
        **Inner Loop Step (j = 0): Compare 3 and 4
            Since 3 < 4, no swap needed.
            Array remains: [3, 4, 2, 5, 8]
        **Inner Loop Step (j = 1): Compare 4 and 2
            Since 4 > 2, swap them.
            Array after swap: [3, 2, 4, 5, 8]
            
            After the third pass, the third largest element 4 is in its correct position.

    Pass 4 (i = 3)
        **Inner Loop Step (j = 0): Compare 3 and 2
            Since 3 > 2, swap them.
            Array after swap: [2, 3, 4, 5, 8]
            
            After the fourth pass, the remaining elements are in their correct positions.
*/
