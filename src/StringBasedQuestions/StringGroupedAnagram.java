package StringBasedQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringGroupedAnagram {
    public static void main(String[] args) {
        List<String> listString = List.of("eat", "tea", "tan", "ate", "nat", "bat");

        List<List<String>> groupedAnagrams = new ArrayList<>(
                listString.stream()
                        .collect(Collectors.groupingBy(word -> {
                            char[] chars = word.toCharArray();
                            Arrays.sort(chars);
                            return new String(chars); // same key for anagrams
                        }))
                        .values()
        );

        System.out.println(groupedAnagrams);
    }
}
