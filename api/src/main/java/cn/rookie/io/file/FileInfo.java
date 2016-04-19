package cn.rookie.io.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Rookie on 2016/4/19.
 */
public class FileInfo {

    public static void printFileInfo(File file) {
        String fileName = file.getName();
        String absPath = file.getAbsolutePath();
        String path = file.getPath();
        long len = file.length();
        long lastModified = file.lastModified();

        Date date = new Date(lastModified);

        System.out.println("name:  "+fileName);
        System.out.println("absPath:  "+absPath);
        System.out.println("path:  "+path);
        System.out.println("len:  "+len);
        System.out.println("time:  "+lastModified);
        System.out.println("str_time:  "+new SimpleDateFormat("yyyy-MM-dd:HH-mm-ss").format(date));
    }
}
