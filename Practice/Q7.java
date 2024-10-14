package Practice;
import java.util.*;

public class Q7 {
    public static boolean isSubsetUsingHashing(int a[],int b[]){
        HashSet<Integer> set = new HashSet<>();

        for (int i : a) {
            set.add(i);
        }

        for (int i : b) {
            if (!set.contains(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        int[] arr1 = { 11, 1, 13, 21, 3, 7 };
        int[] arr2 = { 11, 3, 7, 1 };

        if (isSubsetUsingHashing(arr1, arr2)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
