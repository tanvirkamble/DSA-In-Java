package BasicsOFJava.ARRAYS;

import java.util.*;

public class array2 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number[] = new int[n];
        
        //  input
        for (int i = 0;i < n; i++){
            System.out.println("input no." + i);
            number[i]=sc.nextInt();
        } 
        
        int x = sc.nextInt(); ; //the no, to be found so makesure to add in will adding inputs in array

       
        boolean found = false;
        // Output 
        for (int i = 0; i < n; i++) {
            if (number[i] == x) {
                System.out.println("Number " + x + " found at position " + i);
                found = true;
                break; // Exit the loop once the number is found
            }
        }

        if (!found) {
            System.out.println("Value " + x + " doesn't exist at any array position.");
        }
       sc.close();
   
       }
}
