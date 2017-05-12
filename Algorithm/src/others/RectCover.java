package others;
/**
 * 矩阵覆盖
 * @author MFS
 * 题目：
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 * 题解：
 *     逆向分析
 * 应为可以横着放或竖着放，多以  f(n) 可以是f(n-1)的矩形加    1 个竖着放的2*1的矩形
 * 或   f(n-2) 的矩形加 两个横着放的2*1的矩形      **（不能两个竖着放的，因为与上述情况重复）**
 * 即f(n)=f(n-1)+f(n-2)
 * 当到了最后，f(1)=1,f(2)=2
 */
public class RectCover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(rectCover(6));
	}

	private static int rectCover(int i) {
		// TODO Auto-generated method stub
		if(i==0||i==1||i==2)return i;
		return rectCover(i-1)+rectCover(i-2);
	}

}
