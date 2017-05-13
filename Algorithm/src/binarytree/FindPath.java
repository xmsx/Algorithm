package binarytree;

import java.util.ArrayList;

/**
 * �������к�Ϊĳһֵ��·��
 * @author MFS
 * ��Ŀ��
 * ����һ�Ŷ�������һ����������ӡ���������н��ֵ�ĺ�Ϊ��������������·����
 * ·������Ϊ�����ĸ���㿪ʼ����һֱ��Ҷ����������Ľ���γ�һ��·����
 */
public class FindPath {
	private ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
	private ArrayList<Integer> list = new ArrayList<Integer>();
	public ArrayList<ArrayList<Integer>> findPath(TreeNode root,int target) {
		if(root==null || target<0) return ans;
		list.add(root.val);
		target -= root.val;
		if(target==0 && root.left==null && root.right==null){
			ans.add(new ArrayList<Integer>(list));
		}
		findPath(root.left,target);
		findPath(root.right,target);
		list.remove(list.size()-1);
		return ans; 
    }
}
