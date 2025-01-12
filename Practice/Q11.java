package Practice;

public class Q11 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,3,2,44,5};
         
        for (int j = 0; j < a.length-1 ; j++) {

        for (int i = 0; i < a.length-1 ; i++) {
            if (a[i] < a[i+1]) {
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            }
        }
    
        }

        for (int i : a) {
            System.out.print(i);
        }
    }
}
