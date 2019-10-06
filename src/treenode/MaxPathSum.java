package treenode;

//最大联通路径

public class MaxPathSum {

    private int maxVal = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        if (root == null)
            return 0;
        maxCore(root);
        return maxVal;
    }
    // 该函数返回是左右的最大路径和，而非左+右+root的最大值
    // 使用curValue，来标记左+右+root
    private int maxCore(TreeNode root) {
        if (root == null)
            return 0;
        // 求以root为根的当前子树的最大路径和
        // 如果左右子树都是负数，
        // 那么就最大路径就是当前结点值（无论正负）
        int curValue = root.val;
        int lmax = maxCore(root.left);
        int rmax = maxCore(root.right);
        if (lmax > 0)
            curValue += lmax;
        if (rmax > 0)
            curValue += rmax;
        maxVal = Math.max(curValue, maxVal);
        // 返回以当前root为根的子树的最大路径和
        // 左右有可能都为负数，所以需要参与比较大小
        int thisMax = Math.max(root.val,
                Math.max(lmax + root.val, rmax + root.val));
        return thisMax;
    }
}
