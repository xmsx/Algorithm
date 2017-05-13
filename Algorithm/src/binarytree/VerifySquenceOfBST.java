package binarytree;
/**
 * �����������ĺ����������
 * @author MFS
 * ��Ŀ��
 * ����һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ����
 * ����������Yes,�������No���������������������������ֶ�������ͬ��
 * ��⣺
 * �ݹ��˼·����������������һ����Ϊ���ڵ㣬�Ӻ���ǰ�ң��ҵ���һ��С�ڸ������±꣬
 * ���λ����߶�С�ڸ��ڵ㣬�ұ߶����ڸ��ڵ㣬���������⣬Ȼ�����ݹ�������ɡ�
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
