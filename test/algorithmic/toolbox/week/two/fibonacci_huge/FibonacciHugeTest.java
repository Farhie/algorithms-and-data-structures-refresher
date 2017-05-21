package algorithmic.toolbox.week.two.fibonacci_huge;

import algorithmic.toolbox.util.SystemIOMock;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciHugeTest extends SystemIOMock {

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
    public void shouldCorrectlyCalculateFibonacciModuloForLargerInput() {
        systemInMock.provideLines("2816213588 30524");
        FibonacciHuge.main(emptyArray);
        assertEquals("10249", systemOutRule.getLog().trim());
    }
}