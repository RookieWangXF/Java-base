package cn.rookie.listnode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Rookie on 2016/9/20.
 * Description:
 */
public class PrintListFromTailToHeadTest {

    private PrintListFromTailToHead demo;
    @Before
    public void setUp() throws Exception {
        demo = new PrintListFromTailToHead();
    }

    @Test
    public void printListFromTailToHead() throws Exception {
        ListNode listNode = null;
        demo.printListFromTailToHead(listNode);
    }
    @Test
    public void printListFromTailToHead2() throws Exception {
        ListNode listNode = new ListNode();
        demo.printListFromTailToHead(listNode);
    }

}