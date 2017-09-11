package Other;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class LetterStatistics {
    public static void main(String[] args) throws IOException {
        List<String> list = Files.readAllLines(Paths.get("Book.txt"));
        Map<String, Integer> statistics = new HashMap<>();

        for (String string : list) {
            char[] temp = string.toCharArray();
            for (char ch : temp) {
                if (statistics.containsKey(String.valueOf(ch))) {
                    statistics.put(String.valueOf(ch), statistics.get(String.valueOf(ch)) + 1);
                } else {
                    statistics.put(String.valueOf(ch), 1);
                }
            }
        }

        int count = statistics.size() - 1;

        for (int i = 0; i < count; i++) {
            Set keyStatistics = statistics.keySet();
            int max = 0;

            for (Object ch : keyStatistics) {
                if (statistics.get(String.valueOf(ch)) > max) {
                    max = statistics.get(String.valueOf(ch));
                }
            }

            for (Object ch : keyStatistics) {
                if (statistics.get(String.valueOf(ch)) == max) {
                    System.out.println(ch + " - " + statistics.get(String.valueOf(ch)));
                    statistics.remove(String.valueOf(ch));
                    break;
                }
            }
        }

    }
}
