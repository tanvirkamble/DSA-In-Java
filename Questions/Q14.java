package Questions;

import java.util.*;

public class Q14 {
    public static List<Integer> commonElements(int a[], int b[],int c[]){
        List<Integer>  common = new ArrayList<Integer>(); 
        int x=0,y=0,z=0;

        while (x < a.length && y< b.length && z<=c.length) {
            //if intersection is found add it
            if (a[x] == b[y] && b[y] == c[z]) {
                common.add(a[x]);
                x++;
                y++;
                z++;
                // Skip duplicate elements in A[]
                while(x < a.length && a[x] == a[x-1]){x++;}
                while(y < b.length && b[y] == b[y-1]){y++;}
                while(z < c.length && c[z] == c[z-1]){z++;}
            }
            //if a[x] is smaller than b[y] check in the next position and viceversa for rest
            else if (a[x] < b[y]){x++;}
            else if (b[y] < c[z]){y++;}
            else {z++;}

        }
        return common;
        
    }
    public static void main(String[] args) {
         // Sample Input
        int[] A = { 1, 5, 10, 20, 30 };
        int[] B = { 5, 13, 15, 20 };
        int[] C = { 5, 20 };

        List<Integer> common = commonElements(A, B, C);

        System.out.print("Common Elements: ");
        for (int ele : common) {
            System.out.print(ele + " ");
        }
    }
}
