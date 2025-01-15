import java.util.HashMap;

public class missingNumber {
    public static int missingNumber(int []a, int N) {
        // Write your code here.
        for (int i = 1; i <= N; i++) {
            int flag = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == i){
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                return i;
            }

        }
            return -1;
    }
    // better
    
      public static int missingNumber2(int[] a, int N) {
        // Create a HashMap to store numbers with Boolean value
        HashMap<Integer, Boolean> map = new HashMap<>();

        // Add elements from the array to the map
        for (int i = 0; i < a.length; i++) {
            map.put(a[i], true);
        }

        // Check for missing numbers from 1 to N
        for (int i = 1; i <= N; i++) {
            if (!map.containsKey(i)) {  // If the number is not present in the map
                return i;  // Return the missing number
            }
        }

        return -1;  // Return -1 if no missing number (not expected in this case)
    }

    //optimal
    
    public static int missingNumber3(int[] a, int N) {
       int sum = N*( N+1)/2;
       int sum2 = 0;
       for (int i = 0; i < a.length; i++) {
          sum2 = sum2 + a[i];
       }
       return sum-sum2;
    }
}
