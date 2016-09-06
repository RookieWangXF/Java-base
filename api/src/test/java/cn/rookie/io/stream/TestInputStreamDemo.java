package cn.rookie.io.stream;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by Rookie on 2016/4/19.
 */
public class TestInputStreamDemo {
    private InputStreamDemo inputStreamDemo;
    private String path = "src/demo1/resources/StreamDemo.txt";
    @Before
    public void setUp() {
        inputStreamDemo = new InputStreamDemo();
    }

    @Test
    public void testStream01() throws IOException {
        inputStreamDemo.Stream01(path);
    }
    @Test
    public void testStream02() throws IOException {
        inputStreamDemo.Stream02(path);
    }
    @Test
    public void testStream03() throws IOException {
        inputStreamDemo.Stream03(path);
    }
}
