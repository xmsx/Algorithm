package others;

import java.util.*;

/**
 * ����
 * @author MFS
 * ��Ŀ��
 * ������ֻ����2��3��5��������������Ugly Number����
 */
public class GetUglyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans = getUglyNumberByIndex(1500);
	}
	/**
	 * ������������ɸ
	 * @param i
	 * @return ��i������
	 */
	private static int getUglyNumberByIndex(int i) {
		// TODO Auto-generated method stub
		int t2=0,t3=0,t5=0;
		List<Integer> ans = new ArrayList<Integer>();
		ans.add(1);
		while(ans.size()<i){
			ans.add(Math.min(ans.get(t2)*2, Math.min(ans.get(t3)*3,ans.get(t5)*5)));
			int tmp = ans.get(ans.size()-1);
			if(tmp == ans.get(t2)*2)t2++;
			if(tmp == ans.get(t3)*3)t3++;
			if(tmp == ans.get(t5)*5)t5++;
		}
		return ans.get(ans.size()-1);
	}

}
