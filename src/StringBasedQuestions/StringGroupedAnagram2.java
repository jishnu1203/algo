package StringBasedQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringGroupedAnagram2 {
    public static void main(String[] args) {
        List<String> listString = List.of("eat", "tea", "tan", "ate", "nat", "bat");

//         Map<String, List<String>> output = listString.stream().collect(Collectors.groupingBy(words -> {
//            char[] ch = words.toCharArray();
//            Arrays.sort(ch);
//            return new String(ch);
//        }));
//
//         output.entrySet().forEach(System.out::println);

        List<List<String>> groupedAnagrams = new ArrayList<>(
                listString.stream().collect(Collectors.groupingBy(words -> {
                    char[] ch = words.toCharArray();
                    Arrays.sort(ch);
                    return new String(ch);
                })).values()
        );

//        System.out.println(groupedAnagrams);
        List<List<String>> llllll = new ArrayList<>(listString.stream().collect(Collectors.
                groupingBy( str -> {
            char[] s = str.toCharArray();
            Arrays.sort(s);
            return new String(s);
        })).values());


        System.out.println(llllll);

    }
}
