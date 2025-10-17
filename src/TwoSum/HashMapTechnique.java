package TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
//  Becz we are looping once Time complexity is : O(n)
//  Becz we are adding again the value in hashMap space complexity is O(n)
public class HashMapTechnique {

    public static void main(String[] args) {
        int[] exampleOneInput = {2,7,11,15};
        int exampleOneTarget = 9;
        System.out.println(Arrays.toString(twoSum(exampleOneInput, exampleOneTarget)));
        int[] exampletwoInput = {3,2,4};
        int exampletwoTarget = 6;
        System.out.println(Arrays.toString(twoSum(exampletwoInput, exampletwoTarget)));
        int[] exampleThreeInput = {3,3};
        int exampleThreeTarget = 6;
        System.out.println(Arrays.toString(twoSum(exampleThreeInput, exampleThreeTarget)));

    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int indexValueKey = 0; indexValueKey < nums.length; indexValueKey++) {
            int diffrence = target - nums[indexValueKey];

            if(map.containsKey(diffrence)){
                return new int[]{map.get(diffrence), indexValueKey};
            }
            map.put(nums[indexValueKey], indexValueKey);
        }
        return null;
    }


}


