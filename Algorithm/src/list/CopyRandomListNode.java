package list;
/**
 * ��������ĸ���
 * @author MFS
 * ��Ŀ��
 * ����һ����������ÿ���ڵ����нڵ�ֵ���Լ�����ָ�룬һ��ָ����һ���ڵ㣬
 * ��һ������ָ��ָ������һ���ڵ㣩�����ؽ��Ϊ���ƺ��������head��
 * ��ע�⣬���������벻Ҫ���ز����еĽڵ����ã�������������ֱ�ӷ��ؿգ�
 * ��⣺
 * 
 */
public class CopyRandomListNode {
	public RandomListNode clone(RandomListNode list){
		RandomListNode ans = new RandomListNode(list.label);
		if(list == null) return null;
		ans.random = list.random;
		ans.next = list.next;
		ans.random = clone(list.random);
		ans.next = clone(list.next);
		return ans;
	}

}
