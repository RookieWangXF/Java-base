package cn.rookie.p2;


public class RemoveNthNodefromEndofList {

	 public ListNode removeNthFromEnd(ListNode head, int n) {
		 if(head ==null){
			 return null;
		 }
		 ListNode pre=null;
		ListNode p,q =null;
		p= head.next;
		for (int i = 1; i < n; i++) {
			p=p.next;
		}
		 q=head.next;
		 while (p.next!=null) {
			 pre = q;
			 p=p.next;
			 q=q.next;
		}
		 if(pre == null){
			 head = q.next;
		 }else {
			pre.next=q.next;
		}
		 return head;
	    }
	 
	public static void main(String[] args) {

	}

}
