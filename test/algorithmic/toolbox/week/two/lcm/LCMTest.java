package algorithmic.toolbox.week.two.lcm;

import algorithmic.toolbox.util.SystemIOMock;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LCMTest extends SystemIOMock {

    @Test
    public void shouldCorrectlyCalculateLCMGivenInputOfSixAndEight() {
        systemInMock.provideLines("6 8");
        LCM.main(emptyArray);
        assertEquals("24", systemOutRule.getLog().trim());
    }

    @Test(timeout = 500)
    public void shouldCorrectlyCalculateLCMForLargerInputInTimelyFashion() {
        systemInMock.provideLines("28851538 1183019");
        LCM.main(emptyArray);
        assertEquals("1933053046", systemOutRule.getLog().trim());
    }
}