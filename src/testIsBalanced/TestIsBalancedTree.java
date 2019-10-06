package testIsBalanced;

class TreeNode {
    TreeNode left;
    TreeNode right;
    int val;

    TreeNode(int val) {
        this.val = val;
    }
}


public class TestIsBalancedTree {

    public boolean IsBalanced_Solution(TreeNode root) {
        return getDepth(root) != -1;
    }

    private int getDepth(TreeNode root) {//从下往上判断是否是平衡树，如果不是，那么就停止。
        if (root == null)
            return 0;

        int left = getDepth(root.left);
        if (left == -1)
            return -1;

        int right = getDepth(root.right);
        if (right == -1)
            return -1;

        return Math.abs(left - right) > 1 ? -1 : 1 + Math.max(left, right);
    }

}
