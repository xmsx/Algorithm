package binarytree;
/**
 * ¾µÏñ¶þ²æÊ÷
 * @author MFS
 *
 */
public class MirrorTree {
	public void Mirror(TreeNode root){
        if(root == null) return;
        TreeNode tmp = null;
        tmp = root.right;
        root.right = root.left;
        root.left = tmp;
        Mirror(root.left);
        Mirror(root.right);
	}

}
