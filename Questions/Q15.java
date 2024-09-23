package Questions;

public class Q15 {
    static int firstNonRepeating(int arr[], int n){

        for (int i = 0; i < arr.length; i++) {
            int count = 0;//count of nonrepeating
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count ++;
                }
            }
            if (count == 1) {
                return arr[i];
            }
        }
        return -1;
    }

    
    public static void main(String[] args)
    {
 
        int arr[] = { 9, 4, 9, 6, 7, 4 };
        int n = arr.length;
 
        System.out.print(firstNonRepeating(arr, n));
    }
}
