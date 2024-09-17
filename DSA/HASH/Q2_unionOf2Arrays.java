package HASH;
import java.util.*;

class Q2_unionOf2arrays{
    static int Union(int a1[], int a2[]){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < a1.length; i++) { 
            set.add(a1[i]);
        }
        for (int i = 0; i < a2.length; i++) { 
            set.add(a2[i]);
        }

        System.out.println(set);
        return set.size();
    }

    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};

        System.out.println("union size = "+Union(arr1,arr2));
    }
}