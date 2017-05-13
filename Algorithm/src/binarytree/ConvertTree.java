package binarytree;
/**
 * ������������˫������
 * @author MFS
 * ����һ�ö��������������ö���������ת����һ�������˫������
 * Ҫ���ܴ����κ��µĽ�㣬ֻ�ܵ������н��ָ���ָ��
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
