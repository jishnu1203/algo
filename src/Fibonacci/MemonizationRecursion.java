package Fibonacci;

public class MemonizationRecursion {
    public static int[] cache = new int[20];

    public static void main(String[] args) {
        System.out.println(factorial(7));
    }

    public static int factorial(int initialValue){
      int value = 0;
      if(initialValue < 2) return initialValue;
      else if(cache[initialValue] != 0) return cache[initialValue];
      value =  factorial(initialValue -1 ) + factorial(initialValue -2);
      cache[initialValue] = value;
    return value;
    }
}
