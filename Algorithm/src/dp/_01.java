package dp;

import java.util.Scanner;

public class _01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		int[] w = new int[n+1];
		int[] v = new int[n+1];
		for(int i=1;i<=n;i++){
			w[i] = in.nextInt();
			v[i] = in.nextInt();
		}
		int[][] dp = new int[n+1][m+1];
		for(int i = 1;i <= n; i++){
			for(int j = 0;j <= m; j++){
				if(w[i]>j)dp[i][j]=dp[i-1][j];
				else dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-w[i]]+v[i]);
			}
		}
		System.out.println(dp[n][m]);
	}

}
