package list;
/**
 * ��������ĵ�һ���������
 * @author MFS
 * ��Ŀ��
 * �������������ҳ����ǵĵ�һ��������㡣
 * ��⣺
 * ������ͬ�й�����㣬��һ�ξͱ�������û�й�����㣬�ߵ�β��NULL����������NULL
 * ���Ȳ�ͬ�й�����㣬��һ���ֵ�ͳ����ˣ��ڶ���һ�𵽹�����㣻û�й�����һ�𵽽�βNULL��
 *
 */
public class FindFirstCommonNode {
	public ListNode findFirstCommonNode(ListNode l1,ListNode l2){
		ListNode t1 = l1;
		ListNode t2 = l2;
		while(l1 != l2){
			l1 = l1==null?t2:l1.next;
			l2 = l2==null?t1:l2.next;
		}
		return l1;
	}

}
