package algorithmic.toolbox.week.one;

import java.util.*;
import java.io.*;

public class MaxPairwiseProduct {
    static long getMaxPairwiseProduct(long[] numbers) {
        int n = numbers.length;
        if (n == 1) {
            return numbers[0];
        }
        if (n == 0) {
            return 0;
        }
        int highestNumberPointer = 0;
        int secondHighestNumberPointer = 1;
        for (int i = 2; i < n; i++) {
            if (numbers[i] > numbers[highestNumberPointer]) {
                highestNumberPointer = i;
                continue;
            }
            if(numbers[i] > numbers[secondHighestNumberPointer]) {
                secondHighestNumberPointer = i;
            }
        }
        return numbers[highestNumberPointer] * numbers[secondHighestNumberPointer];
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