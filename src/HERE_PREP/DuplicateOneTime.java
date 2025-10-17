package HERE_PREP;

import java.util.HashSet;

public class DuplicateOneTime {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        HashSet<Integer> hash = new HashSet<>();
        for(int i=0; i < numbers.length ;i++){
            if(hash.contains(numbers[i])){
//                System.out.println(numbers[i]);
            }
            hash.add(numbers[i]);
        }

        for(Integer ii : hash){
            System.out.println(ii);
        }
    }
}
