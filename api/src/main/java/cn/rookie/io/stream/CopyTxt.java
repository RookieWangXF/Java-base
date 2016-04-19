package cn.rookie.io.stream;

import java.io.*;

/**
 * Created by Rookie on 2016/4/19.
 */
public class CopyTxt {
    /**
     * 使用字符流方式copy
     */
    public static void copyBy2(String pathFrom, String pathTo) throws IOException {
        FileReader fr = new FileReader(pathFrom);
        FileWriter fw = new FileWriter(pathTo);
        int ch = 0;
        while ((ch = fr.read()) != -1) {
            fw.write(ch);
        }
        fw.close();
        fr.close();
    }

    /**
     * 使用缓冲区方式copy
     */
    public static void copyByBuff(String pathFrom, String pathTo) throws IOException {
        FileReader fr = new FileReader(pathFrom);
        BufferedReader bufr = new BufferedReader(fr);

        FileWriter fw = new FileWriter(pathTo);
        BufferedWriter bufw = new BufferedWriter(fw);
        String line = null;

        while ((line = bufr.readLine()) != null) {
            bufw.write(line);
            bufw.newLine();
            bufw.flush();
        }

        bufr.close();
        bufw.close();
    }

    /**
     * 使用字节流方式copy
     */
    public static void copyByStream(String pathFrom, String pathTo) throws IOException {
        InputStream in = new FileInputStream(pathFrom);
        OutputStream out = new FileOutputStream(pathTo);

        int ch;
        while ((ch = in.read()) != -1) {
            out.write(ch);
        }

        in.close();
        out.close();
    }
}
