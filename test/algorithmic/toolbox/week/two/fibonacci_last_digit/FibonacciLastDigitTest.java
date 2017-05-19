package algorithmic.toolbox.week.two.fibonacci_last_digit;

import algorithmic.toolbox.util.SystemIOMock;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciLastDigitTest extends SystemIOMock {

    private static final String LOWER_BOUND = "0";
    private static final String UPPER_BOUND = "10000000";

    @Test
    public void shouldReturnZeroAsLastDigitForLowerBound() {
        systemInMock.provideLines(LOWER_BOUND);
        FibonacciLastDigit.main(emptyArray);
        assertEquals("0", systemOutRule.getLog().trim());
    }

    @Test(timeout = 500)
    public void shouldReturnZeroAsLastDigitForHundredthFibonacciNumber() {
        systemInMock.provideLines("100");
        FibonacciLastDigit.main(emptyArray);
        assertEquals("5", systemOutRule.getLog().trim());
    }

    @Test(timeout = 500)
    public void shouldReturnZeroAsLastDigitForThreeHundredthFibonacciNumber() {
        systemInMock.provideLines("300");
        FibonacciLastDigit.main(emptyArray);
        assertEquals("0", systemOutRule.getLog().trim());
    }

    @Test(timeout = 500)
    public void shouldReturnZeroAsLastDigitForUpperBound() {
        systemInMock.provideLines(UPPER_BOUND);
        FibonacciLastDigit.main(emptyArray);
        assertEquals("0", systemOutRule.getLog().trim());
    }
}
