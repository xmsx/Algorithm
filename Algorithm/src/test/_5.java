package test;

import java.util.Scanner;

public class _5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = in.nextInt();
		}
		int ans = solve(a);
		System.out.println(ans);
	}

	private static int solve(int[] a) {
		int st = 0,ans = 0;
		int tmp = 0;
		for(int i=0;i<a.length;i++) {
			for(int j = i;j<a.length;j++) {
				
			}
		}
		return ans;
	}

}
