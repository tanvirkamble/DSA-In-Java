package Questions;
// Find a peak element which is not smaller than its neighbours

public class Q1 {
    // Input: arr[]= {5, 10, 20, 15}
    // Output: 20
    // Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20.

    // Input: arr[] = {10, 20, 15, 2, 23, 90, 90}
    // Output: 20 or 90
    // Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20, similarly 90 has neighbors 23 and 67.

    // Input: arr[] = [1, 1, 1]
    // Output : 1
    // Explanation: All elements are peak in the given array, we can return any of them
    public static void main(String args[]){
        int[] a = {1,2,3,4,5,6,7,8,5,1};
        // int[] a = {10,11,12,13,23,90,67};
        // int[] a = {1,1,1};
        // int[] a = {15};
        // int[] a = {20,10,15};
        // int[] a = {10,15,40};

        for(int i = 0 ; i < a.length ; i++){
            if((i == 0 || a[i] >= a[i-1]) && (i== a.length-1 || a[i] >= a[i+1]) ){
                System.out.println("NUMBER: "+a[i]);
                System.out.println("POSITION: "+i);
                break;
            }
        }
        
    }
}
