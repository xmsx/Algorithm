package binarytree;
/**
 * 二叉搜索树与双向链表
 * @author MFS
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
 * 要求不能创建任何新的结点，只能调整树中结点指针的指向。
 */
public class ConvertTree {
    protected TreeNode leftLast = null;
    public TreeNode Convert(TreeNode root) {
        if(root==null)
            return null;
        if(root.left==null&&root.right==null){
            leftLast = root;
            return root;
        }
        TreeNode left = Convert(root.left);
        if(left!=null){
            leftLast.right = root;
            root.left = leftLast;
        }
        leftLast = root;
        TreeNode right = Convert(root.right);
        if(right!=null){
            right.left = root;
            root.right = right;
        }
        return left!=null?left:root;       
    }
}
