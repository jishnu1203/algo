package HERE_PREP;

public class MaxConsicutiveCount {
    public static void main(String[] args) {
        int[] input = {1, 1, 0, 0,0,0,0,0, 1, 0, 1, 0, 1, 1, 1, 1};
        int counter = 1;
        int previous = -1;
        int previouscounter = 1;

        for(int i=0; i< input.length ;i++){
            if(previous == input[i]){
                counter ++;
                continue;
            }
            previous = input[i];

        }
    }
}
