package WordsStatistics;

import java.util.Comparator;
import java.util.List;

public class LongestWord {
    public static void longestWordFromFile(List<String> fromFileList) {
        String longestWord = fromFileList.stream().sorted(Comparator.comparingInt(String::length)).reduce((first, second) -> second).orElse(null);
        System.out.println(longestWord);
    }
}
