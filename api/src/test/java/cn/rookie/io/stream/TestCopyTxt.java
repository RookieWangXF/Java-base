package cn.rookie.io.stream;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by Rookie on 2016/4/19.
 */
public class TestCopyTxt {

    @Test
    public void testCopyBy2() throws IOException {
        String pathForm = "src/demo1/resources/io/stream/OutDemo02.txt";
        String pathTo ="src/demo1/resources/io/stream/CopyTxtBy2.txt";
        CopyTxt.copyBy2(pathForm,pathTo);
    }

    @Test
    public void testCopyByBuff() throws IOException {
        String pathForm = "src/demo1/resources/io/stream/OutDemo02.txt";
        String pathTo ="src/demo1/resources/io/stream/CopyByBuff.txt";
        CopyTxt.copyByBuff(pathForm,pathTo);
    }

    @Test
    public void testCopyByStream() throws IOException {
        String pathForm = "src/demo1/resources/io/stream/OutDemo02.txt";
        String pathTo ="src/demo1/resources/io/stream/CopyByStream.txt";
        CopyTxt.copyByStream(pathForm,pathTo);
    }
}
