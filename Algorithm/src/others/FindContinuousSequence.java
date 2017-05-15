package others;

import java.util.ArrayList;

/**
 * ��ΪS��������������
 * @author MFS
 * ���⣺
 * 	��һ���������ж��������������еĺ�Ϊ����
 * ��⣺
 * 	������ѧ��ʽ����:(a1+an)*n/2=s , n=an-a1+1��
 * (an+a1)*(an-a1+1)=2*s
 * 	�� 2*s = k*i (k>l)
 * 	���� (an+a1)=k , (an-a1+1)=i
 * 	an=(k+i-1)/2 , a1=(k-i+1)/2
 *
 */
public class FindContinuousSequence {
	public ArrayList<ArrayList<Integer>> findContinuousSequence(int sum){
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
		if(sum<3)return ans;
		int s = sum*2;
		int ed = (int)Math.sqrt(s);
		for(int i=ed;i>=2;i--){
			if(s%i==0){
				int k = s/i;
				//���ֳܷ��������У���k��i ����һ��һż
				if((k%2==0&&i%2!=0)||(k%2!=0&&i%2==0)){
					int an=(k+i-1)/2;
					int a1=(k-i+1)/2 ;
					ArrayList<Integer> temp = new ArrayList<Integer>();
					for(int j=a1;j<=an;j++){
						temp.add(j);
					}
					ans.add(temp);
				}
			}
		}
		return ans;
	}

}
