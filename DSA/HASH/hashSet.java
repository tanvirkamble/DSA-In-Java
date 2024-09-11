package HASH;
import java.util.*;

public class hashSet {
    public static void main(String[] args) {
        
        // Create a new HashSet to store integer values
        HashSet<Integer> set = new HashSet<>();

        // Add elements to the set
        set.add(1);
        set.add(12);
        set.add(4);
        set.add(42);
        set.add(42);  // Duplicate element, will not be added
        set.add(5);

        // Print the entire set (duplicates are automatically removed)
        System.out.println("HashSet elements: " + set);
        
        // Print the size of the set (number of unique elements)
        System.out.println("Size of HashSet: " + set.size());

        // Check if certain elements exist in the set
        System.out.println("HashSet contains 1: " + set.contains(1)); // true
        System.out.println("HashSet contains 9: " + set.contains(9)); // false

        // Remove an element from the set
        set.remove(42);
        System.out.println("HashSet contains 42 after removal: " + set.contains(42)); // false

        // Print the set after removing an element
        System.out.println("HashSet after removal: " + set);

        // Using an iterator to traverse the HashSet
        Iterator<Integer> it = set.iterator();  // Create an iterator for the HashSet
        while(it.hasNext()) {  // Correct way to iterate through the set
            System.out.print(it.next() + " ");  // Print each element in the set
        } 
        System.out.println();  
        
        // Remove all elements from the set to check if isEmpty() works
        set.clear();

        // Check again if the set is empty
        if (set.isEmpty()) {
            System.out.println("HashSet is now empty after clearing.");
        } else {
            System.out.println("HashSet is still not empty.");
        }
    }
}
