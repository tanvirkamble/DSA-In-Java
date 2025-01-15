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

    // optimal approach - two pointr
    public static List< Integer > sortedArray2(int []a, int []b) {
        int i = 0;
        int j = 0;

        ArrayList<Integer> union = new ArrayList<>();
        
        while ( i < a.length && j < b.length) {
            

        if (a[i] < b[j]){
            if( !union.contains(a[i]) ) {
            union.add(a[i]);
            }
            i++;
        }
        else if (b[j] < a[i]){
            if( !union.contains(b[j]) ) {
            union.add(b[j]);
            }
            j++;
        } else {
            // if both elements are same 
            if( !union.contains(b[j]) ) {
            union.add(b[j]);
            }
            j++;
            
        }
        }


        while (i < a.length) {
            if( !union.contains(a[i]) ) {
            union.add(a[i]);
            }
            i++;
         }

        while (j < b.length) {
              // if both elements are same 
            if( !union.contains(b[j]) ) {
            union.add(b[j]);
            }
            j++;
            
        }
        return union;
    }
}
