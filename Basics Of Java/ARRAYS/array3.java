import java.util.*;

public class array3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int number[][] = new int [r][c];

        for (int i = 0; i < r; i++) {
            
            for (int j = 0; j < c; j++) {
                number[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < r; i++) {
            System.out.println();
            for (int j = 0; j < c; j++) {
                System.out.print(number[i][j] + " "   );
            }
        }
        sc.close();

        
    }
}
