package Questions;
import java.util.*;

public class Q12 {
     public static int count(int a[], int target){
            int sum = 0;
            int count = 0;
            for (int i = 0; i < a.length; i++) {
                for (int j = i+1; j < a.length; j++) {
                    
                    sum = a[i] + a[j];
                    if (sum == target) {
                        count++;
                    }
                }
            }
            return count;
     }

     public static int count2(int a[], int target){
        HashSet<Integer> set = new HashSet<>();
        for (int i : a) {
            set.add(i);
        }
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            int compliment = target - a[i];
            if (set.contains(compliment)) {
                count++;
            }
        }
        return count;
     }
    public static void main(String[] args) {
        // int arr[] = {1,5,7,-1,5};
        int arr[] ={1,1,1,1};
        int x = count(arr, 2);
        System.out.println(x);
        int y =count2(arr, x);
        System.out.println(y);// not working
    }
}
