package cn.rookie.listnode;

public class ReverseLinkedList {
	/**
	   * @Name: reverseList
	   * @Description: @param head
	   * @Description: @return
	   * @Author: fei
	   * @Version: V1.00 ���汾�ţ�
	   * @Create Date: 2015��9��30������6:08:24
	   * @Return: ListNode
	 */
	public static ListNode reverseList(ListNode head) {
		if (head == null) {
			return null;
		}
	       ListNode first = new ListNode(0);
	       ListNode p,q;
	       p = head;
	       while (p.next != null) {
	    	   q = p.next;
	    	   p.next = first.next;
	    	   first.next = p;
	    	   p = q;
	    	   q = q.next;
	       }
	       p.next = first.next;
    	   first.next = p;
		return p;
    }
	
	public static void main(String[] args) {

	}

}
