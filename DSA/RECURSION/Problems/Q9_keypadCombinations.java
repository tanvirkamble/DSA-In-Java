package DSA.RECURSION.Problems;

public class Q9_keypadCombinations {
    // Keypad mapping array where index represents digit and value represents the letters associated with that digit
    public static String keypad[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    // Recursive function to generate combinations based on the keypad mapping
    public static void keypadComb(int i, String x, String combo) {
        // Base case: if the index equals the length of the input string, print the combination
        if (i == x.length()) {
            System.out.print(combo + ", ");
            return;
        }

        // Get the current character from the input string
        char currentChar = x.charAt(i);
        // Map the character to the corresponding keypad letters
        String mappingOfCombo = keypad[currentChar - '0'];

        // Recurse for each letter mapped to the current digit
        for (int j = 0; j < mappingOfCombo.length(); j++) {
            keypadComb(i + 1, x, combo + mappingOfCombo.charAt(j));
        }
    }

    public static void main(String[] args) {
        keypadComb(0, "23", "");
    }
}
