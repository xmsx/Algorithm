package list;
/**
 * 删除排序链表中重复的元素
 * @author MFS
 * 思路：
 * 递归
 */
public class deleteDuplication {
	public ListNode deleteDuplication(ListNode pHead)
    {
		if (pHead==null)
            return null;
        if (pHead!=null && pHead.next==null)
            return pHead;
                 
        ListNode current;
         
        if ( pHead.next.val==pHead.val){
            current=pHead.next.next;
            //找到下一个不同的结点
            while (current != null && current.val==pHead.val)
                current=current.next;
            return deleteDuplication(current);                     
        }
         
        else {
            current=pHead.next;
            pHead.next=deleteDuplication(current);
            return pHead;
        }    
    }
}
