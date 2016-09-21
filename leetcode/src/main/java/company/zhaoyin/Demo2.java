package company.zhaoyin;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Demo2 {
    public static Map<String, Integer> searchDirectory(String fileName) {
        Map<String, Integer> result = new HashMap<String, Integer>();
        File file = new File(fileName);
        if (file == null) {
            return result;
        }
        if (file.isFile()) {
            String fileNameStr = file.getName();
            int index = fileNameStr.indexOf(".");
            String fileType = null;
            if (index > 0) {
                fileType = fileNameStr.substring(index + 1).toUpperCase();
            } else {
                fileType = fileNameStr.toUpperCase();
            }
            result.put(fileType, 1);
        } else {
            File[] subFiles = file.listFiles();
            for (File subFile : subFiles) {
                Map<String, Integer> subResult = searchDirectory(subFile.getAbsolutePath());
                Iterator<Map.Entry<String, Integer>> iterator = subResult
                        .entrySet().iterator();
                while (iterator.hasNext()) {
                    Map.Entry<String, Integer> temp = iterator.next();
                    Integer counter = result.get(temp.getKey());
                    if (counter == null || counter == 0) {
                        result.put(temp.getKey(),1);
                    } else {
                        result.put(temp.getKey(),result.get(temp.getKey())+1);
                    }
                }
            }
        }
        return result;
    }
}
