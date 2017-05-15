package others;

public class 技巧 {
	/**
	 * 无   + 的加法
	 * @param num1
	 * @param num2
	 * @return
	 */
    public int Add(int num1,int num2) {
        while (num2!=0) {
            int temp = num1^num2;
            num2 = (num1&num2)<<1;
            num1 = temp;
        }
        return num1;
    }
    /**
     * 特殊等差求和
     * @param n
     * @return
     */
    public int Sum_Solution(int n) {
    	//短路结束递归
        boolean ans = (n>0)&&((n += Sum_Solution(n-1))>0);
    	return n;
    }
    /**
     * 	       给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
     * 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。
     * 不能使用除法。
     */
    public int[] multiply(int[] a) {
    	int l = a.length;
    	int[] b = new int[l];
    	b[0] = 1;
    	for(int i=1;i<l;i++){
    		b[i] = b[i-1]*a[i-1];
    	}
    	int tmp = 1;
    	for(int i=l-1;i>0;i--){
    		b[i] *= tmp;
    		tmp *= a[i];
    	}
    	b[0] *=tmp;
		return b;
    }
}
