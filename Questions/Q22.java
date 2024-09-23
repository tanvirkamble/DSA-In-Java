package Questions;
import java.util.*;


public class Q22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("no. of dealerships : ");
        int n = scanner.nextInt();

        int car[] = new int [n];
        int bike[] = new int [n];
        int tyre[] = new int [n];

        
        for (int i = 0; i < n; i++) {
            System.out.println("no. of car and bike at dealership : " + i);
            car[i] = scanner.nextInt(); 
            bike[i] = scanner.nextInt();           
        }
        
        System.out.println("total dealership = " + n);

        for (int i = 0; i < n; i++) {
            tyre[i] = (car[i]*4) + (bike[i]*2);
            System.out.println("tyres at dealership "+ (i+1) +" = " + tyre[i]);
        }

        scanner.close();
    }
}
