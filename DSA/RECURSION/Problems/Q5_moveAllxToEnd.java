package RECURSION.Problems;
// move all the elements 'e' to the end of the string
public class Q5_moveAllxToEnd {
// time complexity O(n)  

    public static void moveAllx(int i,String x,String newString,int count, char e){
        if (i == x.length()) {
            for (int j = 0; j < count; j++) {
                newString += e;//abcdxxx
            }
            System.out.println(newString);
            return;
        }

        char currentChar = x.charAt(i);
        if (currentChar == e) {
            count++;
            moveAllx(i+1, x, newString, count, e);
        } else {
            newString += currentChar;// abcd
            moveAllx(i+1, x, newString, count, e);
        } 
        
    } 
    public static void main(String[] args) {
        moveAllx(0, "xabxcxd", "", 0, 'x');
    }
}
