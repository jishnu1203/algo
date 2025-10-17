package GeeksForGeeksArray;

import java.util.*;

public class TopThreeLargestElement {
    public static void main(String[] args) {
        int[] salaries = {50000, 75000, 60000, 90000, 80000, 120000, 55000};
        Queue<Integer> que = new PriorityQueue<>();


        for(int i=0; i < salaries.length  ;i++){
            que.offer(salaries[i]);
            if(que.size() > 3 ) {
                que.poll();
            }
        }

//        List<Integer> list = new ArrayList<>(que);
//        list.sort(Collections.reverseOrder());

        for(Integer x : que){
            System.out.println(x);
        }

    }
}
