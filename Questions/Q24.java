package Questions;
import java.util.*;

public class Q24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("total no. of sems : ");
        int total = scanner.nextInt();
        int[] maxMarksArray = new int[total];

        for (int i = 1; i <= total; i++) {
            
            System.out.println("enter the no. of sub in sem " + i + " : ");
            int n = scanner.nextInt();
            int marks[] = new int[n];

            int maxMarks = 0;

            for (int j = 0; j < n; j++) {
                System.out.println("marks obtained in sem "+ i + "are : ");
                int m = scanner.nextInt();
                if(m < 0 || m > 100){
                    System.out.println("not valid");
                    j--;
                } else {
                    marks[j] = m;
                    if (m > maxMarks) {
                        maxMarks = m;
                    }
                }
            }
            System.out.println("max mark for sem "+ i + " is " + maxMarks);
            maxMarksArray[i] = maxMarks;
            
        }
        System.out.println("\nMaximum marks for each semester:");
        for (int i = 0; i < total; i++) {
            System.out.println("Max marks for semester " + (i + 1) + ": " + maxMarksArray[i]);
        }
        scanner.close();
    }
}
