package algorithmic.toolbox.week.two.gcd;

import algorithmic.toolbox.util.SystemIOMock;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class GCDTest extends SystemIOMock {

    private static final String LOWER_BOUND = "1";
    private static final String UPPER_BOUND = "2000000000";

    @Test
    public void shouldCorrectlyCalculateGCDForLowerBound() {
        systemInMock.provideLines(LOWER_BOUND + " " + LOWER_BOUND);
        GCD.main(emptyArray);
        assertEquals("1", systemOutRule.getLog().trim());
    }


    @Test(timeout = 500)
    public void shouldCorrectlyCalculateGCDForUpperBound() {
        systemInMock.provideLines(UPPER_BOUND + " " + UPPER_BOUND);
        GCD.main(emptyArray);
        assertEquals(UPPER_BOUND, systemOutRule.getLog().trim());
    }


}