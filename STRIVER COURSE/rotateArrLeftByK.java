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
}
