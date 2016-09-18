package cn.rookie.listnode;
public class MergeTwoSortedLists {
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		if(l1==null)
			return l2;
		if (l2==null) {
			return l1;
		}
		ListNode p1 = l1;
		ListNode p2 = l2;
		ListNode head = new ListNode(0);
		ListNode p = head;
		
		while (p1 != null && p2 != null) {
			if(p1.val <= p2.val){
				p.next = p1;
				p1 = p1.next;
			}else {
				p.next = p2;
				p2=p2.next;
			}
			p=p.next;
		}
		
		if(p1!=null)
			p.next = p1;
		if (p2!=null) {
			p.next = p2;
		}
		return head.next;  
    }

	public ListNode merge(ListNode pHead1, ListNode pHead2) {
		if (pHead1 == null)
			return pHead2;
		if (pHead2 == null)
			return pHead1;
		ListNode pHead = null;

		if (pHead1.val < pHead2.val) {
			pHead = pHead1;
			pHead.next = merge(pHead1.next, pHead2);
		} else {
			pHead = pHead2;
			pHead.next = merge(pHead1, pHead2.next);
		}
		return pHead;
	}
}
