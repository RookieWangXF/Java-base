package cn.rookie.listnode;

public class IntersectionofTwoLinkedLists {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    	if (headA == null || headB == null) {
			return null;
		}
        /*
         * ѭ��һ���ҳ���������·�Ĳ��
         */
    	ListNode nodeA = headA;
    	ListNode nodeB = headB;
    	int len = 0;
    	boolean flag = true;
    	while (nodeA != null & nodeB != null) {
			nodeA = nodeA.next;
			nodeB = nodeB.next;
		}
    	if (nodeA != null) {
    		while (nodeA != null) {
    			len++;
    			nodeA = nodeA.next;
    		}
		}
    	if (nodeB != null) {
    		flag = false;
    		while (nodeB != null) {
    			len++;
    			nodeB = nodeB.next;
    		}
		}
    	/*
    	 * �Ӳ��ĵ㿪ʼ���������ߡ�
    	 */
    	if (flag) {
			nodeA = headA;
			nodeB = headB;
			for (int i = 0; i < len; i++) {
				nodeA = nodeA.next;
			}
		}else {
			nodeA = headA;
			nodeB = headB;
			for (int i = 0; i < len; i++) {
				nodeB = nodeB.next;
			}
		}
    	while (nodeA != null && nodeB != null) {
			if (nodeA.val == nodeB.val) {
				return nodeA;
			}
		}
    	return null;
    }
	public static void main(String[] args) {
		
	}

}
