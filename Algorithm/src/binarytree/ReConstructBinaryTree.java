package binarytree;

import java.util.HashMap;

public class ReConstructBinaryTree {
	/**
	 * 由先序，中序，重建二叉树
	 * @param pre 先序
	 * @param in 中序
	 * @return 二叉树头节点
	 */
	public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		// TODO Auto-generated constructor stub
		if(pre==null||in==null){
			return null;
		}
		//用来获取二叉树头节点在中序中的下标
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<in.length;i++){
			map.put(in[i], i);
		}
		return preIn(pre,0,pre.length-1,in,0,in.length-1,map);
		
	}
	/**
	 * 递归
	 * @param p 先序数组
	 * @param pi 先序中左/右子树区间
	 * @param pj 
	 * @param n 中序数组
	 * @param ni 中序中左/右子树区间
	 * @param nj
	 * @param map 中序头节点下标查询
	 * @return 二叉树头节点
	 */
	TreeNode preIn(int[] p ,int pi,int pj, int[] n,int ni,int nj,HashMap<Integer,Integer> map){
		if(pi>pj){
			return null;
		}
		TreeNode head = new TreeNode(p[pi]);
		int index = map.get(p[pi]);
		head.left = preIn(p,pi+1,pi+index-ni,n,ni,index-1,map);
		head.right = preIn(p,pi+index-ni+1,pj,n,index+1,nj,map);
		return head;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] pre = {1,2,4,7,3,5,6,8};
		int[] in = {4,7,2,1,5,3,8,6};
		ReConstructBinaryTree solve = new ReConstructBinaryTree();
		System.out.println(solve.reConstructBinaryTree(pre, in).right.right.left.val);
		
	}

}
