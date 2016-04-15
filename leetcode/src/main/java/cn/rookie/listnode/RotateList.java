package cn.rookie.listnode;

/**
 * Created by Rookie on 2016/4/10.
 * Description:
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */
public class RotateList {
    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        int length = LinkedLength(head);
        ListNode first = head;
        ListNode second = head;
        k = k % length;
        for (int i = 0; i < k; i++) {
            first = first.next;
        }
        while (first.next != null) {
            first = first.next;
            second = second.next;
        }
        first.next = head;
        head = second.next;
        second.next = null;
        return head;
    }
    private static int LinkedLength(ListNode head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }
    public static void main(String[] args) {

    }
}
