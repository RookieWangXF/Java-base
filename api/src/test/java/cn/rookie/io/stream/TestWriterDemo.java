package cn.rookie.io.stream;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by Rookie on 2016/4/19.
 */
public class TestWriterDemo {
    private WriterDemo writerDemo;
    @Before
    public void setUp() {
        writerDemo = new WriterDemo();
    }

    @Test
    public void testwriter01() throws IOException {
        String path = "src/main/resources/io/stream/WriterDemo.txt";
        writerDemo.writer01(path);
    }
}
