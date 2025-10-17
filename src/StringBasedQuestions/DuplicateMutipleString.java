package StringBasedQuestions;

import java.util.HashSet;
import java.util.Set;

public class DuplicateMutipleString {
    public static void main(String[] args) {
        String firstElement = "jishnu";
        String secondElement = "devika";

        char[] chArrayFirstElement = firstElement.toCharArray();
        char[] chArraySecondElement = secondElement.toCharArray();

        Set<Character> set = new HashSet<>();

        for(int i = 0; i < chArrayFirstElement.length; i++) {
            set.add(chArrayFirstElement[i]);
        }

        for(int i= 0; i< chArraySecondElement.length; i++) {
            if(set.contains(chArraySecondElement[i])){
                System.out.println(chArraySecondElement[i]);
            }
        }
    }
}
