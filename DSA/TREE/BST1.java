package TREE;

public class BST1 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int x){
            this.data = x;
        }
    }

    static Node insert(Node x , int y){
        if (x == null) {
            x = new Node(y);
            return x;
        }

        if (y < x.data ) {
            x.left = insert(x.left, y);
        }
        else{
            x.right = insert(x.right, y);
        }

        return x;
    }
    static void inOrder (Node x){
        if (x == null) {
            // System.out.print(-1 + " ");
            return;
        }

        inOrder(x.left);
        System.out.print(x.data + " ");
        inOrder(x.right);
    }
    public static void main(String[] args) {
        int values[] = {5, 1, 3, 4, 2, 7};
        Node root = null;

        
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inOrder(root);

    }
    
}
