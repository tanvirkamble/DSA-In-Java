package TREE;

public class tree5 {
//time complexity of O((n)^2)
    static class Node {
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
        static int i =-1;
        static Node buildtree(int x[]){
            i++;
            if (x[i] == -1) {
                return null;
            }

            Node newNode = new Node(x[i]);
            newNode.left = buildtree(x);
            newNode.right = buildtree(x);
            return newNode;

        }
    }

    static int heightOfNodes(Node x){
        if (x == null) {
            return 0;
        }
        
        int leftNodesHeight = heightOfNodes(x.left);
        int rightNodesHeight = heightOfNodes(x.right);

        return Math.max(leftNodesHeight, rightNodesHeight) + 1; 

    }

    static int diameter(Node x){
        if (x == null) {
            return 0;
        }

        int leftNodesDiameter = diameter(x.left);
        int rightNodesDiameter = diameter(x.right);
        //explained below
        int rootDiameter = heightOfNodes(x.left) + heightOfNodes(x.right) + 1;

        int d1 = Math.max(leftNodesDiameter, rightNodesDiameter);
        int d2 = Math.max(d1, rootDiameter);

        return d2;
    }

    public static void main(String[] args) {
        int  nodes[] = {9,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = binaryTree.buildtree(nodes);
        // System.out.println(root.data);
        // System.out.println(heightOfNodes(root));
        System.out.println(diameter(root));

    }
}

// rootDiameter represents the longest path that passes through the current root node.
// It is calculated by adding the height of the left subtree, the height of the right subtree,
// and 1 (for the current root node itself). This measures the longest path that crosses 
// through the root node, connecting the farthest nodes from the left and right subtrees.
//
// For example, consider the following tree:
//             1
//           /   \
//          2     3
//         / \     \
//        4   5     6
//
// The diameter of the tree is the longest path between two leaf nodes.
// In this case, the longest path is 4 -> 2 -> 1 -> 3 -> 6, which passes through the root (1).
// The rootDiameter for node 1 will be the height of the left subtree (2) + height of the right subtree (2) + 1.
// Therefore, rootDiameter = 2 + 2 + 1 = 5.


