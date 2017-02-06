package fun.pierre.lists;

import org.junit.Test;
import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class P04Test {
    @Test
    public void shouldFindNumberElementOfIntList() {
        assertThat(P04.numbeElements(asList(1, 2, 3, 4, 5)), is(equalTo(5)));
    }

    @Test
    public void shouldFindNunberThElementOfCharList() {
        assertThat(P04.numbeElements(asList('a', 'b', 'c', 'd')), is(equalTo(4)));
    }
}
