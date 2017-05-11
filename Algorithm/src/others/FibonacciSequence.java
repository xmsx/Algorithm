package others;

public class FibonacciSequence {
	/**
	 * 쳲���������
	 * @param n ��n��
	 * @return ��n����ֵ
	 */
	int Fibonacci(int n){
		if(n==0) return 0;
		if(n==1||n==2)return 1;
		int i = 1,j = 1;
		n -= 2;
		while(n-- > 0){
			int t = j;
			j = i + j;
			i = t;
		}
		return j;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new FibonacciSequence().Fibonacci(6));
	}

}