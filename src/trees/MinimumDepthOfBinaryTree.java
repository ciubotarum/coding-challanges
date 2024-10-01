package trees;

public class MinimumDepthOfBinaryTree {
//    The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
//
//    Note: A leaf is a node with no children.
//
//    Example 1:
//    Input: root = [3,9,20,null,null,15,7]
//    Output: 2

//    Example 2:
//    Input: root = [2,null,3,null,4,null,5,null,6]
//    Output: 5
    public static int minDepth(trees.TreeNode root) {
        if (root == null) {
            return 0;
        }

//        int leftHeight = height(root.left);
//        int rightHeight = height(root.right);
//        if (leftHeight == 0) {
//            return rightHeight + 1;
//        }
//        if (rightHeight == 0) {
//            return leftHeight + 1;
//        }
//        System.out.println(leftHeight);
//        System.out.println(rightHeight);
//
//        return Math.min(leftHeight, rightHeight) + 1;

        // If one of the subtrees is null, we return the depth of the other subtree.
        // This handles the case where one subtree is missing (only left or only right).
        if (root.left == null) {
            return minDepth(root.right) + 1;
        }
        if (root.right == null) {
            return minDepth(root.left) + 1;
        }

        // If both subtrees exist, return the minimum depth of both
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }

//    public static int height(TreeNode node) {
//        if (node == null) {
//            return 0;
//        }
//
//        return 1 + Math.max(height(node.left), height(node.right));
//    }

    public static void main(String[] args) {
        // Representation of input binary tree 1
        //        3
        //       / \
        //      9   20
        //         /  \
        //        15   7
//        trees.TreeNode root = new trees.TreeNode(3);   // 2
//        root.left = new trees.TreeNode(9);
//        root.right = new trees.TreeNode(20);
//        root.right.right = new trees.TreeNode(7);
//        root.right.left = new trees.TreeNode(15);

        // Representation of input binary tree 2
        //        2
        //         \
        //          3
        //           \
        //             4
        //              \
        //               5
        //                \
        //                 6
//        trees.TreeNode root = new trees.TreeNode(2);   // 5
//        root.right = new trees.TreeNode(3);
//        root.right.right = new trees.TreeNode(4);
//        root.right.right.right = new trees.TreeNode(5);
//        root.right.right.right = new trees.TreeNode(6);

        // Representation of input binary tree 3
        // [-9, -3, 2, null, 4, 4, 0, -6, null, -5]
        //         -9
        //       /    \
        //     -3      2
        //       \    / \
        //        4  4   0
        //       /
        //     -6
        //       \
        //        -5
        trees.TreeNode root = new trees.TreeNode(-9);   // 3
        root.left = new trees.TreeNode(-3);
        root.right = new trees.TreeNode(2);
        root.right.right = new trees.TreeNode(0);
        root.right.left = new trees.TreeNode(4);
        root.left.right = new trees.TreeNode(4);
        root.left.right.left = new trees.TreeNode(-6);
        root.left.right.left.right= new trees.TreeNode(-5);

        System.out.println(minDepth(root));
    }
}
