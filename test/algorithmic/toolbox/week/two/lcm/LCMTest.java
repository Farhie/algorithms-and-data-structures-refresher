package algorithmic.toolbox.week.two.lcm;

import algorithmic.toolbox.util.SystemIOMock;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LCMTest extends SystemIOMock {

    private static final String UPPER_BOUND = "2000000000";

    @Test
    public void shouldCorrectlyCalculateLCMGivenInputOfSixAndEight() {
        systemInMock.provideLines("6 8");
        LCM.main(emptyArray);
        assertEquals("24", systemOutRule.getLog().trim());
    }

    @Test(timeout = 500)
    public void shouldCorrectlyCalculateLCMForLargerInputInUnderHalfSecond() {
        systemInMock.provideLines("28851538 1183019");
        LCM.main(emptyArray);
        assertEquals("1933053046", systemOutRule.getLog().trim());
    }

    @Test(timeout = 500)
    public void shouldCorrectlyCalculateLCMForUpperBoundInputInUnderHalfOfSecond() {
        systemInMock.provideLines(UPPER_BOUND + " 2093893838378");
        LCM.main(emptyArray);
        assertEquals("188386011965891584", systemOutRule.getLog().trim());
    }
}