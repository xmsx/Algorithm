package binarytree;
/**
 * 判断平衡二叉树
 * （左右两个子树的高度差的绝对值不超过1，并且左右两个子树都是一棵平衡二叉树）
 * @author MFS
 */
public class IsBalancedTree {
	public boolean IsBalanced_Solution(TreeNode root) {
		if(root == null)return true;
		if(Math.abs(getHeight(root.left)-getHeight(root.right))>1)return false;
        return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
    }

	private int getHeight(TreeNode root) {
		if(root == null)return 0;
		return Math.max(getHeight(root.left), getHeight(root.right))+1;
	}

}
