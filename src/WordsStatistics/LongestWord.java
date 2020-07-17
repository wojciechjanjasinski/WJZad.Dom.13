package WordsStatistics;

import java.util.List;


public class LongestWord {
    public static String longestWordFromFile(List<String> fromFileList) {
        int zero = 0;
        String longestString = null;
        for (String words : fromFileList) {
            if (words.length() > zero) {
                zero = words.length();
                longestString = words;
            }
        }
        return longestString;
    }
}
