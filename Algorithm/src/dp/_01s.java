package dp;

import java.util.Scanner;

public class _01s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		int[] w = new int[n+1];
		int[] v = new int[n+1];
		for(int i=1;i<=n;i++){
			w[i] = in.nextInt();
			v[i] = in.nextInt();
		}
		int[] dp = new int[m+1];
		for(int i=1;i<=n;i++){
			for(int j=m;j>=w[i];j--){
				dp[j] = Math.max(dp[j],dp[j-w[i]]+v[i]); 
			}
		}
		System.out.println(dp[m]);
	}

}
