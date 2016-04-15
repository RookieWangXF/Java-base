package cn.rookie.listnode;

public class RemoveDuplicatesfromSortedListII {
	public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
			return null;
		}
		
        ListNode p;
        ListNode q;
        p = head;
        
        while (p.next != null) {
			q = p.next;
			if (p.val == q.val) {
				if (q.next != null) {
					p.next = q.next;
				} else {
					p.next = null;
					return head;
				}
			} 
			p = p.next;
		}
		return head;
    }
	public static void main(String[] args) {

	}

}
