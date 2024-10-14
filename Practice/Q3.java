package Practice;
import java.util.*;

public class Q3 {
    public static void occureneces(int a[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i : a) {
            map.put(i, map.getOrDefault(i,0) + 1);
        }

        for (Map.Entry<Integer,Integer> e : map.entrySet()) {
            if(e.getValue() > 1){
                System.out.println(e.getKey() + " occurs " + e.getValue() + " times");
            }
        }

    }
    public static void duplicates(int a[]){
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> dup = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            if(!seen.add(a[i])){
                dup.add(a[i]);
            }
        }

        for (Integer integer : dup) {
            System.out.println(integer);
        }

    }
    public static void main(String args[]){
        int[] arr = {1, 2, 3, 4, 5, 6, 2, 4, 4};  // Example array with duplicates
        occureneces(arr);
        duplicates(arr);
    }
}
