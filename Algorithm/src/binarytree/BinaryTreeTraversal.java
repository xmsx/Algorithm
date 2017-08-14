package binarytree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

/**
 * 
 * @author MFS
 * JAVAʵ�ֶ��������������򡢺��򡢲������
 * �ݹ�ͷǵݹ�汾
 *
 */
 
class BinaryTreeTraversal {
	/**
	 * @param root �����ڵ�
	 * �ݹ��������
	 */
	public static void preOrderRec(TreeNode root){
		if(root!=null){
			System.out.println(root.val);
			preOrderRec(root.left);
			preOrderRec(root.right);
		}
	}
	/**
	 * @param root �����ڵ�
	 * �ݹ��������
	 */
	public static void inOrderRec(TreeNode root){
		if(root!=null){
			preOrderRec(root.left);
			System.out.println(root.val);
			preOrderRec(root.right);
		}
	}
	/**
	 * @param root �����ڵ�
	 * �ݹ�������
	 */
	public static void postOrderRec(TreeNode root){
		if(root!=null){
			preOrderRec(root.left);
			preOrderRec(root.right);
			System.out.println(root.val);
		}
	}
	/**
	 * 
	 * @param root �����ڵ�
	 * ����ջʵ��ѭ���������������
	 * ����ʵ��������ͼ��������ȱ�����DFS��
	 * ά��һ��ջ�������ڵ���ջ��Ȼ��ֻҪջ��Ϊ�գ���ջ�����ʣ��������ν����ʽڵ���ҽڵ㡢��ڵ���ջ��
	 * ���ַ�ʽӦ���Ƕ����������һ������ʵ�֣�����ȥ�����ˣ������ǲ��߱��ܺõ���չ�ԣ�������ͺ���ʽ�в�����
	 */
	public static void preOrderStack_1(TreeNode root){
		if(root==null)return;
		Stack<TreeNode> s=new Stack<TreeNode>();
		s.push(root);
		while(!s.isEmpty()){
			TreeNode temp=s.pop();
			System.out.println(temp.val);
			if(temp.right!=null) s.push(temp.right);
			if(temp.left!=null) s.push(temp.left);
		}
	}
	/**
	 * 
	 * @param root ���ĸ��ڵ�
	 * ����ջģ��ݹ����ʵ��ѭ���������������
	 * ���ַ�ʽ�߱���չ�ԣ���ģ��ݹ�Ĺ��̣����������㲻�ϵ�ѹ��ջ��ֱ��null��Ȼ����ջ���ڵ��������
	 */
	public static void preOrderStack_2(TreeNode root){
		if(root==null)return;
		Stack<TreeNode> s=new Stack<TreeNode>();
		while(root!=null||!s.isEmpty()){
			while(root!=null){
				System.out.println(root.val);
				s.push(root);//�ȷ�������ջ
				root=root.left;
			}
			root=s.pop();
			root=root.right;//�����null����ջ������������
		}
	}
	/**
	 * 
	 * @param root �����ڵ�
	 * ����ջģ��ݹ����ʵ��ѭ���������������
	 * ˼��������preOrderStack_2��ͬ��ֻ�Ƿ��ʵ�ʱ��������������������ֱ��null��ʱ���ջ�����ʡ�
	 */
	public static void inOrderStack(TreeNode root){
		if(root==null)return;
		Stack<TreeNode> s=new Stack<TreeNode>();
		while(root!=null||!s.isEmpty()){
			while(root!=null){
				s.push(root);//�ȷ�������ջ
				root=root.left;
			}
			root=s.pop();
			System.out.println(root.val);
			root=root.right;//�����null����ջ������������
		}
	}
	/**
	 * 
	 * @param root �����ڵ�
	 * ���������ͬ���������������Ҫ�ȴ���������������Ȼ���ٴ����(����)��������Ҫһ����¼��Щ�ڵ��Ѿ������ʵĽṹ(���������ṹ�����һ�����)�����������mapʵ��
	 */
	public static void postOrderStack(TreeNode root){
		if(root==null)return;
		Stack<TreeNode> s=new Stack<TreeNode>();
		Map<TreeNode,Boolean> map=new HashMap<TreeNode,Boolean>(); 
		s.push(root);
		while(!s.isEmpty()){
			TreeNode temp=s.peek();
			if(temp.left!=null&&!map.containsKey(temp.left)){
				temp=temp.left;
				while(temp!=null){
                    if(map.containsKey(temp))break;
                    else s.push(temp);
                    temp=temp.left;
                }
				continue;
			}
			if(temp.right!=null&&!map.containsKey(temp.right)){
                s.push(temp.right);
                continue;
            }
			TreeNode t=s.pop();
			map.put(t,true);
			System.out.println(t.val);
		}
	}
	
	/**
	 * һ��"qiao"�ķ���
	 * �Ȳ�����������������ȱ�����������Һ���������ӣ��������ȸ��������������Һ��ӣ������ѱ�����������ת���õ��˺������ 
	 * @param root
	 * @return
	 */
	public List<Integer> postorderTraversal(TreeNode root) {
	    Deque<TreeNode> stack = new LinkedList<>();
	    stack.push(root);
	    List<Integer> ret = new ArrayList<>();
	    while (!stack.isEmpty()) {
	        TreeNode node = stack.pop();
	        if (node != null) {
	            ret.add(node.val);
	            stack.push(node.left);
	            stack.push(node.right);
	        }
	    }
	    Collections.reverse(ret);
	    return ret;
	} 
	/**
	 * 
	 * @param root �����ڵ�
	 * ����������������ö���ʵ�֣��Ƚ����ڵ�����У�ֻҪ���в�Ϊ�գ�Ȼ������У������ʣ����Ž����ʽڵ�������������������
	 */
	public static void levelTravel(TreeNode root){
		if(root==null)return;
		Queue<TreeNode> q=new LinkedList<TreeNode>();
		q.add(root);
		while(!q.isEmpty()){
			TreeNode temp =  q.poll();
			System.out.println(temp.val);
			if(temp.left!=null)q.add(temp.left);
			if(temp.right!=null)q.add(temp.right);
		}
	}
}
