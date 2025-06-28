import java.util.*;

class DLLgivePairsEqualToSum{
    public static List<List<Integer>> findPair(Node head, int sum){
        Node temp = head;
        ArrayList<List<Integer>> ans = new ArrayList<>();
        while(temp!= null){
            Node temp2 = temp.next;
            while(temp2!= null){
                if(temp.data + temp2.data == sum) {
                    List<Integer> n = new ArrayList<>();
                    n.add(temp.data);
                    n.add(temp2.data);
                    ans.add(n);
                } 
                temp2 =temp2.next;
            }
            temp =temp.next;
        }

        return ans;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head.next = second; second.prev = head;
        second.next = third; third.prev = second;
        third.next = fourth; fourth.prev = third;
        fourth.next = fifth; fifth.prev = fourth;

        int target = 5;
        List<List<Integer>> result = findPair(head, target);

        for (List<Integer> pair : result) {
            System.out.println(pair);
        }    }
}