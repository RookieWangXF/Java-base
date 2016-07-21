package cn.rookie.listnode;

/**
 * Created by Rookie on 2016/7/21.
 * Package_name is cn.rookie.listnode
 * Description:
 */
public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {

        if (head == null || head.next == null) {
            return false;
        }

        ListNode second = head;

        while (head.next != null && head.next.next != null) {
            head = head.next.next;
            second = second.next;
            if (head == second) {
                return true;
            }
        }

        return false;
    }

}
