package WordsStatistics;

import java.util.List;

public class SumOfStringsLetters {
    public static void sumOfLetters(List<String> fromFileList) {
        int lettersInStringsSum = fromFileList.stream().mapToInt(String::length).sum();
        System.out.println(lettersInStringsSum);
    }
}
