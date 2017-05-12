package list;

public class ReverseList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = null;
		reverseList(head);
	}

	private static ListNode reverseList(ListNode head) {
		// TODO Auto-generated method stub
		if(head == null) return null;
		ListNode pre = null;
		ListNode next = null;
		while(head != null){
			next = head.next;
			head.next = pre;
			pre = head;
			head = next;
		}
		return pre;
	}

}
