package Questions;

import java.util.*;

public class Q20 {
    public static void count (int a[]){
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0 ; i < a.length ; i++) {
            map.put(a[i], map.getOrDefault(i,0) + 1 ) ;}

        for (HashMap.Entry<Integer,Integer> i : map.entrySet()) {
            System.out.println("count at " + i.getKey() + " is " + i.getValue());
        }
        
        }
    
    public static void main(String[] args) {
        int arr[] = {1,3,2,3,1,13,3,3,2,2};
        count(arr);
    }
}
