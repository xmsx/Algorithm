package dp;
/**
 * LIS 最长不降子序列&&最长递增子序列
 * 思想：
 * 以最长不降子序列为例：维护一个当前最有潜力的dp数组。在dp数组中找到第一个大于a[i]的数，替换掉，
 * 						因为a[i]比被替换掉的数小，更有潜力。用pos+1和top对比，得到最大长度。
 * 优化：遍历到当前原始数组时，如果a[i]>=dp[top]数组,则dp[++top]=a[i],不降序列长度增加；减少二分次数
 * 否则在dp数组中找到第一个大于a[i]的数，替换掉，因为a[i]比被替换掉的数小，更有潜力。寻找的过程用二分，复杂度logn。
 * 
 * 时间复杂度：nlogn
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
	 * 二分查找 d[] 中第一个  >x 的值，返回其下标。相当于c++中upper_bound
	 * @param d 
	 * 			被寻找数组
	 * @param x	
	 * 			目标数字
	 * @param l
	 * 			寻找起始
	 * @param r
	 * 			寻找终止下标
	 * @return	d[] 中的下标
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
	 * 二分查找 d[] 中第一个  >=x 的值，返回其下标。相当于c++中lower_bound
	 * @param d 
	 * 			被寻找数组
	 * @param x	
	 * 			目标数字
	 * @param l
	 * 			寻找起始
	 * @param r
	 * 			寻找终止下标
	 * @return	d[] 中的下标
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
	 * 最长不降子序列
	 * @param a 
	 * 			原始数组
	 * @return	不降序列长度
	 */
	public static int lis(int[] a){
		int top = 0;
		int[] dp = new int[110];
		dp[0]=a[0];
		for(int i=1;i<a.length;i++){
			//最长不降子序列用upper_bound
			//最长递增子序列用lower_bound
			int pos = upper_bound(dp,a[i],0,top);
	        dp[pos] = a[i];
	        top = Math.max(top, pos + 1);
	        //优化
	        //加一个判断，直接和dp[]头元素对比，如果大，直接替换，top++；减少二分次数。
		}
		return top;
	}
}
