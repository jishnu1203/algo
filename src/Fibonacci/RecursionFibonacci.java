package Fibonacci;

// FOr understanding
public class RecursionFibonacci {
    public static void main(String[] args) {
        int finalValue = getValueForRecursion(7);
        System.out.println(finalValue);
    }

    public static int getValueForRecursion(int initialValue) {

        if(initialValue == 0) return 0;
        if(initialValue==1)  return 1;

        System.out.println(initialValue);
        int first = getValueForRecursion(initialValue -1);
        System.out.println("----------");
        System.out.println(initialValue);
        int second = getValueForRecursion2(initialValue-2);

        return first + second;

    }
// for understanding
    public static int getValueForRecursion2(int initialValue){
        System.out.println("testttt" + initialValue );
        if(initialValue == 0) return 0;
        if(initialValue==1)  return 1;
    return 1;
    }
}
