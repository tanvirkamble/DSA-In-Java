package Questions;
import java.util.*;

public class Q13 {
    public static int[] duplicates(int a[]){
        HashSet<Integer> set = new HashSet<>();
        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
                set.add(a[i]); 
                b.add(a[i]);
        }
        if(set.contains(b)){
            set.remove(b);
                };
        return int[];
    }

    public static void main(String[] args) {
        int array[]={1, 2, 3, 6, 3, 6, 1};
        duplicates(array);
    }
    
}
