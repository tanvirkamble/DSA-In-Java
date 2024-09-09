package RECURSION;
//x^n n is stack height
public class recursion7 {

    public static int nPower(int x, int n){
        if (n==0) {
            return 1;
        }
        if (x==0){
            return 0;
        }
        
        int a = nPower(x, n - 1); // Recursive call
        int b = x * a; // x multiplied by result of previous power
        return b; // Return the computed value of x^n

    }
    public static void main(String args[]){
     int ans = nPower(2, 4);
     System.out.println(ans);
    }
}

/*
Let's Walk Through an Example:
Suppose we want to calculate 
2
4
2 
4
  (i.e., nPower(2, 4)):

First Call (nPower(2, 4)):

n != 0, so we go to the recursive call: int a = nPower(2, 3);
Second Call (nPower(2, 3)):

n != 0, so we go to the recursive call: int a = nPower(2, 2);
Third Call (nPower(2, 2)):

n != 0, so we go to the recursive call: int a = nPower(2, 1);
Fourth Call (nPower(2, 1)):

n != 0, so we go to the recursive call: int a = nPower(2, 0);
Fifth Call (nPower(2, 0)):

Here, n == 0, so the function returns 1. This is our base case, and we stop the recursion here.
Now Let's Unwind the Recursion:
Returning from Fifth Call (nPower(2, 0)):

Returns 1.
Returning from Fourth Call (nPower(2, 1)):

int a = 1 (result from nPower(2, 0))
int b = 2 * 1 = 2
Returns 2.
Returning from Third Call (nPower(2, 2)):

int a = 2 (result from nPower(2, 1))
int b = 2 * 2 = 4
Returns 4.
Returning from Second Call (nPower(2, 3)):

int a = 4 (result from nPower(2, 2))
int b = 2 * 4 = 8
Returns 8.
Returning from First Call (nPower(2, 4)):

int a = 8 (result from nPower(2, 3))
int b = 2 * 8 = 16
Returns 16.
 */