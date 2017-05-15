package others;

import java.util.ArrayList;

/**
 * FindNumbersWithSum
 * @author MFS
 * 题目：
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，是的他们的和正好是S，
 * 如果有多对数字的和等于S，输出两个数的乘积最小的。 
 * 题解：
 * 设两个指针st，ed，分别从开头和末尾，向中间找，
 * 和如果大与 sum，ed--
 * 如果小于，st++ 
 * 否则存入st，ed；break
 * 因为是逐渐向中间靠拢，数列又是递增的，所以st*ed 是逐渐增大的，故可保证st*ed最小
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
