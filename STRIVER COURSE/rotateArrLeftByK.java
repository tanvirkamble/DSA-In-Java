import java.util.ArrayList;
public class rotateArrLeftByK {

	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.
        k = k % arr.size();
        ArrayList<Integer> arr2 = new ArrayList<>();


        for (int i = 0; i < k; i++) {
                arr2.add(arr.get(i));
        }

        for (int i = k; i < arr.size(); i++) {
                arr.set(i-k,arr.get(i));
        }

        int j = 0;
        for (int i = arr.size()-k; i < arr.size(); i++) {
                arr.set(i, arr2.get(j));
                j++;
        }
         

        return arr;
    }
        // second approach
        
        public static void reverse(ArrayList<Integer> a, int start, int end){
                while(start <= end){
                        int temp = a.get(start);
                        a.set(start, a.get(end));
                        a.set(end,temp);
                        start++;
                        end--;
                }

        } 
	public static ArrayList<Integer> rotateArray2(ArrayList<Integer> arr, int k) {
        // Write your code here.
        k = k % arr.size();
        
        int n = arr.size();
        reverse(arr, 0, k-1);
        reverse(arr, k , n-1);
        reverse(arr, 0, n-1);

        return arr;
    }
}
