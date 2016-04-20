package cn.rookie.io.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Rookie on 2016/4/20.
 */
public class CreateFile {

    /**
     * 创建文件夹
     * @param path
     * @throws IOException
     */
    public void newFolder(String path) throws IOException {
        String filePath = "G:" + File.separator + path;
        File myPath = new File(filePath);

        String filePathLong = "G:"+File.separator+"leilei"+File.separator+"love"+File.separator+path;
        File myPathLong = new File(filePathLong);

        if (!myPath.exists()) {
            myPath.mkdir();
        }

        /*
		 * 如果是创建多级目录，那么要先判断多级目录是否存在，否则直接创建最底层的会出现错误。
		 */
        if (!myPathLong.getParentFile().exists()) {
            myPathLong.getParentFile().mkdirs();
        }
        if (!myPathLong.exists()) {
            myPathLong.mkdir();
        }
    }

    /**
     * 创建文件
     * @param filePath
     * @param fileName
     * @param fileContent
     */
    public void newFile(String filePath,String fileName,String fileContent) {
        try {
            File path = new File(filePath);
            if (!path.exists()) {
                path.mkdirs();
            }
            File myFile = new File(fileName);
            if (!myFile.exists()) {
                myFile.createNewFile();
            }

            FileWriter writer = new FileWriter(myFile);
            PrintWriter file = new PrintWriter(writer);
            file.println(fileContent);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        CreateFile c = new CreateFile();
        c.newFolder("lei");
    }
}
