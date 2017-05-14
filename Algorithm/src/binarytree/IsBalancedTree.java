package binarytree;
/**
 * �ж�ƽ�������
 * ���������������ĸ߶Ȳ�ľ���ֵ������1����������������������һ��ƽ���������
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
