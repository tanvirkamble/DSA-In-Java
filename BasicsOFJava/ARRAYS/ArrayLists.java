package BasicsOFJava.ARRAYS;
import java.util.*;

public class ArrayLists {

    public static void main(String[] args) {
        
        // types of arraylist Integer | Float | Boolean | String
        ArrayList<Integer> list1 = new ArrayList<>();
        /*ArrayList<Boolean> list2 = new ArrayList<>();
        ArrayList<Float> list3 = new ArrayList<>();
        ArrayList<String> list4 = new ArrayList<>();*/
        
        // add elements
        list1.add(0); 
        list1.add(2); 
        list1.add(4);
        list1.add(412);
        list1.add(32);
        list1.add(23);
        System.out.println(list1); 
        
        // get elements
        int x = list1.get(2);
        System.out.println(x); 
        
        //add element in between the arraylist
        list1.set(1, 3);
        System.out.println(list1); 
        
        //remove
        list1.remove(1);
        System.out.println(list1); 
        
        //set element
        list1.set(0,24 );
        System.out.println(list1); 
        
        //size 
        int y = list1.size();
        System.out.println(y);
        
        //for loop in arraylist
        for (int i = 0; i < list1.size(); i++) {
            System.out.println("for loop prints " + list1.get(i) + " at " + (i));
        }
        
        //sort
        Collections.sort(list1);
        System.out.println(list1); 
    }
}
 