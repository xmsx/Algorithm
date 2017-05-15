package others;

import java.util.ArrayList;

/**
 * FindNumbersWithSum
 * @author MFS
 * ��Ŀ��
 * ����һ����������������һ������S���������в������������ǵ����ǵĺ�������S��
 * ����ж�����ֵĺ͵���S������������ĳ˻���С�ġ� 
 * ��⣺
 * ������ָ��st��ed���ֱ�ӿ�ͷ��ĩβ�����м��ң�
 * ��������� sum��ed--
 * ���С�ڣ�st++ 
 * �������st��ed��break
 * ��Ϊ�������м俿£���������ǵ����ģ�����st*ed ��������ģ��ʿɱ�֤st*ed��С
 */
public class FindNumbersWithSum {
	public ArrayList<Integer> findNumbersWithSum(int[] a,int sum){
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int st = 0;
		int ed = a.length-1;
		while(st<ed){
			if(a[st]+a[ed] < sum){
				st++;
			} else if(a[st]+a[ed] > sum){
				ed--;
			} else {
				ans.add(a[st]);
				ans.add(a[ed]);
				break;
			}
		}
		return ans; 
	}
}
