package trees;

public class SameTree {
    //    Given the roots of two binary trees p and q, write a function to check if they are the same or not.
//
//    Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
    public static boolean isSameTree(TreeNode p, TreeNode q) {

        // If both trees are empty, they are identical
        if (p == null && q == null)
            return true;

        // If only one tree is empty, they are not identical
        if (p == null || q == null)
            return false;

        if (p.val == q.val) {
            if (isSameTree(p.left, q.left)) {
                return isSameTree(p.right, q.right);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Representation of input binary tree 1
        //        1
        //       / \
        //      2   3
        //     /
        //    4
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);
        p.left.left = new TreeNode(4);

        // Representation of input binary tree 2
        //        1
        //       / \
        //      2   3
        //     /
        //    4
        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);
        q.left.left = new TreeNode(4);

        System.out.println(isSameTree(p,q));
    }
}


