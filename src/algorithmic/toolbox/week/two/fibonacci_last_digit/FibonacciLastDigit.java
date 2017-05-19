package algorithmic.toolbox.week.two.fibonacci_last_digit;

import java.util.Scanner;

public class FibonacciLastDigit {

    private static int getFibonacciLastDigitNaive(int n) {
        if (n <= 1)
            return n;

        int[] fibonacciSequence = new int[n + 1];
        initialiseFibonacciSequence(fibonacciSequence);

        for (int i = 2; i <= n; i++) {
            fibonacciSequence[i] = (fibonacciSequence[i - 1] + fibonacciSequence[i - 2]) % 10;
        }

        return fibonacciSequence[n];
    }

    private static void initialiseFibonacciSequence(int[] fibonacciSequence) {
        fibonacciSequence[0] = 0;
        fibonacciSequence[1] = 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = getFibonacciLastDigitNaive(n);
        System.out.println(c);
    }
}

