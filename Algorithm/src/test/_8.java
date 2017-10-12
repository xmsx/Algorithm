package test;

import java.util.Scanner;

public class _8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n,m;
		n = in.nextInt();
		m = in.nextInt();
		
		int ans = solve(n,m);
		System.out.println(ans);
	}

	private static int solve(int n, int m) {
		int ans = 0;
		int cm = (int) Math.sqrt(m);
		for(int i=1;i<=n;i++) {
			
			double tmp = Math.sqrt(i);
			if(tmp == (int )tmp) {
				ans += cm;
			} else {
				int t = i;
				double bi = Math.sqrt(i);
				int bn = (int)bi;
				for(int j=2;j<=bn;j++) {
					while(t%(j*j)==0) i /= (j*j);
				}
				double b = Math.sqrt(m)/Math.sqrt(i);
				int bb = (int) b;
				if(bb>=1)ans+=bb;
			}	
		}
		return ans;
	}

}
