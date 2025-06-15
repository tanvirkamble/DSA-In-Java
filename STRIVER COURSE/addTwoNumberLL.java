public class addTwoNumberLL {
    public static Node addTwoNumbers(Node l1, Node l2) {

        Node temp1 = l1;
        Node temp2 = l2;
        Node carry =  new Node(0);

        Node newHead = new Node(0);
        Node temp3 = newHead;

        while(temp1 != null && temp2 != null){
            int x = temp1.data;
            int y = temp2.data;
            int c = carry.data;

            int sum = x + y + c;
            carry.data = sum / 10;
            sum = sum % 10;

            temp3.next = new Node(sum);
            temp3 = temp3.next;

            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        while(temp1 != null){
            int x = temp1.data;
            int c = carry.data;

            int sum = x + c;
            carry.data = sum / 10;
            sum = sum % 10;

            temp3.next = new Node(sum);
            
            temp3 = temp3.next;
            temp1 = temp1.next;
        }

        while(temp2 != null){
            int x = temp2.data;
            int c = carry.data;

            int sum = x + c;
            carry.data = sum / 10;
            sum = sum % 10;

            temp3.next = new Node(sum);
            
            temp3 = temp3.next;
            temp2 = temp2.next;
        }

        if(carry.data != 0){
            temp3.next = new Node(carry.data);
        }


        return newHead.next;

    }

    public static void main(String[] args) {
         Node l1 = new Node(2);
    l1.next = new Node(4);
    l1.next.next = new Node(3);

    // Creating second number: 5 -> 6 -> 4
    Node l2 = new Node(5);
    l2.next = new Node(6);
    l2.next.next = new Node(4);

    // Add the two numbers
    Node result = addTwoNumbers(l1, l2);

    // Print the result
    while(result != null) {
        System.out.print(result.data + " ");
        result = result.next;
    }
    }

}
