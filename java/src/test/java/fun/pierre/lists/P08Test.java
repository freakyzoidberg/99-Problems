package fun.pierre.lists;

import org.junit.Test;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class P08Test {
    @Test
    public void shoulTestDuppedIntList() {
        assertThat(P08.consecutiveDedup(asList(1, 2, 2, 3, 3, 2, 1)), is(asList(1, 2, 3, 2, 1)));
    }

    @Test
    public void shoulTestDuppedCharList() {
        assertThat(P08.consecutiveDedup(asList('a', 'b', 'b', 'a')), is(asList('a', 'b', 'a')));
    }
}
