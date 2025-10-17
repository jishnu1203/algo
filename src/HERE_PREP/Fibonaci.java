package HERE_PREP;

public class Fibonaci {
    private static int[] cache = new int[20];

    public static void main(String[] args) {
        System.out.println(factorial(7));
    }

    private static int factorial(int n) {
        int value = 0;
        if (n < 2) return n;
        else if(cache[n] != 0)  return cache[n];

        value  = factorial(n-1) + factorial(n-2);

        cache[n] = value;
        return value;

    }
}
