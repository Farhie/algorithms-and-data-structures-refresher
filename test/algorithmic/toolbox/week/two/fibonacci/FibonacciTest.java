package algorithmic.toolbox.week.two.fibonacci;

import algorithmic.toolbox.util.SystemIOMock;
import algorithmic.toolbox.week.one.MaxPairwiseProduct;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest extends SystemIOMock {

    @Test
    public void shouldCorrectlyCalculateFibonacciForZero() {
        systemInMock.provideLines("0");
        Fibonacci.main(emptyArray);
        assertEquals("0", systemOutRule.getLog().trim());
    }

    @Test
    public void shouldCorrectlyCalculateFibonacciForOne() {
        systemInMock.provideLines("1");
        Fibonacci.main(emptyArray);
        assertEquals("1", systemOutRule.getLog().trim());
    }

    @Test
    public void shouldCorrectlyCalculateFibonacciForTen() {
        systemInMock.provideLines("10");
        Fibonacci.main(emptyArray);
        assertEquals("55", systemOutRule.getLog().trim());
    }

}