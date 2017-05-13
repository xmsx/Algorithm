package binarytree;
/**
 * �ж�����
 * @author MFS
 * ���⣺�������ö�����A��B���ж�B�ǲ���A���ӽṹ��
 * 		��ps������Լ��������������һ�������ӽṹ��
 */
public class HasSubTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root1 = null;
		TreeNode root2 = null;
		boolean ans = hasSubTree(root1,root2);
	}
	/**
	 * �ݹ��󽲽�
	 * @param root1 ����
	 * @param root2 ģʽ��
	 * @return boolean
	 */
	public static boolean hasSubTree(TreeNode root1,TreeNode root2) {
		// TODO Auto-generated method stub
		if(root2==null) return false;
        if(root1==null && root2!=null) return false;
        boolean ans = false;
        if(root1.val==root2.val){
        	//�����ڴ˴�return�������޷������ݹ�Ѱ������������ƥ�����
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
