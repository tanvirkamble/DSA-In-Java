package RECURSION.Problems;

public class Q4_isSorted {
// time complexity O(n)  

    public static boolean checkIfSorted(int arr[],int i){

        if(i == arr.length-1){
            return true;
        }

        /*if(arr[i+1] > arr[i]){
            return checkIfSorted(arr, i+1);
        }else{
            return false;
        }*/

        if(arr[i+1] < arr[i]){
            return false;
        }
        return checkIfSorted(arr, i+1);

    }
    public static void main(String[] args) {
        // int arr[] = {1,2,3};// =>t
        int arr[] = {1,2,2};// =>f
        // int arr[] = {1,3,2};// =>f
        boolean x = checkIfSorted(arr, 0);
        System.out.println(x);
    }
}
