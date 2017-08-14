package binarytree;

/**
 * 判断二叉树是否为BST（二叉搜索树）
 * @author MFS
 * 二叉树所有节点都保证左子树所有几点都比本身小，右子树所有节点都比自己大。
 * 方法一：
 * 递归实现
 * 方法二：
 * 中序遍历，得到的序列为递增序列。
 *
 */
public class IsValidBST {
	
	public boolean isValidBST(TreeNode root) {
		return isValid(root,null,null);
	}

	private boolean isValid(TreeNode root, Integer min, Integer max) {
		if(root == null) return true;
		if(min != null && root.val > min ) return false;
		if(max != null && root.val < max ) return false;
		
		return isValid(root.left, root.val, max) && isValid(root.right, min, root.val);
	}

}
