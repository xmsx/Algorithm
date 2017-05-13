package binarytree;
/**
 * 二叉搜索树的后序遍历序列
 * @author MFS
 * 题目：
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 * 题解：
 * 递归的思路，后序遍历，则最后一个数为根节点，从后往前找，找到第一个小于根结点的下标，
 * 这个位置左边都小于根节点，右边都大于根节点，则满足题意，然后做递归操作即可。
 */
public class VerifySquenceOfBST {
	public boolean verifyAquenceOfBST(int[] sequence){
		if(sequence.length==0) return false;
		return judge(sequence,0,sequence.length-1);
	}

	private boolean judge(int[] sequence, int l, int r) {
		// TODO Auto-generated method stub
		if(l>=r)return true;
		int t = r;
		while(t>l&&sequence[t-1]>sequence[r])t--;
		for(int i=l;i<t;i++){
			if(sequence[i]>sequence[r])return false;
		}
		return judge(sequence,l,t-1)&&judge(sequence, t, r-1);
	}

}
