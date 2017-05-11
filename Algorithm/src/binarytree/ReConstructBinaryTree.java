package binarytree;

import java.util.HashMap;

public class ReConstructBinaryTree {
	/**
	 * �����������ؽ�������
	 * @param pre ����
	 * @param in ����
	 * @return ������ͷ�ڵ�
	 */
	public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		// TODO Auto-generated constructor stub
		if(pre==null||in==null){
			return null;
		}
		//������ȡ������ͷ�ڵ��������е��±�
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<in.length;i++){
			map.put(in[i], i);
		}
		return preIn(pre,0,pre.length-1,in,0,in.length-1,map);
		
	}
	/**
	 * �ݹ�
	 * @param p ��������
	 * @param pi ��������/����������
	 * @param pj 
	 * @param n ��������
	 * @param ni ��������/����������
	 * @param nj
	 * @param map ����ͷ�ڵ��±��ѯ
	 * @return ������ͷ�ڵ�
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
