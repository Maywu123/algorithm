package bst;

public class BST {

    public static void main(String[] args){
        TreeNode root=null;
        int a[]={60,86,50,40,35,74,51,100,37,90};
        for(int i=0;i<10;i++) {
            insertNode(root,0,a[i]);
        }
        inOrder(root);
        boolean is=delete(root,3);
        System.out.println(is);


    }
    public static TreeNode findNode(TreeNode root,int key){//关键字段
        TreeNode current = root;
        while(current.index != key){
            if(key < current.index){//左节点
                current = current.left;
            }else{//右节点
                current = current.right;
            }
            if(current == null){
                return null;
            }
        }
        return current;
    }

    public static void insertNode(TreeNode root,int key,int value){
        TreeNode node = new TreeNode();
        node.index = key;
        node.val = value;

        if(root == null){
            root = node;
            return;
        }
        //找到插入节点的位置
        TreeNode parent = root;
        TreeNode current = root;
        while(true){
            parent = current;
            if(key == current.index){
                return;
            }
            if(key < current.index){//左节点
                current = current.left;
                if(current == null){//当前节点已经是叶子结点了
                    parent.left = node;
                    return;
                }
            }else{
                current = current.right;
                if(current == null){
                    parent.right = node;
                    return;
                }
            }
        }
    }

    public static void inOrder(TreeNode root) {//中序遍历
        if (root != null) {
            inOrder(root.left);
            System.out.println("索引：" + root.index + ",值：" + root.val);
            inOrder(root.right);
        }
    }

    public static boolean delete(TreeNode root,int key) {
        TreeNode current = root;
        TreeNode parent = root;
        boolean isLeftChild = true;
        //找到被删除的节点，并标识该节点是否为左节点
        while (current.index != key) {
            parent = current;
            if (key < current.index) {
                isLeftChild = true;
                current = current.left;
            } else {
                isLeftChild = false;
                current = current.right;
            }
            if (current == null) {
                return false;
            }
        }
        //第一种情况，删除节点为子节点
        if (current.left == null && current.right == null) {
            if (current == root) {
                root = null;
            } else {
                if (isLeftChild) {
                    parent.left = null;
                } else {
                    parent.right = null;
                }
            }
        } else if ((current.left != null && current.right == null) || (current.left == null && current.right != null)) {
            //第二中情况，删除节点只包含一个子节点，则将子节点移动动当前节点中
            if (current.right == null) {//删除的节点的左节点有值，右节点为空
                if (root == current) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {//删除的节点的右节点有值，左节点为空
                if (root == current) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            }
        } else if (current.left != null && current.right != null) {
            //第三种情况，删除节点中有左右两个节点
            //找到后继节点
            TreeNode processer = processer(current);
            if (current == root) {//删除是根节点，则
                root = processer;
            } else {
                if (isLeftChild) {
                    parent.left= processer;
                } else {
                    parent.right = processer;
                }
            }
            //选中的节点的左节点与删除节点的左节点相连
            processer.left = current.left;
        }
        return true;
    }

    //找到后继节点
    private static TreeNode processer(TreeNode delNode) {
        TreeNode parent = delNode;
        TreeNode success = delNode;
        TreeNode current = delNode.right;
        while (current != null) {
            // 后继节点父节点首先保存后继节点的状态
            parent = current;
            success = current;
            // 后继节点 不断的向左更新
            current = current.left;
        }
        // 假如我们找到的后继节点不直接是 要删除节点的右节点  而是在其右节点那条子树上面最小的一个节点
        if (success != delNode.right) {
            //后继节点的父节点断开其与后继节点左边的引用，重新连接上后继节点的右子节点（因为后继节点是没有左子节点的，锁以要保存之前树的状态，还要把后继节点的右子节点处理一下，不管 其存在不存在）
            parent.left= success.right;
            // 这时候后继节点的右边已经空了 上一条语句已经将其给了自己父节点的左子节点    然后让后继节点的右边 连接要删除节点的右子树
            success.right = delNode.right;
        }
        return success;
    }
}
