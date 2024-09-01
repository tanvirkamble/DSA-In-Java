package DSA.RECURSION.Problems;

public class Q12_placeTiles {
    public static int countOfPlacements(int n,int m){

        if (n==m) {
           return 2;            
        }
        if (n<m) {
           return 1;            
        }
        
        int verticalPlacements = countOfPlacements(n-m, m);
        int horizontalPlacements = countOfPlacements(n-1, verticalPlacements) ;

        return verticalPlacements+horizontalPlacements;
    }
    public static void main(String[] args) {
        int n = 5;
        int m = 4;
        int x = countOfPlacements(n, m);
        System.out.println(x);
    }
}

/*
    countOfPlacements(5, 4)
    ├─ Vertical Placement: countOfPlacements(1, 4)
    │  ├─ Vertical Placement: countOfPlacements(-3, 4) (Invalid, out of bounds)
    │  └─ Horizontal Placement: countOfPlacements(1, 3)
    │     ├─ Vertical Placement: countOfPlacements(-3, 3) (Invalid, out of bounds)
    │     └─ Horizontal Placement: countOfPlacements(1, 2)
    │        ├─ Vertical Placement: countOfPlacements(-3, 2) (Invalid, out of bounds)
    │        └─ Horizontal Placement: countOfPlacements(1, 1)
    │           ├─ Vertical Placement: countOfPlacements(-3, 1) (Invalid, out of bounds)
    │           └─ Horizontal Placement: countOfPlacements(1, 0) (Base case)
    │
    └─ Horizontal Placement: countOfPlacements(5, 3)
    ├─ Vertical Placement: countOfPlacements(1, 3)
    │  ├─ Vertical Placement: countOfPlacements(-3, 3) (Invalid, out of bounds)
    │  └─ Horizontal Placement: countOfPlacements(1, 2)
    │     ├─ Vertical Placement: countOfPlacements(-3, 2) (Invalid, out of bounds)
    │     └─ Horizontal Placement: countOfPlacements(1, 1)
    │        ├─ Vertical Placement: countOfPlacements(-3, 1) (Invalid, out of bounds)
    │        └─ Horizontal Placement: countOfPlacements(1, 0) (Base case)
    |
    └─ Horizontal Placement: countOfPlacements(5, 2)
        ├─ Vertical Placement: countOfPlacements(1, 2)
        │  ├─ Vertical Placement: countOfPlacements(-3, 2) (Invalid, out of bounds)
        │  └─ Horizontal Placement: countOfPlacements(1, 1)
        │     ├─ Vertical Placement: countOfPlacements(-3, 1) (Invalid, out of bounds)
        │     └─ Horizontal Placement: countOfPlacements(1, 0) (Base case)
        └─ Horizontal Placement: countOfPlacements(5, 1)
            ├─ Vertical Placement: countOfPlacements(1, 1)
            │  ├─ Vertical Placement: countOfPlacements(-3, 1) (Invalid, out of bounds)
            │  └─ Horizontal Placement: countOfPlacements(1, 0) (Base case)
            └─ Horizontal Placement: countOfPlacements(5, 0) (Base case)

 */
