import java.util.HashMap;
import java.util.Map;

public class singElement {
    public static int getSingleElement(int []arr){
        // Write your code here.
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == num) {
                    count++;
                }
            }
            if (count == 1){
                return num;
            }
        }
        return -1;
    }
    //better
        public static int getSingleElement2(int []arr){
        // Write your code here.
        HashMap <Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], (map.getOrDefault(arr[i], 0)) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey(); // Return the single element
            }
        }
        return -1;
    }
}

