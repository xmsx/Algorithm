package binarytree;
/**
 * 判断子树
 * @author MFS
 * 题意：输入两棵二叉树A，B，判断B是不是A的子结构。
 * 		（ps：我们约定空树不是任意一个树的子结构）
 */
public class HasSubTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root1 = null;
		TreeNode root2 = null;
		boolean ans = hasSubTree(root1,root2);
	}
	/**
	 * 递归求讲解
	 * @param root1 主树
	 * @param root2 模式树
	 * @return boolean
	 */
	public static boolean hasSubTree(TreeNode root1,TreeNode root2) {
		// TODO Auto-generated method stub
		if(root2==null) return false;
        if(root1==null && root2!=null) return false;
        boolean ans = false;
        if(root1.val==root2.val){
        	//不能在此处return，否则无法继续递归寻找左右子树的匹配情况
            ans =  isSubTree(root1,root2);
        }
        return ans||hasSubTree(root1.left, root2)||hasSubTree(root1.right, root2);
	}

	private static boolean isSubTree(TreeNode root1, TreeNode root2) {
		// TODO Auto-generated method stub
		if(root2==null) return true;
        if(root1==null && root2!=null) return false;       
        if(root1.val==root2.val){
            return isSubTree(root1.left, root2.left) && isSubTree(root1.right, root2.right);
        }
        return false;
	}

}
