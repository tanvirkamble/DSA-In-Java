package DSA.RECURSION.Problems;
//remove the duplicates
public class Q6_removeDuplicates {
// time complexity O(n)  

    // Array to track which characters have been encountered
    public static boolean map[] = new boolean[26]; // all the 26 indexes are false initially

    public static void remove(int i, String x, String y) {
        if (i == x.length()) {
            System.out.println(y);
            return;
        }

        char currentChar = x.charAt(i);

        // Check if the character has been seen before
        if (map[currentChar - 'a'] == true) {
            // If seen, skip this character and move to the next
            remove(i + 1, x, y);
        } else {
            // If not seen, add the character to the result string
            y += currentChar;
            // Mark this character as seen by setting the corresponding index to true
            map[currentChar - 'a'] = true;
            remove(i + 1, x, y);
        }
    }

    public static void main(String[] args) {
        remove(0, "asdfasdasd", "");
    }
}



/*  Initial State: All indices of map are false, meaning no characters have been processed yet.
After Processing: Once a character is encountered, the corresponding index in map is set to true to indicate that the character has been seen */