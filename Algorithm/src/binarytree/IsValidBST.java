package binarytree;

/**
 * �ж϶������Ƿ�ΪBST��������������
 * @author MFS
 * ���������нڵ㶼��֤���������м��㶼�ȱ���С�����������нڵ㶼���Լ���
 * ����һ��
 * �ݹ�ʵ��
 * ��������
 * ����������õ�������Ϊ�������С�
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
