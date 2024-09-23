package Questions;
import java.util.*;

public class Q16 {

    static int countSubarrWithEqualZeroAndOne(int a[], int n){
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int count = 0;
        for(int i =0; i < n ; i++) {
            if(a[i] == 0)
                a[i] = -1;

            sum = sum + a[i];

            if (sum == 0) {
                count++;
            }

            if (map.containsKey(sum)) {
                count = count + map.get(sum);
            }
            if (!map.containsKey(sum)) {
                map.put(sum,1);
            }
            else{
                map.put(sum, map.get(sum)+1);
            }
        }
        return count ;
    }
    
    // main function
    public static void main(String[] args)
    {
        int arr[] = { 1, 0, 0, 1, 0, 1, 1 };
        int n = arr.length;
        System.out.println(
            "Count = "
            + countSubarrWithEqualZeroAndOne(arr, n));
    }
}

