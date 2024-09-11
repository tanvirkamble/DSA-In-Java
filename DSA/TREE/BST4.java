package TREE;

public class BST4 {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int x){
            this.data = x;
        }
    }

    static void InOrder(Node x){
        if (x == null) {
            return ;
        }

        InOrder(x.left);
        System.out.print(x.data + " ");
        InOrder(x.right);
    }

    static Node insertNode(Node x, int y){
        if (x == null) {
            x = new Node(y);
            return x;
        }

        if (y < x.data) {
            x.left = insertNode(x.left, y);
        }
        else {
            x.right = insertNode(x.right, y);
        }
        return x;
    }

    static void inRangeNodes(Node r, int x, int y){
        if (r == null) {
            return;
        }
        if (x <= r.data && y >= r.data) {
            inRangeNodes(r.left, x, y);   
            System.out.print(r.data + " ");
            inRangeNodes(r.right, x, y);   
        }
        else if (r.data <= x) {
            inRangeNodes(r.right, x, y);
        } else {
            inRangeNodes(r.left, x, y);
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1,23,4,52,443,434,241,24,53,421};
        Node root = null;

        for (int i=0 ; i< nodes.length ; i++) {
            root = insertNode(root, nodes[i]);
        }

        InOrder(root);
        System.out.println();

        inRangeNodes(root,24,241);
    }
}
 