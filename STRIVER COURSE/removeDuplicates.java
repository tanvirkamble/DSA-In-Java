import java.util.*;
public class removeDuplicates {
    public static int removeDuplicates(int[] arr,int n) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
                arr[index++]= arr[i];
            }
        }

        return index;
        
    
}
}
