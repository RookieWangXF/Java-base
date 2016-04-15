package cn.rookie.listnode;

public class LinkedListCycleII {

	public static ListNode detectCycle(ListNode head) {
        if (head == null) {
			return null;
		}
        
        ListNode p1;
        ListNode p2;
        p1 = head;
        p2 = head;
        
        while (p2.next != null && p2.next.next != null) {
			p1 = p1.next;
			p2 = p2.next.next;
			if (p1 == p2) {
				p2 = head;
				while (true) {
					if (p1 == p2) {
						return p1;
					}
					p1 = p1.next;
					p2 = p2.next;
				}
			}
		}
		return null;
    }
	public static void main(String[] args) {

	}

}
