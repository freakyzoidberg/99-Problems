package fun.pierre.lists;

import org.junit.Test;
import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class P02Test {
    @Test
    public void shouldFindLastAndPenultimateOfIntList() {
        assertThat(P02.lastAndPenultimate(asList(1, 2, 3, 4, 5)), is(equalTo(asList(4, 5))));
    }

    @Test
    public void shouldFindLastAndPenultimateOfCharList() {
        assertThat(P02.lastAndPenultimate(asList('a', 'b', 'c', 'd')), is(equalTo(asList('c', 'd'))));
    }
}
