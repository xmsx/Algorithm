package binarytree;
/**
 * �Գƶ�����
 * @author MFS
 * ��Ŀ��
 * ��ʵ��һ�������������ж�һ�Ŷ������ǲ��ǶԳƵġ�
 * ע�⣬���һ��������ͬ�˶������ľ�����ͬ���ģ�������Ϊ�ԳƵġ�
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
