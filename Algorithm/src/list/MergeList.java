package list;

public class MergeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = null;
		ListNode l2 = null;
		ListNode l = merge(l1,l2);
	}

	public static ListNode merge(ListNode l1, ListNode l2) {
		// TODO Auto-generated method stub
		if(l1==null&&l2==null) return null;
		if(l1==null)return l2;
		if(l2==null)return l2;
		ListNode l = null;
		if (l1.val < l2.val) {
			l = l2;
			l.next = merge(l1, l2.next);
		} else {
			l = l1;
			l.next = merge(l1.next, l2);
		}
		return l;
	}

}
