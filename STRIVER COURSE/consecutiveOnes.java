public class consecutiveOnes {
    public static int consecutiveOnes(int n, int[] arr) {
		// Write your code here.
		int counter = 0;
		int maximum = 0;

		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 1){
				counter++;
				if(counter > maximum){
					maximum = counter;
				}
			}else {
				counter = 0;
			}

		}
		return maximum;
	}
    
}
