package cn.rookie.io.stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by Rookie on 2016/4/19.
 */
public class WriterDemo {
    public void writer01(String path) throws IOException {
        File file = new File(path);
        Writer writer = new FileWriter(file);
        String str = "asda你好撒大哥噶f";
        writer.write(str);
        writer.close();
    }
}
