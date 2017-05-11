package others;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 104;
		int b = 108;
		System.out.println(gcd(a,b));
	}

	private static int gcd(int a, int b) {
		// TODO Auto-generated method stub
		return a==0?b:gcd(b%a,a);
	}

}
