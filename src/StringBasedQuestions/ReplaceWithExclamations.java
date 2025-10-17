package StringBasedQuestions;

import java.util.Arrays;

public class ReplaceWithExclamations {

    public static void main(String[] args) {
        String input = "tomorrow";
        int count = 0;
        char target = 'o';
        StringBuilder output = new StringBuilder();

        for(char c : input.toCharArray()){
            if(c == target){
                count++;
                output.append("!".repeat(count));
            } else {
                output.append(c);
            }

        }
        System.out.println(output);
    }



}
