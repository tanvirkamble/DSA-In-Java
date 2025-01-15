import java.util.Arrays;
import java.util.HashMap;

public class twoSum {
    //brute
    public static String read(int n, int []book, int target){
        // Write your code here.
        
        for (int i = 0; i < book.length; i++) {
            int eg = book[i];
            for (int j = i+1 ; j < book.length; j++) {
                if (eg + book[j] == target) {
                    return "YES";
                }
            }
        }
        return "NO";
    }

    //better
    public static String read2(int n, int []book, int target){
        // Write your code here.
        HashMap <Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < book.length; i++) {
                map.put(book[i], i);
            }

        for (int i = 0; i < book.length; i++) {
            int x = target - book[i] ;
            if (map.containsKey(x)) {
                return "YES";
            }
        } 

        return "NO";   

        }

    //better
    public static String read3(int n, int []book, int target){
        // Write your code here.
        HashMap <Integer, Integer> map = new HashMap<>();
        
      
        // Single loop to check and populate the HashMap
        for (int i = 0; i < book.length; i++) {
            int complement = target - book[i]; // Calculate the complement
            if (map.containsKey(complement)) {
                return "YES"; // If complement exists, return YES
            }
            // Add the current book price to the map
            map.put(book[i], i);
        }

        return "NO"; // No valid pair found   

        }

        //optimal
    public static String read4(int n, int []book, int target){
        // if the array is sorted
        Arrays.sort(book);

        // Write your code here.
        int a = 0;
        int b = n-1;

        while( a < b){
            int sum = book[a]  + book[b];

            if (sum == target) {
                return "YES";
            }
            else if ( sum < target) {
                a++;
            } else {
                b--;
            }
        }

        return "NO";
        }
    
}
