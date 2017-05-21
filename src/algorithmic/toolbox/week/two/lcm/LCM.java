package algorithmic.toolbox.week.two.lcm;

import java.util.Scanner;

public class LCM {

    @Deprecated
    private static long lcm_naive(int a, int b) {
        for (long l = 1; l <= (long) a * b; ++l)
            if (l % a == 0 && l % b == 0)
                return l;

        return (long) a * b;
    }


    private static long gcd_euclidean(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd_euclidean(b, a % b);
    }

    private static long lowestCommonMultiple(long valueA, long valueB) {
        return (valueA * valueB) / gcd_euclidean(valueA, valueB);
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();

        System.out.println(lowestCommonMultiple(a, b));
    }
}
