package test;

import java.util.Scanner;

public class _7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		solve(s);
	}

	private static void solve(String s) {
		char[] ss = new char[s.length()];
		ss = s.toCharArray();
		int ans = 0,tmp = 0;
		for(int i = 0;i<ss.length;i++) {
			if(ss[i] == '(') tmp ++;
			else tmp--;
			if(tmp>ans) ans = tmp;
		}
		System.out.println(ans);
		
	}

}
