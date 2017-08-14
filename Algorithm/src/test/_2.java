package test;

import java.util.Scanner;

public class _2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n+2];
		for (int i = 1; i <= n; i++) {
			a[i] = in.nextInt();
			
		}
		System.out.println(judge(a));
	}

	private static boolean judge(int[] a) {
		// TODO Auto-generated method stub
		int st = 1;
		int ed = a.length-2;
		int sa = 0;
		int sb = 0;
		while (st<=ed) {
			if(a[st]>a[ed]){
				sa+=a[st];
				st++;
			}
			else {
				sa+=a[ed];
				ed--;
			}
			if(st>ed)break;
			if(a[st]>a[ed]){
				sb+=a[st];
				st++;
			}
			else {
				sb+=a[ed];
				ed--;
			}
			
		}
		if(sa>=sb)return true;
		return false;
	}
}
