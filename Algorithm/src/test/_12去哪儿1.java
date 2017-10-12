package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _12È¥ÄÄ¶ù1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int f = 0;
		int n = in.nextInt();
		int m = in.nextInt();
		String sp = in.next();
		String ep = in.next();
		Map<String, Integer> x = new HashMap<String, Integer>();
		x.put(sp, f++);
		x.put(ep, f++);
		int[][] dis = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				dis[i][j] = 99999999;
			}
		}
		int U,V;
		while(m-->0) {
			String u = in.next();
			if(x.get(u)==null){
				U = f;
				x.put(u, f++);
			} else {
				U = x.get(u); 
			}
			String v = in.next();
			if(x.get(v)==null){
				V = f;
				x.put(v, f++);
			} else {
				V = x.get(v); 
			}
			dis[U][V] = 1;
			dis[V][U] = 1;
		}
		for(int k=0;k<n;k++){
			for(int i=0;i<n;i++){
				if(dis[i][k]==99999999)continue;
				for(int j=0; j<n; j++)
					if(dis[i][j]>dis[i][k]+dis[k][j])
						dis[i][j]=dis[i][k]+dis[k][j];
			}
		}
		if(dis[1][0]<99999999) System.out.println(dis[1][0]);
		else System.out.println("DISCONNECTED");
	}

}
