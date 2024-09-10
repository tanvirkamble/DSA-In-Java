package TREE;

public class tree2 {
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
        static Node buildTree(int x[]){
            i++;
            // Base case: if the current element is -1, return null (no node)
            if (x[i] == -1) {
                return null;
            }
            Node newNode = new Node(x[i]);
            newNode.left = buildTree(x);
            newNode.right = buildTree(x);

            return newNode;

        }
    }
    static int count(Node x){
        // Base case: if the node is null, return 0 (no node)
        if (x == null) {
            return 0;
        }
        // Recursively count the nodes in the left and right subtrees
        int leftNodes = count(x.left);
        int rightNodes = count(x.right);

        return leftNodes + rightNodes + 1;
    }
    public static void main(String[] args) {
        
        int  nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = binaryTree.buildTree(nodes);
        System.out.println("Total number of nodes in the tree: " + count(root));  // Output the node count

    }
}
