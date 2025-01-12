public class Q1_largestElement {
    public static void main(){
        int a[] = {1,3,4,5,6};
        int largest = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest) {
                largest = a[i];
            }
        }
        System.out.println(largest);
    }
}
