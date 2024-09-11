package HASH;
import java.util.*;

public class hashMap {
   public static void main(String args[]) {
       // Creation of a HashMap with String keys and Integer values
       HashMap<String, Integer> map = new HashMap<>();

       // Insertion of key-value pairs into the map
       map.put("India", 120);  // "India" is the key, 120 is the value
       map.put("US", 30);      // "US" is the key, 30 is the value
       map.put("China", 150);  // "China" is the key, 150 is the value

       // Print the HashMap after initial insertion
       System.out.println("Initial Map: " + map);

       // Update the value associated with the key "China"
       map.put("China", 180);  // Updates "China"'s value to 180
       System.out.println("Updated Map: " + map);

       // Searching for a key in the map
       // Check if the key "Indonesia" exists in the map
       if(map.containsKey("Indonesia")) {
           System.out.println("Key is present in the map");
       } else {
           System.out.println("Key is not present in the map");
       }

       // Get the value associated with the key "China"
       System.out.println("Value for key 'China': " + map.get("China"));  // Key exists
       // Try to get the value for a non-existent key "Indonesia"
       System.out.println("Value for key 'Indonesia': " + map.get("Indonesia"));  // Key doesn't exist (returns null)

       // Iteration (1) - Using Map.Entry to loop through key-value pairs
       System.out.println("\nIterating using Map.Entry:");
       for(Map.Entry<String, Integer> e : map.entrySet()) {
           System.out.println("Key: " + e.getKey() + ", Value: " + e.getValue());
       }

       // Iteration (2) - Iterating through keys using keySet()
       System.out.println("\nIterating using keySet:");
       Set<String> keys = map.keySet();  // Get all the keys in the map
       for(String key : keys) {
           System.out.println(key + " -> " + map.get(key));  // Access value using the key
       }

       // Removing a key-value pair from the map
       map.remove("China");  // Removes the entry with the key "China"
       System.out.println("\nMap after removing 'China': " + map);
   }
}
