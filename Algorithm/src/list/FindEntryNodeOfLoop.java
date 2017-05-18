package list;
/**
 * 寻找还链表的入口节点
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
        	 * p1每次走一步，p2每次走二步
        	 */
            p1 = p1.next;
            p2 = p2.next.next;
            /*
             * 直到且肯定p1==p2找到在环中的相汇点。
             */
            if(p1 == p2){
            	/*
            	 * 此时p2比p1多走一个环的距离
            	 * 如果环链表本来是完整的环（没有尾巴），此时p1，p2 在环入口相会
            	 * 有尾巴的话，他们应该距离环链表入口一个尾巴的长度，
            	 * 让p2 会链表起点，p1，p2同时走，再次相会处为环链表的入口
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
