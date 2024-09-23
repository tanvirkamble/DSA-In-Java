package Questions;

public interface Q18 {
    public static String reduceString(String input){
        StringBuilder result = new StringBuilder();
        int count = 1;
        
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i-1)) {
                count++;
            } else {
                result.append(input.charAt(i-1));
                result.append(count);
                count = 1;//intialize
            }
        }
        // appened the last charachter
        result.append(input.charAt(input.length() - 1 )).append(count);
        return result.toString();
    }
    public static void main(String[] args) {
        String input = "aabbbbeeeeffggg";
        System.out.println(reduceString(input));  // Output: a2b4e4f2g3
    }
}
