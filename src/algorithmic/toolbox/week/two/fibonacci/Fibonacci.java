package algorithmic.toolbox.week.two.fibonacci;

import java.util.Scanner;

public class Fibonacci {
    private static long calc_fib(int n) {
        if (n <= 1)
            return n;

        long[] fibonacciSequence = new long[n + 1];
        initialiseFibonacciSequence(fibonacciSequence);

        for (int i = 2; i <= n; i++) {
            fibonacciSequence[i] = fibonacciSequence[i - 1] + fibonacciSequence[i - 2];
        }

        return fibonacciSequence[n];
    }

    private static void initialiseFibonacciSequence(long[] fibonacciSequence) {
        fibonacciSequence[0] = 0;
        fibonacciSequence[1] = 1;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(calc_fib(n));
    }
}
