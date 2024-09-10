package TREE;

public class tree6 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){}
        TreeNode(int x){ this.val = x;}
        TreeNode(int x, TreeNode y,TreeNode z){ 
            this.val = x;
            this.left = y;
            this.right = z;
        }
    } 
    
    class Solution{
        public boolean isIdentical(TreeNode x, TreeNode y){
            if (x == null && y == null) {
                return true;
            }
            if (x == null || y == null) {
                return false;
            }
            if (x.val == y.val) {
                return isIdentical(x.left, y.left) && isIdentical(x.right, y.right);
            }

            return false;
        }

        public boolean isSubTree(TreeNode x, TreeNode y){
            if (y == null) {
                return true;
            }
            if (x == null) {
                return false;
            }

            if (x.val == y.val) {
                if (isIdentical(x, y)) {
                    return true;
                }
            }

            // as the one node matches you go further down on child nodes of this rooot node to check if the other nodes are matched or not
            return isSubTree(x.left, y) || isSubTree(x.right, y);
        }
    }

    public static void main(String[] args) {
             // Example usage: you would need to create instances of TreeNode and Solution to test.
             tree6 obj = new tree6();
             Solution sol = obj.new Solution();
             
             // Example tree: manually building two trees to test isSubTree
             TreeNode tree1 = obj.new TreeNode(1);
             tree1.left = obj.new TreeNode(2);
             tree1.right = obj.new TreeNode(3);
             tree1.left.left = obj.new TreeNode(4);
             tree1.left.right = obj.new TreeNode(5);
     
             TreeNode tree2 = obj.new TreeNode(2);
             tree2.left = obj.new TreeNode(4);
             tree2.right = obj.new TreeNode(5);
     
             // Check if tree2 is a subtree of tree1
             System.out.println("Is tree2 a subtree of tree1? " + sol.isSubTree(tree1, tree2));
    }
    
}
