package TREE;

public class BST3 {
    static class Node {
        int data ;
        Node left;
        Node right;
        Node(int x){
            this.data = x;
        }
    }
    //for practice
    static boolean searchNode(Node x, int key){
        if (x == null) {
            return false;
        }

        if (key < x.data) {
            return searchNode(x.left, key);
        }
        else if(key == x.data){
            return true;
        }
        else{
            return searchNode(x.right, key);
        }
    }

    static Node insertNode(Node x, int y){
        if( x == null ){
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

    static void inOrder(Node x){
        if (x == null) {
            // System.out.print(-1 + " ");
            return;
        }

        inOrder(x.left);
        System.out.print(x.data + " ");
        inOrder(x.right);
    }

    static Node deleteNode(Node x, int y){
        // First, find the node to delete by comparing y with x.data
        if (y < x.data) {
            // If the value to be deleted is smaller, go to the left subtree
            x.left = deleteNode(x.left, y);
        } else if (y > x.data) {
            // If the value to be deleted is larger, go to the right subtree
            x.right = deleteNode(x.right, y);
        } else {
            // Case 1: The node has no children (leaf node)
            if (x.left == null && x.right == null) {
                return null;
            }

            // case 2 : if the y node have one child
            if (x.left == null) {
                // If only right child exists, replace the node with its right child
                return x.right;
            } else if (x.right == null) {
                // If only left child exists, replace the node with its left child
                return x.left;
            }

            //case 3 : if the y node has two child nodes
            else{
                // Find the in-order successor (smallest node in the right subtree)
                Node IS = inOrderSuccessor(x.right);//as successor is to check the next/successing node

                // Replace the node's data with the in-order successor's data
                x.data = IS.data;
                // Delete the in-order successor from the right subtree
                x.right = deleteNode(x.right, IS.data);
            }

        }

        return x;
    }

    static Node inOrderSuccessor(Node x){
        //checking the next lowest node OR the left most node in the NOW right sub-tree
        while ( x.left != null) {
            // Keep moving left until we find the leftmost node
            x = x.left;
        }

        return x;
    }


    public static void main(String[] args) {
        int nodes[] = {1,34,54,5,4,32,56,6};
        Node root = null;

        for (int i = 0; i < nodes.length; i++) {
            root = insertNode(root, nodes[i]);
        }

        inOrder(root);
        System.out.println();

        //for practice
        System.out.println(searchNode(root, 54));

        deleteNode(root,54);
        System.out.println("after deletion ");
        inOrder(root);
    }
}
