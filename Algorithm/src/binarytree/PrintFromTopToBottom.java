package binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 二叉树程序遍历
 * @author MFS
 * bfs基础
 */
public class PrintFromTopToBottom {

	public ArrayList<Integer> printFromTopToBottom(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<Integer>();
        if(root==null)return list;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		while(!q.isEmpty()){
            TreeNode t = q.poll();
			list.add(t.val);
			if(t.left!=null)q.add(t.left);
			if(t.right!=null)q.add(t.right);
		}
		return list;
	}

}
