package kmp;
/**
 * Java ʵ��KMP�㷨
 * ˼�룺
 * �ҵ�ģʽ����next[]����ģʽ��ÿ��λ�����ǰ׺��׺��ͬ�ĳ��ȡ�
 * ƥ��ʱ������ƥ��ʱ��ֻ����ģʽ�����ɡ�
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
	 * 			����
	 * @param t
	 * 			ģʽ��
	 * @return ��ƥ��ɹ���������ƥ�俪ʼλ�õ��±꣬���򷵻� -1
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
	 * getnext �õ�next����
	 * @param t
	 * 			ģʽ��
	 * @param next
	 * 			next����
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
