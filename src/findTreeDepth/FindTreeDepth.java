package findTreeDepth;


import java.util.Queue;
import java.util.LinkedList;

class TreeNode{
    TreeNode left;
    TreeNode right;
    int val;

    TreeNode(int val){
        this.val = val;
    }
}

public class FindTreeDepth {
    public static void main(String[] args) {

    }

    public static int findDepth(TreeNode root) {//非递归树的深度，层次遍历

        if (root == null)
            return 0;

        int depth = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (queue.size() != 0) {
            int size = queue.size();
            depth++;

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null)
                    queue.add(root.left);
                if (root.right != null)
                    queue.add(root.right);
            }


        }
        return depth;
    }

    public static int findDepth2(TreeNode root) {//递归树的深度

        if(root == null)
            return 0;

        int left = findDepth2(root.left);
        int right = findDepth2(root.right);

        return Math.max(left,right) + 1;
    }
}
