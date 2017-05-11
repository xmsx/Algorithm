package kmp;
/**
 * Java 实现KMP算法
 * 思想：
 * 找到模式串的next[]，即模式串每个位置最大前缀后缀相同的长度。
 * 匹配时，当不匹配时，只回溯模式串即可。
 */

import java.util.Scanner;

public class kmp_index {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String s,t;
		s = in.next();
		t = in.next();
		char[] ss,tt;
		ss = s.toCharArray();
		tt = t.toCharArray();
		System.out.println(kmp(ss,tt));
	}
	/**
	 * KMP
	 * @param s
	 * 			主串
	 * @param t
	 * 			模式串
	 * @return 若匹配成功返回主串匹配开始位置的下标，否则返回 -1
	 */
	public static int kmp(char[] s,char[] t){
		int[] next = new int[t.length+1];
		getnext(t,next);
		int i=0,j=0;
		while(i<s.length&&j<t.length){
			if( j == -1||s[i] == t[j]){
				i++;
				j++;
			}
			else {
				j = next[j];
			}
		}
		if(j == t.length)return i-t.length+1;
		else return -1;
	}
	/**
	 * getnext 得到next数组
	 * @param t
	 * 			模式串
	 * @param next
	 * 			next数组
	 */
	public static void getnext(char[] t,int[] next){
		next[0]=-1;
		int j = 0, k = -1;
		while(j<t.length){
			if(k == -1){
				k++;
				j++;
				next[j]=k;
			}else if(t[k] == t[j]){
				k++;
				j++;
				next[j] = k;
			}else {
				k = next[k];
			}
		}
	}
}
