package stack;

import java.util.Stack;

/**
 * ջ��ѹ�롢��������
 * @author MFS
 * ���⣺
 * 	���������������У���һ�����б�ʾջ��ѹ��˳�����жϵڶ��������Ƿ�Ϊ��ջ�ĵ���˳��
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
