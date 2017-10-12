package test;

import java.util.Scanner;

public class _6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x1,k1,x2,k2;
		x1 = in.nextInt();
		k1 = in.nextInt();
		x2 = in.nextInt();
		k2 = in.nextInt();
		solve(x1,k1,x2,k2);
	}

	private static void solve(int x1, int k1, int x2, int k2) {
		String s1 = String.valueOf(x1);
		String s2 = String.valueOf(x2);
		if(s1.length()*k1>s2.length()*k2){
			System.out.println("Greater");
		} else if(s1.length()*k1<s2.length()*k2) {
			System.out.println("Less");
		} else {
			if(x1==x2){
				System.out.println("Equal");
			} else {
				StringBuilder ss1 = new StringBuilder();
				StringBuilder ss2 = new StringBuilder();
				while(k1!=0){
					ss1.append(s1);
					k1--;
				}
				while(k2!=0){
					ss2.append(s2);
					k2--;
				}
				s1 = ss1.toString();
				s2 = ss2.toString();
				if(s1.compareTo(s2)==0){
					System.out.println("Equal");
				} else if(s1.compareTo(s2)<0) {
					System.out.println("Less");
				} else System.out.println("Greater");
			}
		}
		
	}

}
