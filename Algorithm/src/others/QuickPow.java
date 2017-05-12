package others;

public class QuickPow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(quickPow(2.5,2));
	}
	/**
	 * 快速幂
	 * @param d
	 * @param i 大于等于0
	 * @return double型
	 */
	private static double quickPow(double d, int i) {
		// TODO Auto-generated method stub
		double ans = 1;
		while(i>0){
			if(i%2==1){
				ans *= d;
			}
			d *= d;
			i /= 2;
		}
		return ans;
	}
	
}
