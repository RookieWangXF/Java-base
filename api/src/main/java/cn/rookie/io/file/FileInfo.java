package cn.rookie.io.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Rookie on 2016/4/19.
 */
public class FileInfo {

    /**
     * 打印文件的相关信息
     * @param file
     */
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


    /*
	 * 列出文件夹中所有文件
	 */
    public static void listAll(File dir,int temp) {
        System.out.println("dir:"+getSpace(temp)+dir.getName());
        temp++;
        if (dir.exists()) {
            File[] files = dir.listFiles();
            for (int x = 0; x < files.length; x++) {
                if(files[x].isDirectory()){
                    //递归
                    listAll(files[x],temp);
                }else{
                    System.out.println("file:"+getSpace(temp)+files[x].getName()+"  --"+ new SimpleDateFormat("yyyy-MM-dd : HH-mm-ss").format(new Date(files[x].lastModified())));
                }
            }
        }

    }
    public static String getSpace(int temp) {
        StringBuilder sb = new StringBuilder();
        sb.append("|-- ");
        for (int x = 0; x < temp; x++) {
            sb.insert(0, "|-- ");
        }
        return sb.toString();
    }

}
