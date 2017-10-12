package test;

import java.util.Scanner;

public class _9ø∆¥Û—∂∑…1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		char[] ss = s.toCharArray();
		int ans = 0,cl = 0,cr = 0;
		int i,j;
		for(i = 0;i<ss.length;i++){
			if(ss[i]=='L')++cl;
			else break;
			//System.out.println("cl:"+cl);
		}
		for(j = i;j < ss.length;j++) {
			if(ss[j]=='R')++cr;
			else cr=1;
			//System.out.println("cr:"+cr);
		}
		System.out.println(cr+cl);
	}

}
