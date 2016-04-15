package cn.rookie.listnode;

public class RemoveDuplicatesfromSortedList {
	public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
			return null;
		}
        if (head.next == null) {
			return head;
		}
        ListNode p = head;
        int temp;
        while (p.next != null) {
			temp = p.val;
			if (temp == p.next.val) {
				if (p.next.next != null) {
					p.next = p.next.next;
				} else {
					p.next = null;
				}
			}else {
				p = p.next;
			}
		}
		return head;
    }
	public static void main(String[] args) {

	}

}
