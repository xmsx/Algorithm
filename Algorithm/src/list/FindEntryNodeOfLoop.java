package list;
/**
 * Ѱ�һ��������ڽڵ�
 * @author MFS
 *
 */
public class FindEntryNodeOfLoop {
	ListNode EntryNodeOfLoop(ListNode pHead){
        if(pHead == null || pHead.next == null)
            return null;
        ListNode p1 = pHead;
        ListNode p2 = pHead;
        while(p2 != null && p2.next != null ){
        	/*
        	 * p1ÿ����һ����p2ÿ���߶���
        	 */
            p1 = p1.next;
            p2 = p2.next.next;
            /*
             * ֱ���ҿ϶�p1==p2�ҵ��ڻ��е����㡣
             */
            if(p1 == p2){
            	/*
            	 * ��ʱp2��p1����һ�����ľ���
            	 * ������������������Ļ���û��β�ͣ�����ʱp1��p2 �ڻ�������
            	 * ��β�͵Ļ�������Ӧ�þ��뻷�������һ��β�͵ĳ��ȣ�
            	 * ��p2 ��������㣬p1��p2ͬʱ�ߣ��ٴ���ᴦΪ����������
            	 */
                p2 = pHead;
                while(p1 != p2){
                    p1 = p1.next;
                    p2 = p2.next;
                }
                if(p1 == p2)
                    return p1;
            }
        }
        return null;
    }
}
