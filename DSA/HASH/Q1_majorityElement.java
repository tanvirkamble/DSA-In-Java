package HASH;
import java.util.*;

public class Q1_majorityElement {

    public static void MajorityElement(int num[]){
        int x = num.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < num.length; i++) {
            if (map.containsKey(num[i])) {
                map.put(num[i] , map.get(num[i]) + 1 );
            } else {
                map.put(num[i] ,  1 );
            }
        }

        for (int k : map.keySet()) {
            if (map.get(k) > x/3) {
                System.out.println(k);
            }
        } 
    } 

    public static void main(String[] args) {


        // int num[] = {1,3,2,5,1,3,1,5,1};  //1
        int num[] ={1,2};//1,2 
        MajorityElement(num);
        
    }
    
}
