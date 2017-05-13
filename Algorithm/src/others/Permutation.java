package others;

import java.util.ArrayList;
import java.util.Collections;
/**
 * �ַ���������
 * @author MFS
 * ��Ŀ��
 * ����һ���ַ���,���ֵ����ӡ�����ַ������ַ����������С�
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
		if (pos == cs.length - 1) { // ��ռ��һ��Ҷ�ڵ�
			list.add(String.valueOf(cs)); // �ҵ�һ����
		} else {
			for (int i = pos; i < cs.length; i++) {
				// pos == i ��Ϊ�˱��������ַ�����ͬ��������ݹ�����
				if (pos == i || cs[pos] != cs[i]) {
					swap(cs, i, pos);
					PermutationHelper(cs, i + 1, list);
					swap(cs, i, pos); // ��λ
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
