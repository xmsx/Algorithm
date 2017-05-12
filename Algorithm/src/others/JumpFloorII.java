package others;
/**
 * 跳台阶
 * @author MFS
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * 题解：
 * 每个台阶都有跳与不跳两种情况（除了最后一个台阶），最后一个台阶必须跳。所以共用2^(n-1)中情况
 */
public class JumpFloorII {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(jumpFloorII(6));
	}
	public static int jumpFloorII(int n){
		return 1<<(--n);
	}

}
