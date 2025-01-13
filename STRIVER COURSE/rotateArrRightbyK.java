public class rotateArrRightbyK {
    public static void reverse(int a[], int s, int e){
        while(s < e){
            int temp = a[s];
            a[s] = a[e];
            a[e] = temp;
            s++;
            e--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);

        // Step 1: Reverse the first n-k elements
        // This reverses the portion of the array that will remain at the end
        // Example: [1, 2, 3, 4, 5, 6, 7], n=7, k=3
        // After this step: [4, 3, 2, 1, 5, 6, 7]
        // reverse(nums, 0, n - k - 1);

        // Step 2: Reverse the last k elements
        // This reverses the portion of the array that will move to the front
        // Example: [4, 3, 2, 1, 5, 6, 7]
        // After this step: [4, 3, 2, 1, 7, 6, 5]
        // reverse(nums, n - k, n - 1);

        // Step 3: Reverse the entire array
        // This puts the reversed sections in the correct order to achieve the rotation
        // Example: [4, 3, 2, 1, 7, 6, 5]
        // After this step: [5, 6, 7, 1, 2, 3, 4]
        // reverse(nums, 0, n - 1);
    }
}
