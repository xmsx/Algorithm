package list;
/**
 * 两个链表的第一个公共结点
 * @author MFS
 * 题目：
 * 输入两个链表，找出它们的第一个公共结点。
 * 题解：
 * 长度相同有公共结点，第一次就遍历到；没有公共结点，走到尾部NULL相遇，返回NULL
 * 长度不同有公共结点，第一遍差值就出来了，第二遍一起到公共结点；没有公共，一起到结尾NULL。
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
