package Questions;
import java.util.*;


public class Q7 {
    public static void count(int[] a, int sum){
        int count = 0;
        int checksum;

        for (int i = 0; i < a.length; i++) {
            checksum = a[i];
            if (checksum == sum) {
                count++; 
                System.out.println("sum at postion " + i);               
            }
            else {
                for(int j=i+1; j < a.length ; j++){
                    checksum = checksum + a[j];
                    if (checksum == sum) {
                        count++;
                        System.out.println("from "+ i + " to " + j);
                    }
                }
            }
        }
        System.out.println(count);
    }

   public static ArrayList<Integer> subarraySum(int[] a, int n, int sum){
        ArrayList<Integer> x = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            int checksum = a[i];
            if (checksum == sum) {
                x.add(i);
                return x;
            }  else {
                for (int j = i+1; j < n; j++) {
                    checksum = checksum + a[j];
                    if (checksum == sum) {
                        x.add(i);
                        x.add(j);
                        return x;
                    }
                }
            }   
        }
        x.add(-1);
        
        return x;       
   }

    public static void main(String[] args)
    {
        // int[] arr = { 15, 2, 4, 8, 9, 5, 10, 23 };
        // int[] arr = {1, 4, 0, 0, 3, 10, 5};
        // int[] arr = {1, 4};
        // int[] arr = { 23 };
        int[] arr = { 1,2,3,-3,1,1,1,4,2,-3};


        int n = arr.length;

        // int sum = 23;
        // int sum = 7;
        // int sum = 2;
        // int sum = 23;
        int sum = 3;
        ArrayList<Integer> result
            = subarraySum(arr, n, sum);
        for (int i : result)
            System.out.print("position : "+i + " ");
        System.out.println();
        count(arr, sum);
    }
    }

