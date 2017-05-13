package stack;

import java.util.Stack;

/**
 * 栈的压入、弹出序列
 * @author MFS
 * 题意：
 * 	输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。
 */
public class IsPopOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] push = {1,2,3,4,5};
		int[] pop = {4,3,5,1,2};
		boolean ans = isPopOrder(push,pop);
		System.out.println(ans);
	}

	public static boolean isPopOrder(int[] pushA, int[] popA) {
		// TODO Auto-generated method stub
		if (pushA.length == 0 || popA.length == 0) {
            return false;
        }
        Stack<Integer> stack = new Stack<Integer>();
        int j = 0;
        for (int i = 0; i < popA.length; i++) {
            stack.push(pushA[i]);
            while (j < popA.length && stack.peek() == popA[j]) {
                stack.pop();
                j++;
            }
 
        }
        return stack.empty() ? true : false;
	}

}
