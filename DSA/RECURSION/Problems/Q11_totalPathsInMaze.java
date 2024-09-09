package RECURSION.Problems;

public class Q11_totalPathsInMaze {

    public static int no_Paths(int i ,int j, int n , int m){
         
       if (i==n || j==m) {
        return 0;
       }
       if (i==n-1 && j==m-1) {
        return 1;
       }
       //go down
       int downwardsPath = no_Paths(i+1, j, n, m);
       //go right
       int rightwardsPath = no_Paths(i, j+1, n, m);

       return downwardsPath + rightwardsPath;

    }

    public static void main(String[] args) {
        int n=3;
        int m=3;
        int count =  no_Paths(0, 0, n, m);
        System.out.println(count);
    }
    
}

/*
Starting point (0, 0)
         |
         v
(0, 0) → (0, 1) → (0, 2)  → Out of bounds (0, 3)
  |        |        |
  v        v        v
(1, 0) → (1, 1) → (1, 2)  → (1, 3) Out of bounds
  |        |        |
  v        v        v
(2, 0) → (2, 1) → (2, 2)  → (2, 3) Out of bounds
  |        |        |
  v        v        v
Out of   Out of    Reached
bounds   bounds    (end)

Path count starts combining upwards.
*/

/*
 GRID : 
        (0,0) (0,1) (0,2)
        (1,0) (1,1) (1,2)
        (2,0) (2,1) (2,2)

 visual representation:

    Start: (0,0)
    ├─ Right: (0,1)
    │   ├─ Right: (0,2)
    │   │   ├─ Down: (1,2) → (2,2) → Destination (1)
    │   │   └─ Down: (1,2) → (2,2) → Destination (1)
    │   └─ Down: (1,1)
    │       ├─ Right: (1,2) → (2,2) → Destination (1)
    │       └─ Down: (2,1) → (2,2) → Destination (1)
    └─ Down: (1,0)
        ├─ Right: (1,1)
        │   ├─ Right: (1,2) → (2,2) → Destination (1)
        │   └─ Down: (2,1) → (2,2) → Destination (1)
        └─ Down: (2,0)
            └─ Right: (2,1) → (2,2) → Destination (1)

 */