package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int ans = get(n);
		System.out.println(ans);
	}
	private static int get(int i) {
		int t2=0,t3=0,t5=0;
		List<Integer> ans = new ArrayList<Integer>();
		ans.add(1);
		while(ans.size()<i){
			ans.add(Math.min(ans.get(t2)*2, Math.min(ans.get(t3)*3,ans.get(t5)*5)));
			int tmp = ans.get(ans.size()-1);
			if(tmp == ans.get(t2)*2)t2++;
			if(tmp == ans.get(t3)*3)t3++;
			if(tmp == ans.get(t5)*5)t5++;
		}
		return ans.get(ans.size()-1);
	}

}
