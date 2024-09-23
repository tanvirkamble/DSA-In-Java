package Questions;

public class Q5 {
    public static int Count(int[] x, int a) {
        int c = 0;
        for (int i = 0; i < x.length; i++) {
            if(x[i] == a){
                c++;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        // int[] a = {1, 1, 2, 2, 2, 2, 3};
        int[] a = {1, 1, 2, 2, 2, 2, 2, 2, 3};
        int i = Count(a,2);
        int j = Count(a,4);
        System.out.println(i);
        System.out.println(j);
    }
}
