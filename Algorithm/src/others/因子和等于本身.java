package others;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class 因子和等于本身 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i=1;i<=n;i++){
			int ans = solve(i);
			System.out.println(i+":::"+ans);
		}
		
	}

	private static int solve(int n) {
		// TODO Auto-generated method stub
		int t = 0;
		for(int i=2;i<(int)Math.sqrt(n)+1;i++){
			if(n%i==0)t+=(i+n/i);
			if(t>n)break;
		}
		if(t+1==n)return 1;
		return 0;
	}

}
