package Questions;
import java.util.*;

public class Q9 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();
        int[] arr1 = {1, 3, 4, 5, 7};
        int[] arr2 = {2, 3, 5, 6} ;

        for (int i : arr1) {
            set.add(i);
        }
        for (int i : arr2) {
            if (set.contains(i)) {
                intersection.add(i) ;
            }
        }

        for (int i : arr2) {
            set.add(i);
        }
        System.out.println(intersection);
        System.out.println(set);
    }
}
