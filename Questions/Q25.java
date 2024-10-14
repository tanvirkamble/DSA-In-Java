package Questions;
import java.util.*;
class Q25{
    public static String occ(String s){
        StringBuilder x = new StringBuilder();
        int count =1;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == s.charAt(i-1)){
                count++;
            }else{
                x.append(s.charAt(i-1));
                x.append(count);
                count = 1;
            }
        }
        x.append(s.charAt(s.length()-1));
        x.append(count);
        return x.toString();

    }
  public static void main(String[] args) {
    String input = "aabbbbeeeeffggg";
        System.out.println(occ(input));  // Output: a2b4e4f2g3
  }
}