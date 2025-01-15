import java.util.* ;
import java.io.*; 
public class maxSubarraySum {
    //brute
    public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
		long max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
		 	for (int j = i; j < arr.length; j++) {
				long sum =0;

				for (int k = i; k <= j; k++) {
					sum += arr[k];
				}

				if (sum > max) {
					max = sum;
				}
			}
		}

		return Math.max(0,max);
	}

   
    
        // kadane algo
        public static long maxSubarraySum2(int[] arr, int n) {
    
            // write your code here
            long max = Integer.MIN_VALUE;
            long sum = 0;
    
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
    
                if (sum < 0) { sum = 0 ;}
    
                max = Math.max(sum,max);
            }
    
            return Math.max(0,max);
        }
    
    }
    

