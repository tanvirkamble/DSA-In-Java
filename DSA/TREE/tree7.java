package TREE;
import java.util.*;
// sum of nodes at kth level
public class tree7 {

    class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int x) {
            this.data = x;
            this.left = null;
            this.right = null;
        }
    }

    static class Solution {
        static int sumOfLevel(TreeNode x , int k){
            if (x == null) {
                return 0;
            }

            Queue<TreeNode> q =new LinkedList<>();
            q.add(x);
            int sum = 0;
            int level = 0;
            while(!q.isEmpty()){
                int levelsize = q.size();
                sum = 0;
                for (int i = 0; i < levelsize; i++) {
                    TreeNode currNode = q.poll();
                    // level matches? add the treenodes
                    if (level == k) {
                        sum += currNode.data;
                    }
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
            }
            if (level == k) {
                break;
            }
            level++; // Move to the next level
        }
            return sum;
        }

        // static int sumOfNodes(TreeNode x){
        //     if (x == null) {
        //         return 0;
        //     }

        //     int left = sumOfNodes(x.left);
        //     int right = sumOfNodes(x.right);

        //     return left + right + x.data;
            
        // }

        // Static method to perform level-order traversal and print the nodes
        // static void levelOrder(TreeNode root) {
        //     if (root == null) {
        //         return;
        //     }

        //     Queue<TreeNode> queue = new LinkedList<>();
        //     queue.add(root);
        //     queue.add(null); // Marker for the end of a level

        //     while (!queue.isEmpty()) {
        //         TreeNode currNode = queue.poll();

        //         if (currNode == null) {
        //             System.out.println(); // End of a level
        //             if (!queue.isEmpty()) {
        //                 queue.add(null); // Add marker for the next level
        //             }
        //         } else {
        //             // Print the current node's data
        //             System.out.print(currNode.data + " ");

        //             // Add left and right children to the queue
        //             if (currNode.left != null) {
        //                 queue.add(currNode.left);
        //             }
        //             if (currNode.right != null) {
        //                 queue.add(currNode.right);
        //             }
        //         }
        //     }
        // }
    }

    public static void main(String[] args) {
        tree7 obj = new tree7();

        // Build the tree
        TreeNode tree1 = obj.new TreeNode(1);
        tree1.left = obj.new TreeNode(2);
        tree1.right = obj.new TreeNode(3);
        tree1.left.left = obj.new TreeNode(4);
        tree1.left.right = obj.new TreeNode(5);

        // Solution.levelOrder(tree1);
        // System.out.println(Solution.sumOfNodes(tree1));;

        System.out.println(Solution.sumOfLevel(tree1, 1));
    }
}
