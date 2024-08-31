package DSA.RECURSION.Problems;
// tower of hanoi
public class Q1_TOH {
    // time complexity O((2)^n-1) ~ O((2)^n)
    static int x = 0;// value static throughout
    public static void toh(int n, String source,String helper,String destination) {
        if (n == 0){
            return;
        } 
        toh(n-1,source,destination,helper);
        x=x+1;
        System.out.println("Step " + x + ": Transferring the " + n + "th disc from " + source + " to " + destination);
        toh(n-1, source, helper, destination);
        
    }

    public static void main(String args[]){
       
         int n = 4;
         toh(n, "source stand", "helper stand", "destination stand");
    }
}

// no. of steps for n discs is [ (2)^n - 1]  => for n = 3 its 8-1=7 => for n=4 its 16-1=15


/*

n=1 

toh(1, S, H, D)
|
|-- toh(0, S, D, H) // Base case: return
|
|-- Move Disk 1 from S to D
|
|-- toh(0, H, S, D) // Base case: return

*/

/*  

n-2

toh(2, S, H, D)
|
|-- toh(1, S, D, H)
|   |
|   |-- toh(0, S, H, D) // Base case: return
|   |
|   |-- Move Disk 1 from S to H
|   |
|   |-- toh(0, D, S, H) // Base case: return
|
|-- Move Disk 2 from S to D
|
|-- toh(1, H, S, D)
    |
    |-- toh(0, H, D, S) // Base case: return
    |
    |-- Move Disk 1 from H to D
    |
    |-- toh(0, S, H, D) // Base case: return

*/

/*

n=3

toh(3, S, H, D)
|
|-- toh(2, S, D, H)
|   |
|   |-- toh(1, S, H, D)
|   |   |
|   |   |-- toh(0, S, D, H) // Base case: return
|   |   |
|   |   |-- Move Disk 1 from S to D
|   |   |
|   |   |-- toh(0, H, S, D) // Base case: return
|   |
|   |-- Move Disk 2 from S to H
|   |
|   |-- toh(1, D, S, H)
|       |
|       |-- toh(0, D, H, S) // Base case: return
|       |
|       |-- Move Disk 1 from D to H
|       |
|       |-- toh(0, S, D, H) // Base case: return
|
|-- Move Disk 3 from S to D
|
|-- toh(2, H, S, D)
    |
    |-- toh(1, H, D, S)
    |   |
    |   |-- toh(0, H, S, D) // Base case: return
    |   |
    |   |-- Move Disk 1 from H to S
    |   |
    |   |-- toh(0, D, H, S) // Base case: return
    |
    |-- Move Disk 2 from H to D
    |
    |-- toh(1, S, H, D)
        |
        |-- toh(0, S, D, H) // Base case: return
        |
        |-- Move Disk 1 from S to D
        |
        |-- toh(0, H, S, D) // Base case: return
*/
