package HERE_PREP;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static Map<Integer,Integer> map = new HashMap<>();

    public static void main(String[] args) {
        int[] exampleOneInput = {2,7,11,15};
        int exampleOneTarget = 9;
        twoSum(exampleOneInput, exampleOneTarget);
    }

    public static void twoSum(int[] arr, int k){
        int value = 0;
        for(int i=0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                System.out.println(map.get(value) + " ----- " + i);
            }
            value = k - arr[i];
            map.put(value, i);
        }
    }
}
