package TREE;

public class tree3 {
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

    static int sumOfNOdes(Node n){
        if (n == null) {
            return 0;
        }
        int leftNodeSum = sumOfNOdes(n.left);
        int rightNodeSum =sumOfNOdes(n.right) ;
        return leftNodeSum + rightNodeSum + n.data ;
    }

    public static void main(String[] args) {
        int  nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        Node root = binaryTree.buildTree(nodes);
        System.out.println(sumOfNOdes(root));
    }
}
