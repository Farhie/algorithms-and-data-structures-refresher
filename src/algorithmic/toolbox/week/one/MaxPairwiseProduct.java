package algorithmic.toolbox.week.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaxPairwiseProduct {
    static long getMaxPairwiseProduct(long[] numbers) {
        int n = numbers.length;
        if (n == 1) {
            return numbers[0];
        }
        if (n == 0) {
            return 0;
        }
        int highestNumberIndex = 0;
        for (int i = 0; i < n; i++) {
            if (numbers[i] > numbers[highestNumberIndex]) {
                highestNumberIndex = i;
            }
        }
        int secondHighestNumberIndex = (highestNumberIndex == 0) ? 1 : 0;
        for (int i = 0; i < n; i++) {
            if (numbers[i] > numbers[secondHighestNumberIndex] && highestNumberIndex != i) {
                secondHighestNumberIndex = i;
            }
        }
        return numbers[highestNumberIndex] * numbers[secondHighestNumberIndex];
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        long numberArrayLength = scanner.nextLong();
        long[] numbers = new long[(int) numberArrayLength];
        for (int i = 0; i < numberArrayLength; i++) {
            numbers[i] = scanner.nextLong();
        }
        System.out.println(getMaxPairwiseProduct(numbers));
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}