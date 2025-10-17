package HERE_PREP;

import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 2, 8, 7, 3, 1, 2};
        HashSet<Integer> hash = new HashSet<>();
        for(int i=0; i < numbers.length ;i++){
            if(hash.contains(numbers[i])){
                System.out.println(numbers[i]);
            }
            hash.add(numbers[i]);
        }
    }
}
