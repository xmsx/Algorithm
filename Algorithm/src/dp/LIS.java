package dp;
/**
 * LIS �����������&&�����������
 * ˼�룺
 * �������������Ϊ����ά��һ����ǰ����Ǳ����dp���顣��dp�������ҵ���һ������a[i]�������滻����
 * 						��Ϊa[i]�ȱ��滻������С������Ǳ������pos+1��top�Աȣ��õ���󳤶ȡ�
 * �Ż�����������ǰԭʼ����ʱ�����a[i]>=dp[top]����,��dp[++top]=a[i],�������г������ӣ����ٶ��ִ���
 * ������dp�������ҵ���һ������a[i]�������滻������Ϊa[i]�ȱ��滻������С������Ǳ����Ѱ�ҵĹ����ö��֣����Ӷ�logn��
 * 
 * ʱ�临�Ӷȣ�nlogn
 */
import java.util.Scanner;

public class LIS {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[100];
		for(int i=0;i<n;i++){
			a[i] = in.nextInt();
		}
		System.out.println(lis(a));
	}
	/**
	 * ���ֲ��� d[] �е�һ��  >x ��ֵ���������±ꡣ�൱��c++��upper_bound
	 * @param d 
	 * 			��Ѱ������
	 * @param x	
	 * 			Ŀ������
	 * @param l
	 * 			Ѱ����ʼ
	 * @param r
	 * 			Ѱ����ֹ�±�
	 * @return	d[] �е��±�
	 */
	public static int upper_bound(int[] d,int x,int l,int r){
		int m;
		while(l<r){
			m = (l+r)>>1;
			if(d[m]>x) r=m;
			else l=m+1;
		}
		return l;
	}
	/**
	 * ���ֲ��� d[] �е�һ��  >=x ��ֵ���������±ꡣ�൱��c++��lower_bound
	 * @param d 
	 * 			��Ѱ������
	 * @param x	
	 * 			Ŀ������
	 * @param l
	 * 			Ѱ����ʼ
	 * @param r
	 * 			Ѱ����ֹ�±�
	 * @return	d[] �е��±�
	 */
	public static int lower_bound(int[] d,int x,int l,int r){
		int m;
		while(l<r){
			m = (l+r)>>1;
			if(d[m]>=x) r=m;
			else l=m+1;
		}
		return l;
	}
	/**
	 * �����������
	 * @param a 
	 * 			ԭʼ����
	 * @return	�������г���
	 */
	public static int lis(int[] a){
		int top = 0;
		int[] dp = new int[110];
		dp[0]=a[0];
		for(int i=1;i<a.length;i++){
			//�������������upper_bound
			//�������������lower_bound
			int pos = upper_bound(dp,a[i],0,top);
	        dp[pos] = a[i];
	        top = Math.max(top, pos + 1);
	        //�Ż�
	        //��һ���жϣ�ֱ�Ӻ�dp[]ͷԪ�ضԱȣ������ֱ���滻��top++�����ٶ��ִ�����
		}
		return top;
	}
}
