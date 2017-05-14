package algorithmic.toolbox.week.one;

import java.util.Scanner;

public class APlusB {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        validateInput(a, b);
        System.out.println(a + b);
    }

    private static void validateInput(int a, int b) {
        if(a < 0) {throw new IllegalArgumentException("a must be greater than zero");}
        if(b > 9) {throw new IllegalArgumentException("b must be less than or equal to 9");}
    }
}
