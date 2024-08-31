package DSA.SORTING;
import java.util.*;
// sort in descending 1,2,... n
public class SELECTIONSORT {
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

        //again traversing through the whole array for i-1 or n-1 times
        for (int i = 0; i < arr.length-1; i++) {
            int smallest = i; // Assume the current index i is the smallest

            /* [i , i+1(j)] would neighbours so we check.
            this loop will check the array all elements once till arr.length */
           for (int j = i+1; j < arr.length; j++) {
            if (arr[smallest] > arr[j]) {
                smallest = j;// swapp the bigger value position in array to jth place position in array(acc to condition smallest arr postn is swapped to jth place postn)
                }
           }  
           //since this the actual swap code is out side the nested for loop it check the condition and swap to accurate once for all
           int temp = arr[smallest];//temp = 3
           arr[smallest] = arr[i];//arr[2] = 7
           arr[i] = temp;//arr[0] = 3
            
        }

        printval(arr);
        sc.close();
    }
}

/*
Detailed explanation of each pass:
    Pass 1 (i = 0)
    Initial Array: [7, 8, 3, 5, 4]
        Assume smallest = 0 (element = 7)
            Inner Loop Steps:

            Inner Loop Step (j = 1): Compare 7 and 8
                Since 7 < 8, no change.
            Inner Loop Step (j = 2): Compare 7 and 3
                Since 7 > 3, update smallest to 2 (element = 3).
            Inner Loop Step (j = 3): Compare 3 and 5
                Since 3 < 5, no change.
            Inner Loop Step (j = 4): Compare 3 and 4
                Since 3 < 4, no change.
            
        Swap: Swap 7 (arr[0]) with 3 (arr[2]).
            
    Array after Pass 1: [3, 8, 7, 5, 4]

    Pass 2 (i = 1)
    Initial Array: [3, 8, 7, 5, 4]
        Assume smallest = 1 (element = 8)
            Inner Loop Steps:
            
            Inner Loop Step (j = 2): Compare 8 and 7
                Since 8 > 7, update smallest to 2 (element = 7).
            Inner Loop Step (j = 3): Compare 7 and 5
                Since 7 > 5, update smallest to 3 (element = 5).
            Inner Loop Step (j = 4): Compare 5 and 4
                Since 5 > 4, update smallest to 4 (element = 4).
        Swap: Swap 8 (arr[1]) with 4 (arr[4]).

    Array after Pass 2: [3, 4, 7, 5, 8]

    Pass 3 (i = 2)
    Initial Array: [3, 4, 7, 5, 8]
        Assume smallest = 2 (element = 7)
            Inner Loop Steps:
        
            Inner Loop Step (j = 3): Compare 7 and 5
                Since 7 > 5, update smallest to 3 (element = 5).
            Inner Loop Step (j = 4): Compare 5 and 8
                Since 5 < 8, no change.
        Swap: Swap 7 (arr[2]) with 5 (arr[3]).
            
    Array after Pass 3: [3, 4, 5, 7, 8]

    Pass 4 (i = 3)
    Initial Array: [3, 4, 5, 7, 8]
        Assume smallest = 3 (element = 7)
            Inner Loop Steps:
            
            Inner Loop Step (j = 4): Compare 7 and 8
                Since 7 < 8, no change.
        Swap: No need to swap since the smallest element is already in place.
    Array after Pass 4: [3, 4, 5, 7, 8]

    After the fourth pass, the remaining elements are in their correct positions.
*/
