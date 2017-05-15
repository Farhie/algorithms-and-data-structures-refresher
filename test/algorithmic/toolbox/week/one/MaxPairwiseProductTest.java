package algorithmic.toolbox.week.one;


import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;

public class MaxPairwiseProductTest {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Rule
    public final TextFromStandardInputStream systemInMock = emptyStandardInputStream();

    private final String[] emptyArray = {};

    @Test
    public void shouldReturnCorrectResultOnBaseCase() {
        systemInMock.provideLines("3", "1 2 3");
        MaxPairwiseProduct.main(emptyArray);
        assertEquals("6", systemOutRule.getLog().trim());
    }

    @Test
    public void shouldHandleNumbersOutsideBoundsOfInteger() {
        systemInMock.provideLines("2", "100000 90000");
        MaxPairwiseProduct.main(emptyArray);
        assertEquals("9000000000", systemOutRule.getLog().trim());
    }

    @Test(timeout = 30000)
    public void shouldHandleLargeInput() {
        int totalNumberOfValues = 100000;
        String largeInputString = generateNumericInputStringOf(totalNumberOfValues);
        systemInMock.provideLines(String.valueOf(totalNumberOfValues), largeInputString);
        MaxPairwiseProduct.main(emptyArray);
        assertEquals("9999700002", systemOutRule.getLog().trim());
    }

    private String generateNumericInputStringOf(int totalNumbers) {
        String input = "";
        for(int i = 0; i < totalNumbers; i++) {
            input = input.concat(i + " ");
        }
        return input;
    }
}
