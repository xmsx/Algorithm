package binarytree;
/**
 * 对称二叉树
 * @author MFS
 * 题目：
 * 请实现一个函数，用来判断一颗二叉树是不是对称的。
 * 注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
 */
public class IsSymmetrical {
	boolean isSymmetrical(TreeNode root)
	{	
        if(root == null )return true;
        return comTreeNode(root.left,root.right);
    }

	private boolean comTreeNode(TreeNode left, TreeNode right) {
		// TODO Auto-generated method stub
		if(left == null) return right == null;
		if(right == null) return false;
		if(left.val != right.val) return false;
		return comTreeNode(left.right, right.left) && comTreeNode(left.left, right.right);
	}
}
