package HASH;
import java.util.*;
public class Q3_intersectionOf2Arrays {

    static int intersection(int a[] , int b[]){
        HashSet<Integer> set = new HashSet();
        HashSet<Integer> set2 = new HashSet();
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        
        for (int j = 0; j < b.length; j++) {
            
            if (set.contains(b[j])) {
                count++;
                set2.add(b[j]);
                set.remove(b[j]);
            }   
        }
        System.out.println(set2);
    return count;
    }
    public static void main(String[] args) {
        int a1[] = {7,3,9};
        int a2[] = {6,3,9,2,9,4};

        System.out.println(intersection(a1, a2));
    }
}
