package utils;

public class MyMath {

    public static int getDigitsSum(final int src) {
        int n = src;
        int sum = 0;
        if (n < 0) {
            n = n * -1;
        }
        while (n != 0) {
            sum += (n % 10);
            n = n / 10;
        }
        return sum;
    }
}
