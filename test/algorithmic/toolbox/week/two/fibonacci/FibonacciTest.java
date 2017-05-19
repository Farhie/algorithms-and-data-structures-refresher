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
    public void shouldCorrectlyCalculateFibonacciForThree() {
        systemInMock.provideLines("3");
        Fibonacci.main(emptyArray);
        assertEquals("2", systemOutRule.getLog().trim());
    }

    @Test
    public void shouldCorrectlyCalculateFibonacciForTen() {
        systemInMock.provideLines("10");
        Fibonacci.main(emptyArray);
        assertEquals("55", systemOutRule.getLog().trim());
    }

    @Test(timeout = 500)
    public void shouldCorrectlyCalculateFibonacciForFortyFiveInATimelyManner() {
        systemInMock.provideLines("45");
        Fibonacci.main(emptyArray);
        assertEquals("1134903170", systemOutRule.getLog().trim());
    }
}