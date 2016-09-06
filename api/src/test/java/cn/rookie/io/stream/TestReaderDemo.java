package cn.rookie.io.stream;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by Rookie on 2016/4/19.
 */
public class TestReaderDemo {
    private ReaderDemo readerDemo;
    private String path = "src/demo1/resources/StreamDemo.txt";
    @Before
    public void setUp() {
        readerDemo = new ReaderDemo();
    }

    @Test
    public void testStream01() throws IOException {
        readerDemo.read01(path);
    }
    @Test
    public void testStream02() throws IOException {
        readerDemo.read02(path);
    }
    @Test
    public void testStream03() throws IOException {
        readerDemo.read03(path);
    }
}
