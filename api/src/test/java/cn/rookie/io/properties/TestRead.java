package cn.rookie.io.properties;

import org.junit.Test;

import java.io.IOException;

/**
 * Created by Rookie on 2016/4/23.
 * Package name is cn.rookie.io.properties
 * Description:
 */
public class TestRead {

    @Test
    public void read() throws IOException {
        String path = "src/demo1/resources/aa.properties";
        Read.read(path);
    }
}
