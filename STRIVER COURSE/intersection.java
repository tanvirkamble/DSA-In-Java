import java.util.ArrayList;

public class intersection {
    //brute
    public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m)
	{
		// Write Your Code Here.
		// brute force

		 // to cheack if the element in second arr already taken or not
		// int viewedElement[] = new int [m];
		boolean viewedElement[] = new boolean [m];
		ArrayList<Integer> ans = new ArrayList<>();

		for (int i = 0; i < arr1.size(); i++) {
			for (int j = 0; j < arr2.size(); j++) {
				if(arr1.get(i).equals(arr2.get(j)) && !viewedElement[j]){
					 ans.add(arr1.get(i));
					 viewedElement[j] = true;
					 break;
				}
			}
		}
		
		return ans;
	}

    //optimal
    public static ArrayList<Integer> findArrayIntersection2(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m)
	{
		// Write Your Code Here.
		// optimal

		int i = 0,j = 0;
		ArrayList<Integer> ans = new ArrayList<>();

		while(i < n && j < m){
			if(arr1.get(i).equals(arr2.get(j))){
				ans.add(arr1.get(i));
				i++;
				j++;
			} else if (arr1.get(i) < arr2.get(j)){
				i++;
			}
			else {
				j++;
			}
		}

		return ans;
	}
}
