import java.util.*;
public class union {
    public static List< Integer > sortedArray(int []a, int []b) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }   
        for (int i = 0; i < b.length; i++) {
            set.add(b[i]);
        } 
        List<Integer> union = new ArrayList<>(set);

        return union;
    }
}
