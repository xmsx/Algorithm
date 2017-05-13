package binarytree;
/**
 * ������������˫������
 * @author MFS
 * ����һ�ö��������������ö���������ת����һ�������˫������
 * Ҫ���ܴ����κ��µĽ�㣬ֻ�ܵ������н��ָ���ָ��
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
