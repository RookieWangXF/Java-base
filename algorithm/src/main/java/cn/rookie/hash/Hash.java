package cn.rookie.hash;

/**
 * Created by fei on 2016/4/9.
 */
public class Hash {
    /**
     * 实现一个hash函数，计算每个元素的位置
     * @param key
     * @param tableSize
     * @return
     */
    public static int hash(String key, int tableSize) {
        int hashVal = 0;
        for (int i = 0; i< key.length();i++) {
            hashVal = 37 * hashVal + key.charAt(i);
        }

        hashVal %= tableSize;
        if (hashVal < 0) {
            hashVal += tableSize;
        }
        return hashVal;
    }
}
