package TREE;
import java.util.*;

public class BST5 {
    static class Node{
        int data;
        Node left,right;

        Node(int x){
            this.data = x ;
        }
    }

    static void Inorder(Node x){
        if (x == null) {
            return ;
        }
        Inorder(x.left);
        System.out.print(x.data + " ");
        Inorder(x.right);
    }

    static Node insertNodes(Node x, int y ){
        if (x == null) {
            x = new Node(y);
            return x;
        }

        if (y < x.data) {
            x.left = insertNodes(x.left, y);
        } else {
            x.right = insertNodes(x.right, y);
        }
        return x;
    }

    // Function to print the path from the root to a leaf node
    static void printPath(ArrayList<Integer> path) {
        // Loop through the list of nodes representing the path
        for (int i = 0; i < path.size(); i++) {
            // Print each node followed by an arrow (->) to indicate the path
            System.out.print(path.get(i) + "->");
        }
        System.out.println();  // Move to the next line after printing the path
    }

    // Recursive function to search for all root-to-leaf paths
    static void searchRootToLeaf(Node x, ArrayList<Integer> path) {
        if (x == null) {
            return;  // Base case: if the node is null, return (end of a branch)
        }

        // Add the current node's value to the path
        path.add(x.data);

        // Check if the current node is a leaf node (no left and right children)
        if (x.left == null && x.right == null) {
            printPath(path);  // If it's a leaf node, print the current path
        }
        // If the current node is not a leaf, recursively search left and right subtrees
        else {
            searchRootToLeaf(x.left, path);   // Search the left subtree
            searchRootToLeaf(x.right, path);  // Search the right subtree
        }

        // After traversing the subtrees, backtrack by removing the current node from the path
        path.remove(path.size() - 1);
    }


    public static void main(String[] args) {
        int nodes1[] = {1,23,4,52,443,434,241,24,53,421};
        
        Node root1 = null;

        for (int i=0 ; i< nodes1.length ; i++) {
            root1 = insertNodes(root1, nodes1[i]);
        }

        Inorder(root1);
        System.out.println();

        searchRootToLeaf(root1, new ArrayList<>());
        System.out.println();

        int nodes2[] = {8, 5, 3, 1, 4, 6 ,10, 11, 14};

        Node root2 = null;

        for (int i = 0; i < nodes2.length; i++) {
            root2 = insertNodes(root2, nodes2[i]);
        }

        Inorder(root2);
        System.out.println();

        searchRootToLeaf(root2,new ArrayList<>());
        }
}
