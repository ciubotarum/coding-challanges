package trees;

public class HeightBalancedTree {
    public static boolean isBalanced(trees.TreeNode root) {

        if (root == null) {
            return true;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if (Math.abs(leftHeight - rightHeight) <= 1 && isBalanced(root.left) && isBalanced(root.right)) {
            return true;
        }

        return false;
    }

    public static int height(trees.TreeNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(height(node.left), height(node.right));
    }

    public static void main(String[] args) {
        // Representation of input binary tree 1
        //        3
        //       / \
        //      9   20
        //         /  \
        //        15   7
        trees.TreeNode root = new trees.TreeNode(3);   // true
        root.left = new trees.TreeNode(9);
        root.right = new trees.TreeNode(20);
        root.right.right = new trees.TreeNode(7);
        root.right.left = new trees.TreeNode(15);

        // Representation of input binary tree 1
        //        1
        //       / \
        //      2   2
        //    /  \
        //   3     3
        //  / \
        // 4   4
//        trees.TreeNode root = new trees.TreeNode(3);   // false
//        root.left = new trees.TreeNode(9);
//        root.right = new trees.TreeNode(20);
//        root.right.right = new trees.TreeNode(7);
//        root.right.left = new trees.TreeNode(15);

        System.out.println(isBalanced(root));
    }
}
