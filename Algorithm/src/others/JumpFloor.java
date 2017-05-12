package others;
/**
 * 跳台阶
 * @author MFS
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * 思路：
 * 递归。
 */
public class JumpFloor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(jumpFloor(6));
	}

	private static int jumpFloor(int i) {
		// TODO Auto-generated method stub
		if(i==1||i==2)return i;
		return jumpFloor(i-1)+jumpFloor(i-2);
	}

}
