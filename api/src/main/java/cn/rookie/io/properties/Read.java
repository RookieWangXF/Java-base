package cn.rookie.io.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.stream.Stream;

/**
 * Created by Rookie on 2016/4/23.
 * Package name is cn.rookie.io.properties
 * Description:
 */
public class Read {

    public static void read(String path) throws IOException {
        Properties p = new Properties();
        InputStream in = new FileInputStream(path);
        p.load(in);
        System.out.println(p.getProperty("name"));
    }

    public static void main(String[] args) throws IOException {
        String path = "src/main/resources/aa.properties";
        Read.read(path);
    }

}
