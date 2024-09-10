package TREE;

public class tree4 {
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
            if (x[i] == -1) {
                return null;
            }
            Node newNode = new Node(x[i]);
            newNode.left = buildTree(x);
            newNode.right = buildTree(x);
            return newNode;

        }
    }
    static int heightOfNodes(Node x){
        if (x == null) {
            return 0;
        }
        int leftNodesHeight = heightOfNodes(x.left);
        int rightNodesHeight = heightOfNodes(x.right);

        int height = Math.max(leftNodesHeight, rightNodesHeight) + 1;

        return height ;
    }
    public static void main(String[] args) {
        int  nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = binaryTree.buildTree(nodes);
        // System.out.println(root.data);
        System.out.println(heightOfNodes(root));

    }
}
