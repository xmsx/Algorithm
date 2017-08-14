package test;

import java.util.Scanner;
import java.util.Stack;

public class ¿®∫≈∆•≈‰ {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		System.out.println(matchInfo(s));
	}

	public static boolean matchInfo(String str) {
		int s1 = 0;
		int s2 = 0;
		int s3 = 0;
		
		char[] ca = str.toCharArray();
		for (int i = 0; i < ca.length; i++) {
			
			if(ca[i]=='{'&&s2==0&&s3==0){
				s1++;
			} else if(ca[i]=='['&&s2==0) {
				s2++;
			} else if(ca[i] == '(') s3++;
			
			else if(ca[i]==')'&& s3>0) {
				s3--;
			} else if(ca[i]==']'&&s3==0&&s2>0){
				s2--;
			} else if(ca[i]=='}'&&s2==0&&s3==0&&s1>0) {
				s1--;
			}
		}
		if(s1==0&&s2==0&&s3==0) return true;
		else return false;
	}

}