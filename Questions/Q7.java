package Questions;

public class Q7 {
    public static void main(String[] args) {
        int [] a ={1,2,3,-3,1,1,1,4,2-3} ;
        int k = 3;//sum of subarrays to be found
        int count = 0;// count of subarrays exist

        //O(n) = x^3
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                int sum = 0;
                for (k = i; k <= j; k++) {
                    sum = sum + a[k];
                }
                if (k == sum) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
