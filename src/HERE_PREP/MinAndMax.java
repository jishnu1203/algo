package HERE_PREP;

public class MinAndMax {
    public static void main(String[] args) {
        int[] numbers = {7, 2, 9, 1, 5};
        int min = numbers[0];
        int max = numbers[0];

        for(int i=1; i < numbers.length ;i++){

            if(min > numbers[i]){
                min = numbers[i];
            }
            if(max < numbers[i]){
                max = numbers[i];
            }
        }
        System.out.println(min);
        System.out.println(max);


    }


}
