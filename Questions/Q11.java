package Questions;

public class Q11 {
    public static int missingNumber(int a[], int n){
        int currentSum = 0;

        for (int i = 0; i < a.length; i++) {
            currentSum += a[i];
        }

        //expected sum for n numbers(including the missing number) is
        int sum = (n*(n+1))/2;

        return sum - currentSum;

    }
    public static void main(String[] args) {
        // int a[] = {1,2,3,5};
        int a[] =  {1, 2, 4, 6, 3, 7, 8};
        int n = a.length + 1;
        int x = missingNumber(a,n);
        System.out.println(x);
    }
}
