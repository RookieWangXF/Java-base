package cn.rookie.listnode;

public class DeleteNodeinaLinkedList {
	    public static void deleteNode(ListNode node) {
	        node.val = node.next.val;
	        ListNode temp = node.next;
	        node.next = temp.next;
	  
	    }
	    
	public static void main(String[] args) {

	}

}
