import java.util.*;
public class majorityElement {
    //better
    public static int majorityElement1(int []v) {
        // Write your code here
        int n = v.length / 2;

        HashMap <Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < v.length; i++) {
            map.put(v[i] , map.getOrDefault(v[i], 0)+1);
        }

        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue() >= n) {
                return e.getKey();
            }
        }

        return -1;

        
        
    }
    //optimal in terms of space
    
    public static int majorityElement2(int []v) {
        // Write your code here
        int n = v.length / 2;
        int count = 0;
        int e = 0; 

        for (int i = 0; i < v.length; i++) {
            // if (!e) {
            //     e = v[i];
            //     count++;
            // }
            if (count == 0){
                e = v[i];
                count++;
            }
            else if(e == v[i]){
                count++;
            }else {
                count--;
            }
        }
        count=0;
        for (int i : v) {
            if (e == i) {
                count++;
            }
        }


       if ( count > n ){
           return e;
       }

          

        return -1;

        
}}

