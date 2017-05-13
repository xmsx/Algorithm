package binarytree;
/**
 * 二叉搜索树与双向链表
 * @author MFS
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
 * 要求不能创建任何新的结点，只能调整树中结点指针的指向。
 */
public class ConvertTree {
	TreeNode head = null;
    TreeNode realHead = null;
    public TreeNode Convert(TreeNode root) {
        ConvertSub(root);
        return realHead;
    }
     
    private void ConvertSub(TreeNode root) {
        if(root==null) return;
        ConvertSub(root.left);
        if (head == null) {
            head = root;
            realHead = root;
        } else {
            head.right = root;
            root.left = head;
            head = root;
        }
        ConvertSub(root.right);
    }
}
