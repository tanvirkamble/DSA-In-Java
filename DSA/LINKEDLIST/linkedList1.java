package DSA.LINKEDLIST;
import java.util.*;

public class linkedList1 {
    public static void main(String[] args) {
       LinkedList <String> list = new LinkedList<>();

       list.add("is");
       list.addFirst("this");
       list.add("xyz");
       list.addLast("list");
       list.add(3,"loved");
       list.set(2,"a");
       System.out.println(list);

       System.out.println(list.get(0));
       System.out.println(list.size());
       list.remove(3);
       list.removeFirst();
       list.removeLast();
      
       System.out.println(list);
    }
}
