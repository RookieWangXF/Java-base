package cn.rookie.io.file;

import java.io.File;
import java.io.IOException;

/**
 * Created by Rookie on 2016/4/20.
 */
public class RemoveFile {

    /**
     * 删除所有文件及文件夹
     * @param path
     * @throws IOException
     */
    public static void removeFolder(String path) throws IOException {
        File filePath = new File(path);
        if (filePath.exists()) {
            remove(filePath);
        }

    }

    public static void remove(File dir) {
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                remove(file);
            } else {
                file.delete();
            }
        }

        dir.delete();
    }


    public static void main(String[] args) throws IOException {
        String path = "G:lei";
        removeFolder(path);
    }
}
