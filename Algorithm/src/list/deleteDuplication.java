package list;
/**
 * ɾ�������������ظ���Ԫ��
 * @author MFS
 * ˼·��
 * �ݹ�
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
            //�ҵ���һ����ͬ�Ľ��
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
