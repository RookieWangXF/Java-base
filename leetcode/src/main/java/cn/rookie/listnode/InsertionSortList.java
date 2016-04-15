package cn.rookie.listnode;

public class InsertionSortList {
	public static ListNode insertionSortList(ListNode head) {
		if (head == null) {
			return null;
		}
        ListNode p = new ListNode(0);
        p.next = null;
        ListNode r;
		
        while (head != null) {
        	ListNode q = new ListNode(head.val);
			head = head.next;
			/*
			 * ��q���뵽�µ�������
			 */
			r = p;
			while (r.next != null) {
				/*
				 * ����ҵ�λ�ã���ô���벢����ѭ�������ڵĻ��ͽ�����
				 */
				if (r.next.val >= q.val) {
					q.next = r.next;
					r.next = q;
					break;
				} else {
					r = r.next;
				}
			}
			if (r.next == null) {
				r.next = q;
			}
		}
		return p.next;
    }
	public static void main(String[] args) {
		ListNode n1 = new ListNode(11);
		ListNode n2 = new ListNode(22);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(14);
		ListNode n5 = new ListNode(5);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = null;
		ListNode node = insertionSortList(n3);
		while (node != null) {
			System.out.println(node.val);
			node =  node.next;
		}
	}

}
