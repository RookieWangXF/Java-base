package cn.rookie.io.file;

import org.junit.Test;

import java.io.File;

/**
 * Created by Rookie on 2016/4/19.
 */
public class TestFileInfo {

    @Test
    public void testPringFileInfo() {
        File file = new File("src/demo1/resources/io/stream/OutDemo02.txt");
        FileInfo.printFileInfo(file);
    }

    @Test
    public void testListAll() {
        String path = "D:";
        File file = new File(path);
        FileInfo.listAll(file,0);
    }
}
