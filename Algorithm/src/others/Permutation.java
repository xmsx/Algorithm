package others;

import java.util.ArrayList;
import java.util.Collections;
/**
 * 字符串的排列
 * @author MFS
 * 题目：
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 *
 */
public class Permutation {
	public ArrayList<String> permutation(String str) {
		ArrayList<String> res = new ArrayList<>();
		PermutationHelper(str.toCharArray(), 0, res);
		Collections.sort(res);
		return res;
	}

	private static void PermutationHelper(char[] cs, int pos, ArrayList<String> list) {
		if (pos == cs.length - 1) { // 解空间的一个叶节点
			list.add(String.valueOf(cs)); // 找到一个解
		} else {
			for (int i = pos; i < cs.length; i++) {
				// pos == i 是为了避免所有字符都相同，不进入递归的情况
				if (pos == i || cs[pos] != cs[i]) {
					swap(cs, i, pos);
					PermutationHelper(cs, i + 1, list);
					swap(cs, i, pos); // 复位
				}
			}
		}
	}
	private static void swap(char[] cs, int i, int j) {
		// TODO Auto-generated method stub
		char t;
		t = cs[i];
		cs[i] = cs[j];
		cs[j] = t;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
