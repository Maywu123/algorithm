package treenode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
/*
     1
  3     5
4   6      7
*/
public class Bianli {

    public static void main(String[] args){

        TreeNode root=init();

        System.out.println("先序遍历");
        preOrder(root);
        System.out.println();

        System.out.println("中序遍历");
        inOrder(root);
        System.out.println();

        System.out.println("后序遍历");
        postOrder(root);
        System.out.println();

        System.out.println("层次遍历");
        levelOrder(root);
        System.out.println();
    }



    public static TreeNode init() {


        TreeNode f = new TreeNode(7);
        TreeNode e = new TreeNode(6);
        TreeNode d = new TreeNode(4);
        TreeNode c = new TreeNode(5);
        TreeNode b = new TreeNode(3);
        TreeNode a = new TreeNode(1);
        return a;//返回根节点
    }

    //前序遍历按照“根结点-左孩子-右孩子”的顺序进行访问。
    public static void preOrder(TreeNode root) {//134657
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (node != null || !stack.empty()) {
            if (node != null) {
                System.out.print(node.val + "->");
                stack.push(node);
                node = node.left;
            } else {
                TreeNode tem = stack.pop();
                node = tem.right;
            }
        }
    }

    //中序遍历，左根右
    public static void inOrder(TreeNode root) {//436157
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (node != null || !stack.isEmpty()) {
            if (node != null) {
                stack.push(node);
                node = node.left;
            } else {
                TreeNode tem = stack.pop();
                System.out.print(tem.val + "->");
                node = tem.right;
            }
        }
    }

    //后续遍历，左右根
    public static void postOrder(TreeNode root) {//463751
        Stack<TreeNode> stack = new Stack<>();
        Stack<TreeNode> output = new Stack<>();//构造一个中间栈来存储逆后续遍历的结果
        TreeNode node = root;
        while (node != null || !stack.empty()) {
            if (node != null) {
                output.push(node);
                stack.push(node);
                node =  node.right;
            } else {
                node = stack.pop();
                node = node.left;
            }
        }//逆序存放在output栈中，只需要将output中的给pop出去就行了

        while (output.size() > 0) {
            System.out.println(output.pop().val+"->");
        }
    }

        //层次遍历
    public static void levelOrder(TreeNode root) {//135467
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();//头结点出队并从队列中删除
            System.out.print(node.val + "->");

            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }

}
