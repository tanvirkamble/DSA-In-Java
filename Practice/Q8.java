package Practice;

public class Q8 {
        public static void findCommonElements(int[] arr1, int[] arr2, int[] arr3) {
            // Initialize starting indexes for arr1[], arr2[] and arr3[]
            int i = 0, j = 0, k = 0;
    
            // Iterate through all arrays until we reach the end of any of them
            while (i < arr1.length && j < arr2.length && k < arr3.length) {
    
                // If arr1[i] == arr2[j] and arr2[j] == arr3[k], then it's a common element
                if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                    System.out.print(arr1[i] + " ");  // Print the common element
                    i++;  // Increment all three pointers
                    j++;
                    k++;
                }
    
                // If arr1[i] is smaller than arr2[j], then increment i
                else if (arr1[i] < arr2[j]) {
                    i++;
                }
    
                // If arr2[j] is smaller than arr3[k], then increment j
                else if (arr2[j] < arr3[k]) {
                    j++;
                }
    
                // Otherwise, increment k
                else {
                    k++;
                }
            }
        }
    
        public static void main(String[] args) {
            int[] arr1 = {1, 5, 10, 20, 40, 80};
            int[] arr2 = {6, 7, 20, 80, 100};
            int[] arr3 = {3, 4, 15, 20, 30, 70, 80, 120};
    
            System.out.println("Common elements are:");
            findCommonElements(arr1, arr2, arr3);
        }
    
    
}
