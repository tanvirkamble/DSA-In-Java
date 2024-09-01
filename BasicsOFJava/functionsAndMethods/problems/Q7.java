// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 
package BasicsOFJava.functionsAndMethods.problems;
import java.util.*;

public class Q7 {
    public static void main(String atrgs[]){
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int [] arr = new int [b];
        
    
        for(int i = 0 ; i < b; i++  ){
            int a = sc.nextInt();
            arr[i] = a;
            
           
                // Determine the case to use in the switch statement
                int category = (a > 0) ? 1 : (a < 0) ? -1 : 0;
    
                // Use the switch statement to determine the output
                switch (category) {
                    case 1:
                        System.out.println(a + " is positive");
                        break;
                    case -1:
                        System.out.println(a + " is negative");
                        break;
                    case 0:
                        System.out.println(a + " is zero");
                        break;
                    default:
                        System.out.println("Unknown value");
                        break;
                }
            }
            sc.close();
            }
        }
    
            // if (a > 0) {
            //     System.out.println(a + " is positive");
            // } else if (a < 0) {
            //     System.out.println(a + " is negative");
            // } else {
            //     System.out.println(a + " is zero");
            // }
    



