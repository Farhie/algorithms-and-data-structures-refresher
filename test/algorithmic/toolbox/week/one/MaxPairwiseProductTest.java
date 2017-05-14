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
}
