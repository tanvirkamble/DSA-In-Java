package Questions;
//duthc flag problem
public class Q6 {
    public static void sort012(int[] x){
        int c0=0,c1=0,c2=0;// counts of 0,1,2
            for (int i = 0; i < x.length; i++) {
                if (x[i] == 0) {
                    c0++;
                }
                if (x[i] == 1) {
                    c1++;
                }
                if (x[i] == 2) {
                    c2++;
                }
            }
        int idx = 0;
        for (int i = 0; i < c0; i++) {
            x[idx++] = 0;
        }
        for (int i = 0; i < c1; i++) {
            x[idx++] = 1;
        }
        for (int i = 0; i < c2; i++) {
            x[idx++] = 2;
        }
    }
    public static void main(String[] args) {

        int[] a ={0, 1, 2, 0, 1, 2};
        sort012(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
}
