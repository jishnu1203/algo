package Fibonacci;

public class RecursionFibonacci2 {
    public static void main(String[] args) {
        int finalValue = getValueForRecursion(7);
        System.out.println(finalValue);
    }

    public static int getValueForRecursion(int initialValue) {
        System.out.println(initialValue);
        if(initialValue == 0) return 0;
        if(initialValue==1)  return 1;
//                OR
//        if (initialValue < 2) return initialValue;

        return getValueForRecursion(initialValue -1) + getValueForRecursion(initialValue-2);

    }
}
