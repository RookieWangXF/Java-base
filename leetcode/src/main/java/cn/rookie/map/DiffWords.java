package cn.rookie.map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by fei on 2016/4/9.
 */
public class DiffWords {


    /**
     * 暴力办法
     *
     * @param theWords
     * @return
     */
    public Map<String, List<String>> computeAdjacentWords(List<String> theWords) {
        Map<String, List<String>> adjWords = new TreeMap<String, List<String>>();
        String[] words = new String[theWords.size()];

        theWords.toArray(words);
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (oneCharOff(words[i], words[j])) {
                    update(adjWords, words[i], words[j]);
                    update(adjWords, words[j], words[i]);
                }
            }
        }

        return adjWords;
    }

    public Map<String, List<String>> computeAdjacentWords2(List<String> theWords) {
        Map<String, List<String>> adjWords = new TreeMap<>();
        Map<Integer, List<String>> wordsByLength = new TreeMap<>();

        for (String s : theWords) {
            update(wordsByLength, s.length(), s);
        }

        for (List<String> groupsWords : wordsByLength.values()) {
            String[] words = new String[groupsWords.size()];

            groupsWords.toArray(words);

            for (int i = 0; i < words.length; i++) {
                for (int j = i + 1; j < words.length; j++) {
                    if (oneCharOff(words[i], words[j])) {
                        update(adjWords, words[i], words[j]);
                        update(adjWords, words[j], words[i]);
                    }
                }
            }
        }
        return adjWords;

    }

    /**
     * 运行速度最快的算法
     * @param theWords
     * @return
     */
    public Map<String, List<String>> computeAdjacentWords3(List<String> theWords) {
        Map<String, List<String>> adjWords = new TreeMap<>();
        Map<Integer, List<String>> wordsByLength = new TreeMap<>();

        for (String s : theWords) {
            update(wordsByLength, s.length(), s);
        }

        //针对排好序的每一组进行处理
        for (Map.Entry<Integer, List<String>> entry : wordsByLength.entrySet()) {
            List<String> groupsWords = entry.getValue();
            int groupNum = entry.getKey();

            for (int i = 0; i < groupNum;i++) {

                Map<String, List<String>> repToWord = new TreeMap<>();

                for (String str : groupsWords) {
                    String rep = str.substring(0, i) + str.substring(i + 1);
                    update(repToWord, rep, str);
                }

                for (List<String> wordClique : repToWord.values()) {
                    if (wordClique.size() >= 2) {
                        for (String s1 : wordClique) {
                            for (String s2 : wordClique) {
                                if (s1 != s2) {
                                    update(adjWords, s1, s2);
                                }
                            }
                        }
                    }
                }
            }
        }
        return adjWords;

    }
    /**
     *
     * @param map
     * @param length
     * @param s
     */
    private void update(Map<Integer, List<String>> map, int length, String s) {
        List<String> list = map.get(length);
        if (list == null) {
            list = new ArrayList<>();
            map.put(length, list);
        }

        list.add(s);
    }


    /**
     * 把字符串更新到结果集合中去
     * @param map
     * @param key
     * @param value
     */
    private void update(Map<String, List<String>> map, String key, String value) {
        List<String> list = map.get(key);
        if (list == null) {
            list = new ArrayList<>();
            map.put(key, list);
        }

        list.add(value);
    }

    /**
     * 比较两个单词是否相同
     *
     * @param word1
     * @param word2
     * @return
     */
    private boolean oneCharOff(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        int diffs = 0;

        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) != word2.charAt(i)) {
                if (++diffs > 1) {
                    return false;
                }
            }
        }
        return diffs == 1;
    }

    /**
     * 输出打印结果
     *
     * @param adjWords
     * @param minWords 结果数量小于这个数，那么就打印
     */
    public static void printHighChangeables(Map<String, List<String>> adjWords, int minWords) {
        for (Map.Entry<String, List<String>> entry : adjWords.entrySet()) {
            List<String> words = entry.getValue();

            if (words.size() > minWords) {
                System.out.print(entry.getKey() + " (");
                System.out.print(words.size() + "):");
                for (String w : words) {
                    System.out.print(" " + w);
                }
                System.out.println();
            }
        }
    }
}
