package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 把数组排成最小的数
 * @author MFS
 * 题目：
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 */
public class PrintMinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3,32,321};
		System.out.println(printMinNumber(a));
	}

	private static String printMinNumber(int[] a) {
		// TODO Auto-generated method stub
		List<Integer> l = new ArrayList<Integer>();
		for(int i = 0;i<a.length;i++){
			l.add(a[i]);
		}
		Collections.sort(l, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				String str1=o1+""+o2;
                String str2=o2+""+o1;
                return str1.compareTo(str2);
			}
		});
		StringBuilder sb = new StringBuilder();
		for(Integer i : l){
			sb.append(i);
		}
		return sb.toString();
	}

}
