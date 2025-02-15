package SORTING;

public class QUICKSORT_midPivot {
//Worst-case: 𝑂(𝑛^2)
//avgt-case: 𝑂(nlogn)
  
        // Partition function to place the pivot element in its correct position
        public static int partition(int arr[], int low, int high) {
            int mid = low + (high - low) / 2; // Calculate middle index
            int pivot = arr[mid];  // Choosing the middle element as the pivot
            
            // Swap the middle element with the first element
            int temp = arr[mid];
            arr[mid] = arr[low];
            arr[low] = temp;
    
            System.out.println("Partitioning with pivot: " + pivot + " at index: " + low);
    
            int i = low;  // Index of the smaller element
    
            // Traverse each element of the array and compare it with the pivot
            for (int j = low + 1; j <= high; j++) {
                if (arr[j] <= pivot) {
                    i++;  // Increment index of smaller element
    
                    // Swap elements at i and j
                    int tempSwap = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tempSwap;
                    System.out.println("Swapped: " + arr[i] + " and " + arr[j]);
                }
            }
    
            // Swap the pivot element with the element at index i
            temp = arr[i];
            arr[i] = arr[low];
            arr[low] = temp;
    
            System.out.println("Swapped pivot: " + arr[i] + " with " + arr[low]);
    
            // Return the pivot index after partition
            return i;
        }
    
        // Function to perform quicksort
        public static void quicksort(int arr[], int low, int high) {
            if (low < high) {
                // Find the pivot element such that elements lower than pivot are on the left, and elements greater than pivot are on the right
                int pivot = partition(arr, low, high);
                System.out.println("Pivot at index: " + pivot);
    
                // Recursively sort the sub-arrays
                quicksort(arr, low, pivot - 1);
                quicksort(arr, pivot + 1, high);
            }
        }
    
        public static void main(String[] args) {
            int arr[] = {1, 3, 4, 2, 5, 9};
    
            // Perform quicksort on the array
            quicksort(arr, 0, arr.length - 1);
    
            // Print the sorted array
            System.out.print("Sorted array: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println(); // To ensure a new line after printing the sorted array
        }
    }
    