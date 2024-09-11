package TREE;

public class BST2 {
    // O(h) - height of node from root
    static class Node {
        int data ;
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

        if (y < x.data) {            
            x.left = insert(x.left, y);
        } else {
            x.right = insert(x.right, y);
        }

        return x;
    }

    static void inOrder(Node x){
        if (x == null) {
            // System.out.println(-1 + " ");
            return ;
        }

        inOrder(x.left);
        System.out.print(x.data + " ");
        inOrder(x.right);
    }

    static boolean search(Node x, int key){
        if (x == null) {
            return false;
        }

        if (key < x.data) {
            return search(x.left, key);
        }
        else if (key == x.data) {
            return true;
        } else {
            return search(x.right, key);
        }
    }

    public static void main(String[] args) {
        int nodes[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for (int i = 0; i < nodes.length; i++) {
            root = insert(root, nodes[i]);
        }
        inOrder(root);
        System.err.println();

        System.out.println(search(root, 14));
    }
}
