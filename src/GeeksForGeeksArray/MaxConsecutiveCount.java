package GeeksForGeeksArray;

public class MaxConsecutiveCount {



    // [1 ,1 ,0 , 0, 1, 0, 1, 1,  0, 1 , 1,  1,  1]
    public static int getMaxConsecutiveCount(int[] input){
        int count = 0; //           0,    1,   0,  1
        int maxCount = 0; //   1,    2,   2 ,  2
        int previousValue = -1; //  1 ,   1,    0 ,

        for(int i = 0; i < input.length ;i++) {
            if(previousValue == -1){
                previousValue = input[i];
                count++;
            }
            if(previousValue == input[i]){
                count++;
                if(maxCount < count){
                    maxCount = count;
                }
            } else {
                count = 1;
                previousValue = input[i];
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {
        int[] input = {1, 1, 0, 0,0,0,0,0, 1, 0, 1, 0, 1, 1, 1, 1};
        System.out.println(getMaxConsecutiveCount(input));

    }
}
