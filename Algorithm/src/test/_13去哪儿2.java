package test;

import java.util.Scanner;

public class _13È¥ÄÄ¶ù2 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String str1 = in.nextLine();
		char[] s1 = str1.toCharArray();
		String[] sc = str1.split(" ");
		StringBuffer str2 = new StringBuffer();
		for(int i = sc.length-1;i>0;i--) {
			str2.append(sc[i]);
			str2.append(' ');
		}
		str2.append(sc[0]);
		System.out.println(str2.toString());
		char[] s2 = str2.toString().toCharArray();
		System.out.println(lcs(s1,s2));
 	}
	public static String reverse(String str){  
        return new StringBuilder(str).reverse().toString();  
    }
	public static int lcs(char[] s1,char[] s2){
		int[][] dp = new int[100][100];
		int[][] s = new int[100][100];
		int m = s1.length ,n = s2.length;
		for(int i=0;i<=n;i++)
			dp[0][i] = 0;
		for(int i=0;i<=m;i++)
			dp[i][0] = 0;
		for(int i=1;i<=m;i++){
			for(int j=1;j<=n;j++){
				if(s1[i-1]==s2[j-1]){
					dp[i][j]=dp[i-1][j-1]+1;
					s[i][j]=1;
				}else if(dp[i-1][j]<=dp[i][j-1]){
					dp[i][j]=dp[i][j-1];
					s[i][j]=2;
				}else{
					dp[i][j]=dp[i-1][j];
					s[i][j]=3;
				}
			}
		}
		int ans=dp[m][n],k=dp[m][n];
		char[] z = new char[100];
		while(m>0&&n>0){
			if(s[m][n]==1){
				z[k]=s1[m-1];
				k--;
				m--;
				n--;
			}else if(s[m][n]==2)n--;
			else m--;
		}
//		for(int i=1;i<=ans;i++){
//			System.out.print(z[i]);
//		}
//		System.out.println();
		return ans;
	}
}
