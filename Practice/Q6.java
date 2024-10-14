package Practice;

import java.util.HashMap;

public class Q6 {
      public static void findSubarrayWithSum(int[] arr, int targetSum) {
        HashMap<Integer, Integer> sumMap = new HashMap<>(); // To store cumulative sums
        int cumulativeSum = 0; // This will hold the sum of elements up to the current index

        for (int i = 0; i < arr.length; i++) {
            cumulativeSum += arr[i]; // Update the cumulative sum

            // Check if the cumulative sum equals the target sum
            if (cumulativeSum == targetSum) {
                System.out.println("Subarray found from index 0 to index " + i);
                return; // Exit the method
            }

            // Check if there is a previous cumulative sum that would form the target sum
            if (sumMap.containsKey(cumulativeSum - targetSum)) {
                int startIndex = sumMap.get(cumulativeSum - targetSum) + 1; // Get starting index
                System.out.println("Subarray found from index " + startIndex + " to index " + i);
                return; // Exit the method
            }

            // Store the cumulative sum with its index
            sumMap.put(cumulativeSum, i);
        }

        System.out.println("No subarray found with the given sum.");
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5}; // Example array
        int targetSum = 12; // Example target sum
        findSubarrayWithSum(arr, targetSum); // Call the method
    }
}
