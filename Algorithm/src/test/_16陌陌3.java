package test;

public class _16İİ3 {
	public static void main(String[] args) {
		int[] a = {13,18,12,14,15,38};
		int ans = solve(a);
		System.out.println(ans);
	}

	private static int solve(int[] a) {
		int ans = 0;
		String s;
		for(int i=0;i<a.length;i++) {
			s = String.valueOf(a[i]);
			if(s.contains("3")||s.contains("8")) ans++;
		}
		return ans;
	}
}
