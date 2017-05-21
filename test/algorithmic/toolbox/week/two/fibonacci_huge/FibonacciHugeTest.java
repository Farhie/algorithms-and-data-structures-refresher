package algorithmic.toolbox.week.two.fibonacci_huge;

import algorithmic.toolbox.util.SystemIOMock;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciHugeTest extends SystemIOMock {

    private static final String UPPER_BOUND_OF_N = "1000000000000000000";
    private static final String UPPER_BOUND_OF_M = "1000000000000000";

    @Test
    public void shouldCorrectlyCalculateFibonacciModuloForOneAndTwoHundredAndThirtyNine() {
        systemInMock.provideLines("1 239");
        FibonacciHuge.main(emptyArray);
        assertEquals("1", systemOutRule.getLog().trim());
    }

    @Test
    public void shouldCorrectlyCalculateFibonacciModuloForTwoHundredAndThirtyNineAndOneThousand() {
        systemInMock.provideLines("239 1000");
        FibonacciHuge.main(emptyArray);
        assertEquals("161", systemOutRule.getLog().trim());
    }

    @Test(timeout = 500)
    public void shouldCorrectlyCalculateFibonacciModuloForLargerInputInUnderHalfASecond() {
        systemInMock.provideLines("2816213588 30524");
        FibonacciHuge.main(emptyArray);
        assertEquals("10249", systemOutRule.getLog().trim());
    }

    @Test(timeout = 500)
    public void shouldCorrectlyCalculateFibonacciModuloForUpperBoundInUnderHalfASecond() {
        systemInMock.provideLines(UPPER_BOUND_OF_N + " " + UPPER_BOUND_OF_M);
        FibonacciHuge.main(emptyArray);
        assertEquals("10249", systemOutRule.getLog().trim());
    }
}