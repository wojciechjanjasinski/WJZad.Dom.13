package WordsStatistics;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        List<String> testList = Files.readAllLines(new File("Words.txt").toPath(), Charset.defaultCharset());
    }
}
