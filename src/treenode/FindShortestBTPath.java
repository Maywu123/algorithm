package treenode;

import java.util.*;

/**
 * 寻找最短的二叉搜索的路径，从根节点到叶子结点
 *
 * @author jinfeng
 *
 */

public class FindShortestBTPath {

    // 用来记录所有的路径
    private ArrayList<ArrayList<Integer>> allPaths = new ArrayList<ArrayList<Integer>>();
    // 用来记录一条路径
    private ArrayList<Integer> onePath = new ArrayList<Integer>();

    // 返回所有的路径
    public ArrayList<ArrayList<Integer>> FindAllPath(TreeNode root) {
        if(root == null)
            return allPaths;

        // 把当前结点加入到路径当中来
        onePath.add(root.val);

        // 如果为叶子结点，则把onePath加入到allPaths当中
        if(root.left == null && root.right == null){
            allPaths.add(new ArrayList<Integer>(onePath));
        }

        FindAllPath(root.left);
        FindAllPath(root.right);

        // 这个地方可以通过画递归树来理解，无论叶子结点是左结点还是右结点，都会经过下面这一步，而且至关重要
        onePath.remove(onePath.size() - 1);
        return allPaths;
    }

    public static void main(String[] args) {

    }
}
