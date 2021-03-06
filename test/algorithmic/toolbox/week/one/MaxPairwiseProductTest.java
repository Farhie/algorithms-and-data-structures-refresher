package algorithmic.toolbox.week.one;


import algorithmic.toolbox.util.SystemIOMock;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxPairwiseProductTest extends SystemIOMock {

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

    @Test
    public void shouldHandleSingleNumberInput() {
        systemInMock.provideLines("1", "100000");
        MaxPairwiseProduct.main(emptyArray);
        assertEquals("100000", systemOutRule.getLog().trim());
    }

    @Test
    public void shouldHandleNoNumbersInput() {
        systemInMock.provideLines("0", " ");
        MaxPairwiseProduct.main(emptyArray);
        assertEquals("0", systemOutRule.getLog().trim());
    }

    @Test
    public void shouldHandleTwoLargestNumbersBeingIdentical() {
        systemInMock.provideLines("11", "68165 30342 87637 74297 2904 32873 86010 87637 66131 82858 82935");
        MaxPairwiseProduct.main(emptyArray);
        assertEquals("7680243769", systemOutRule.getLog().trim());
    }

    @Test
    public void shouldHandleSmallestPossibleInput() {
        systemInMock.provideLines("2", "3 2");
        MaxPairwiseProduct.main(emptyArray);
        assertEquals("6", systemOutRule.getLog().trim());
    }

    private String generateNumericInputStringOf(int totalNumbers) {
        String input = "";
        for (int i = 0; i < totalNumbers; i++) {
            input = input.concat(i + " ");
        }
        return input;
    }
}
