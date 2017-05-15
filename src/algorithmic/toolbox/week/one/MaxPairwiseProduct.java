package algorithmic.toolbox.week.one;

import java.util.*;
import java.io.*;

public class MaxPairwiseProduct {
    static long getMaxPairwiseProduct(long[] numbers) {
        int n = numbers.length;
        if(n == 1) {
            return numbers[0];
        }
        if(n == 0) {
            return 0;
        }
        for (int i = 0; i < n - 1; i++) {
            if(numbers[i] > numbers[i+1]) {
                long swapValue = numbers[i+1];
                numbers[i+1] = numbers[i];
                numbers[i] = swapValue;
            }
        }
        return numbers[n - 1] * numbers[n - 2];
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