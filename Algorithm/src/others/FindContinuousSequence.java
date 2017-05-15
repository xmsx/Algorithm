package others;

import java.util.ArrayList;

/**
 * 和为S的连续正数序列
 * @author MFS
 * 题意：
 * 	给一个数，看有多少连续正数序列的和为此数
 * 题解：
 * 	根据数学公式计算:(a1+an)*n/2=s , n=an-a1+1、
 * (an+a1)*(an-a1+1)=2*s
 * 	令 2*s = k*i (k>l)
 * 	则有 (an+a1)=k , (an-a1+1)=i
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
				//若能分成连续序列，则k，i 必须一奇一偶
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
