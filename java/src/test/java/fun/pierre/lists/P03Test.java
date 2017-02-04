package fun.pierre.lists;

import org.junit.Test;
import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class P03Test {
    @Test
    public void shouldFindkThElementOfIntList() {
        assertThat(P03.kThElement(asList(1, 2, 3, 4, 5), 3), is(equalTo(3)));
    }

    @Test
    public void shouldFindkThElementOfCharList() {
        assertThat(P03.kThElement(asList('a', 'b', 'c', 'd'), 3), is(equalTo('c')));
    }
}
