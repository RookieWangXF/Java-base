package cn.rookie.listnode;

public class RemoveLinkedListElements {

	public static ListNode removeElements(ListNode head, int val) {
        if (head == null) {
			return null;
		}
        while (head.val == val) {
        	if (head.next == null) {
        		System.out.println("aa");
				return null;
			}else {
				head = head.next;
			}
		}
        if (head.next == null) {
			return head;
		}
        ListNode node = head.next;
        ListNode temp = head;
		while (node != null) {
			if (node.val == val) {
				temp.next = node.next;
				node = temp.next;
			}else {
				node = node.next;
				temp = temp.next;
			}
			
		}
		return head;
    }
	public static void main(String[] args) {
		ListNode node = new ListNode(5);
		System.out.println(removeElements(node, 5));
	}

}
