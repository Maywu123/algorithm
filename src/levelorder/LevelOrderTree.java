package levelorder;

import java.util.*;

/**
 * 层次遍历二叉树
 * Z型
 */
public class LevelOrderTree {

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> res = new ArrayList<List<Integer>>();
        LinkedList<TreeNode> linkedList = new LinkedList<TreeNode>();

        boolean flag = true;
        if (root == null){
            return res;
        }

        linkedList.add(root);

        while(linkedList.size() != 0){
            flag = !flag;
            int size = linkedList.size();
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < size; i++){

                TreeNode temp = linkedList.remove();
                list.add(temp.val);

                if(temp.left != null){
                    linkedList.add(temp.left);
                }
                if(temp.right != null){
                    linkedList.add(temp.right);
                }

                if(flag){
                    Collections.reverse(list);
                }
                res.add(list);
            }
        }
        return res;
    }
}
