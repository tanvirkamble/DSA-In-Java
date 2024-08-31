import java.util.*;
public class array4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int number[][] = new int [r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("add input for  position" +i + j);
                number[i][j] = sc.nextInt();
            }            
        }
        System.out.println("add input value whose postion in the array is to be found" );
        int x = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if(number[i][j] == x) {
                System.out.println("the position of array is " +i + j);
                found = true;
                break; // Exit the loop once the number is found
                }
            }            
        }

         if (!found) {
            System.out.println("Value " + x + " doesn't exist at any array position.");
        }
        sc.close();
    }
}
