package cn.rookie.listnode;

import java.util.ArrayList;

public class PalindromeLinkedList {
	public static boolean isPalindrome(ListNode head) {
		if (head == null) {
			return false;
		}
        ListNode p1 = head;
        ListNode p2 = head;
        int length = 0;
        while (p2 != null) {
			length++;
			p2 = p2.next;
		}
        ArrayList<ListNode> arr = new ArrayList<ListNode>();
		System.out.println("����Ϊ"+length);
		for (int i = 0; i < length/2; i++) {
			arr.add(p1);
			p1 = p1.next;
		}
		if (length%2 == 1) {
			length = length - 1;
			p1 = p1.next;
		}
		for (int i = length/2-1; i >= 0; i--) {
			if (arr.get(i).val != p1.val) {
				return false;
			} 
			p1 = p1.next;
		}
		return true;
    }
	public static void main(String[] args) {

	}

}
