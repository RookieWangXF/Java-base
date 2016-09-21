package cn.rookie.listnode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Rookie on 2016/9/21.
 * Description:
 */
public class FindKthToTailTest {
    private FindKthToTail demo;

    @Before
    public void setUp() throws Exception {
        demo = new FindKthToTail();
    }

    @Test
    public void findKthToTail() throws Exception {
        ListNode head = null;
        int k = 0;
        Assert.assertNull(demo.findKthToTail(head,k));
    }

    @Test
    public void findKthToTail2() throws Exception {
        ListNode head = new ListNode(1);
        ListNode next = head;
        for (int i = 0; i < 10; i++) {
            ListNode temp = new ListNode(i);
            next.next = temp;
            next = temp;
        }
        int k = 3;
        Assert.assertEquals(7,demo.findKthToTail(head,k).val);
    }
}