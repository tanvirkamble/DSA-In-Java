
public class rotateArrLeftByOne {
    static int[] rotateArray(int[] arr, int n) {
        // store the first array element in temp
        // then move all the array to left by one 
        // at he end place the first ele at last empty postn
        int temp = arr[0];
        for(int i = 1 ; i < n ; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
        
        return arr;
    }
    
    static int[] rotateArray2(int[] arr, int n) {
        // create arr2 of size n store ele from postn 1 to n-1
        // then add arr[0] at nth place
        int arr2[] = new int [n];
        for(int i = 1  ; i < n; i++){
            arr2[i-1] = arr[i];
        }
        arr2[n-1] = arr[0];
        return arr2;
    }
}
