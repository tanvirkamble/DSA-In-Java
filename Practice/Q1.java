package Practice;

public class Q1 {
    static int max(int[] a){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(max < a[i]){
                max = a[i];
            }
        }
        return max;
        
    }
    static int min(int[] a){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(min > a[i]){
                min = a[i];
            }
        }
        return min;

    }
    public static void main(String args[]){
        int[] A = { 4, 9, 6, 5, 2, 3,10 };
        System.out.println(min(A));
        System.out.println(max(A));
    }
    
}
