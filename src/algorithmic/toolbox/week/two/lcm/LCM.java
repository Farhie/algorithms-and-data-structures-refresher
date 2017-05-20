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

    private static long lowestCommonMultiple(long valueA, long valueB) {
        long largestNumber = valueA < valueB ? valueB : valueA;

        long[] multiplesOfValueA = new long[(int) largestNumber];

        for (int i = 1; i * valueA <= valueA * valueB; i++) {
            multiplesOfValueA[i] = i * valueA;
        }

        for (int i = 1; i * valueB < valueA * valueB; i++) {
            if(valueHasBeenSeenAsMultipleOfA((i * valueB), multiplesOfValueA)){
                return i * valueB;
            }
        }

        return valueA * valueB;
    }

    private static boolean valueHasBeenSeenAsMultipleOfA(long value, long[] multiplesOfValueA) {
        for(long multipleOfA : multiplesOfValueA) {
            if (multipleOfA == value) {
                return true;
            } else if(multipleOfA > value) {
                return false;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();

        System.out.println(lowestCommonMultiple(a, b));
    }
}
