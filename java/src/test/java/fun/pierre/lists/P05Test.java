package fun.pierre.lists;

import org.junit.Test;
import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class P05Test {
    @Test
    public void shouldFindReverseElementOfIntList() {
        assertThat(P05.reverseElement(asList(1, 2, 3, 4, 5)), is(equalTo(asList(5, 4, 3, 2, 1))));
    }

    @Test
    public void shouldFindReverseElementOfCharList() {
        assertThat(P05.reverseElement(asList('a', 'b', 'c', 'd')), is(equalTo(asList('d', 'c', 'b', 'a'))));
    }
}
