package WordsStatistics;

import java.util.Comparator;
import java.util.List;

public class ShortestWord {
    public static void shortestWordFromFile(List<String> fromFileList) {
        fromFileList.sort(Comparator.comparingInt(String::length));
        System.out.println(fromFileList.get(0));
    }
}
