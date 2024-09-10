package TREE;
import java.util.*;


public class tree1 {
    static class Node{
        int data;
        Node left;
        Node right;
        
        Node(int x){
            this.data = x;
            this.left = null;
            this.right = null;
        }
    }
    
    static class binaryTree{
        static int i = -1;
        static Node buildTree(int x[]) {
            i++;
            if (x[i] == -1) {
                return null;
            }
            Node newNode = new Node(x[i]);
            newNode.left = buildTree(x);
            newNode.right = buildTree(x);

            return newNode;
        }
    }

    //  PREORDER : root, left subtree, right subtree
    static void preOrder(Node x) {        
        if(x == null){
            System.out.print( -1 + " ");
               // System.out.print( null + " "); // as it is an integer type data
            return;
        }
        System.out.print(x.data + " ");
        preOrder(x.left);
        preOrder(x.right);
    }

    
    //  INORDER : left subtree, root, right subtree
    static void inOrder(Node x) {        
        if(x == null){
            // System.out.print( -1 + " ");
            return;
        }
        inOrder(x.left);
        System.out.print(x.data + " ");
        inOrder(x.right);
    }
    
    //  POSTORDER : left subtree, right,subtree   
    static void postOrder(Node x){
        if(x == null){
          // System.out.print( -1 + " ");
          return;
        }
        postOrder(x.left);
        postOrder(x.right);
        System.out.print(x.data + " ");
    }
    // levelOrder : post nodes by level from left to right
    static void levelOrder(Node x){
        // Create a queue for level-order traversal
        Queue<Node> q = new LinkedList<>();
                
        // Start with the root node in the queue
        q.add(x);
        // Add a marker (null) to indicate the end of the current level
        q.add(null);

        // Traverse the tree
        while (!q.isEmpty()) {
            Node curNode = q.remove();
            
            // If the current node is null, we reached the end of a level
            if (curNode == null) {
                System.out.println();  // Print a new line to separate levels
                
                // If the queue is not empty, add another null marker for the next level
                if (!q.isEmpty()) {
                    q.add(null);
                }
            } else {
                // Print the current node's data
                System.out.print(curNode.data + " ");
                
                // Add left child to the queue
                if (curNode.left != null) {
                    q.add(curNode.left);
                }
                
                // Add right child to the queue
                if (curNode.right != null) {
                    q.add(curNode.right);
                }
            }
        }
    }

    public static void main(String[] args) {
       int  nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};// root is 1
       Node root = binaryTree.buildTree(nodes);
       System.out.println("root node : " + root.data);// should print 1

       System.out.println("PreOrder :");
       preOrder(root);

       System.out.println(" \n" + "InOrder :");
       inOrder(root);
       
       System.out.println(" \n" +"postOrder :");
       postOrder(root);
      
       System.out.println(" \n" +"levelOrder :");
       levelOrder(root);
    }
}
