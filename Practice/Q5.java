package Practice;

public class Q5 {
    public static int majorityElement(int a[]){
    for (int i = 0; i < a.length; i++) {
       int count = 0; 
        for (int j = 0; j < a.length; j++) {
            if (a[i] == a[j]) {
                count++;
            }
        }
        if (count > a.length/2)  {
           return a[i];
        }
    }   
    return -1; 
    }
     
    public static void main(String[] args){
        int[] arr = {1, 1,2,2,2,2,2,2,2, 1, 3, 5, 1};

        System.out.println(majorityElement(arr));
    }
}
