package cn.rookie.object.clone;


import org.junit.Before;
import org.junit.Test;

/**
 * Created by Rookie on 2016/5/15.
 * Package_name is cn.rookie.object.clone
 * Description:
 */
public class BookCloneTest {
    private BookClone bookA;
    private BookClone bookB;

    @Before
    public void init() throws CloneNotSupportedException {
        bookA= new BookClone("Java", 12.34);
        bookB = (BookClone) bookA.clone();
    }
    @Test
    public void testClone() throws Exception {
        System.out.println(bookB != bookA);
        System.out.println(bookB.getClass() == bookA.getClass());
        System.out.println(bookB.equals(bookA));
    }


}