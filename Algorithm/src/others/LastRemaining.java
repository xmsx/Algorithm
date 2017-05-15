package others;
/**
 * 孩子们的游戏(圆圈中最后剩下的数)
 * @author MFS
 * 题目：
 * 循环跳出，数组模拟即可
 *
 */
public class LastRemaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = lastRemaining(5,6);
	}

	public static int lastRemaining(int n, int m) {
		// TODO Auto-generated method stub
		if(n==0||m==0) return -1;
		int[] a = new int[n];
		int step = 0,i = -1,count = n;
		m=m%(n+1);
		while(count > 0){
			i = ++i % n;
			if(a[i] == -1) continue;
			step++;
			if(step == m) {
				a[i] = -1;
				step = 0;
				count --;
			}
		}
		return i;
	}
}
