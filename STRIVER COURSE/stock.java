import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
public class stock {

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
        int min = prices.get(0);
        int maxProfit = 0;

        for (int i = 1; i < prices.size(); i++) {
            int c = prices.get(i) - min;
            maxProfit = Math.max(maxProfit, c);
            min = Math.min(min, prices.get(i));
        }
        return maxProfit;
    }
}
}
