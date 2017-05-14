package algorithmic.toolbox.week.one;


import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

public class MaxPairwiseProductTest {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void shouldReturnCorrectResultOnBaseCase() {
        MaxPairwiseProduct.main();
    }
}
