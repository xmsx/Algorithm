package test;

import java.util.Arrays;
import java.util.Scanner;

public class ºÏ³ªÍÅ {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = "zxc123";
		char[] ss = s.toCharArray();
		reverse(ss);
		s = String.valueOf(ss);
		System.out.println(s);
	}

	private static void reverse(char[] ss) {
		// TODO Auto-generated method stub
		char t;
		for(int i=0,j=ss.length-1;i<j;i++,j--) {
			t = ss[i];
			ss[i] = ss[j];
			ss[j] = t;
		}
	}

}
