package test;

import java.util.Scanner;

public class _11หับü {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		float[] a = new float[n];
		for(int i=0;i<n;i++) {
			a[i] = in.nextFloat();
		}
        //a[n]=(float)360;
		long ans = 0;
		for(int i=0;i<n;i++) {
			
			int t;
            if((a[i]+(float)180)>360) {
				float tmp = (a[i]-(float)180);
				System.out.println("---:"+lower_bound(a, tmp, 0, n-1));
				t = lower_bound(a, tmp, 0, n-1)+(n-i-1);
			}
			else {
				System.out.println("--+-:"+lower_bound(a, a[i]+(float)180, 0, n-1));
				t = lower_bound(a, (a[i]+(float)180), 0, n-1)-i-1;
			}
			System.out.println("++++++:"+t);
			if(t>1) {
				ans += (long)t*(t-1)/2;
			}
		}
		System.out.println(ans);
	}
	public static int lower_bound(float[] d,float x,int l,int r){
		int m;
		while(l<r){
			m = (l+r)>>1;
			if(d[m]>=x) r=m;
			else l=m+1;
		}
		return l;
	}
}
