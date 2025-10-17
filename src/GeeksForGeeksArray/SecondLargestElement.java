package GeeksForGeeksArray;

import java.util.Arrays;

public class SecondLargestElement {

    public static int[] getSecondLargest(int[] input) {
        int secondLargest = 0;
        int thirdLargest = 0;
        int largest = 0;
        // [12  ,   35  ,  1 ,   10 ,  34 ,  1  ]
        for(int i=0; i< input.length; i++) {

            if(largest < input[i]){
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = input[i];
                continue;
            }
            if(secondLargest < input[i] && largest != input[i] ){
                secondLargest = input[i];
                continue;
            }
            if(thirdLargest < input[i] && secondLargest != input[i] &&  largest != input[i]){
                thirdLargest = input[i];
            }

        }
        return new int[]{largest, secondLargest, thirdLargest};
    }

    public static void main(String[] args) {
        int[] input = {12, 35, 1, 10, 34, 1 , 35, 60};
        System.out.println(Arrays.toString(getSecondLargest(input)));
    }
}
