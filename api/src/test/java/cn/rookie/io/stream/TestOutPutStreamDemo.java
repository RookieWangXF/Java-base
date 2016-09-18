package cn.rookie.io.stream;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by Rookie on 2016/4/19.
 */
public class TestOutPutStreamDemo {
    private OutputStreamDemo outputStreamDemo;
    @Before
    public void setUp() {
        outputStreamDemo = new OutputStreamDemo();
    }

    @Test
    public void testStream01() throws IOException {
        String path = "src/demo1/resources/io/stream/OutDemo01.txt";
        outputStreamDemo.OutputStream01(path);
    }
    @Test
    public void testStream02() throws IOException {
        String path = "src/main/resources/io/stream/OutDemo02.txt";
        outputStreamDemo.OutputStream02(path);
    }
    @Test
    public void testStream03() throws IOException {
        String path = "src/demo1/resources/io/stream/OutDemo03.txt";
        outputStreamDemo.OutputStream03(path);
    }
}
