package algorithmic.toolbox.week.two.fibonacci;

import algorithmic.toolbox.util.SystemIOMock;
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

    @Test(timeout = 1000)
    public void shouldCorrectlyCalculateFibonacciForSixtyInATimelyManner() {
        systemInMock.provideLines("60");
        Fibonacci.main(emptyArray);
        assertEquals("956722026041", systemOutRule.getLog().trim());
    }
}