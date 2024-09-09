package SORTING;
public class MERGESORT {

    public static void conquer(int arr[],int startIdx,int middleIdx ,int endIdx){

        int newMergedArr [ ] = new int [endIdx - startIdx  + 1]; // as startindex will always be zero so 0 to n-1 , adding one would get us the length

        // two intials of divided array
        int idx1 = startIdx ; //idx1 is initialized to startIdx, pointing to the beginning of the first sorted subarray.
        int idx2 = middleIdx + 1 ;//idx2 is initialized to middleIdx + 1, pointing to the beginning of the second sorted subarray
        
        //position of the array
        int x = 0;

        // This loop continues until either of the two pointers (idx1 or idx2) reaches the end of their respective subarray.
        while (idx1 <= middleIdx && idx2 <= endIdx) {
            // f arr[idx1] is less than or equal to arr[idx2], arr[idx1] is added to newMergedArr, and idx1 is incremented.
            if (arr[idx1] <=  arr[idx2]) {
                 newMergedArr[x++] = arr[idx1++];
            } 
            // Otherwise, arr[idx2] is added to newMergedArr, and idx2 is incremented.
            else {
                newMergedArr[x++] = arr[idx2++];
            }

        }

        //Copy Remaining Elements from the First Subarray (if any) - both sub aray may not be of the same size
        while (idx1 <= middleIdx ) {
            newMergedArr[x++] = arr[idx1++];
        }

        // Copy Remaining Elements from the Second Subarray (if any)- both sub aray may not be of the same size
        while (idx2 <= endIdx) {
            newMergedArr[x++] = arr[idx2++];
        }
        
        for (int i = 0, j = startIdx; i < newMergedArr.length; i++, j++) {
            arr[j] = newMergedArr[i];
        }
    }
    public static void divide(int arr[],int startIdx, int endIdx){
         if (startIdx >= endIdx){
            return;
         }

         int middleIdx = startIdx + (endIdx - startIdx)/2 ; // => (startidx + endidx) /2 

         divide(arr, startIdx, middleIdx);
         divide(arr, middleIdx + 1, endIdx);
         conquer(arr, startIdx, middleIdx, endIdx);
    }

    public static void main (String args[]){
        int arr[] = {2,4,6,6,3,9,5};

        divide(arr,0,arr.length-1);

        //print 
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
