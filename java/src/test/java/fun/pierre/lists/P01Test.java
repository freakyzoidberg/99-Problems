package fun.pierre.lists;

import org.junit.Test;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class P01Test {

    @Test
    public void shouldFindLastOfIntList() throws Exception {
        assertThat(P01.last(asList(1, 2, 3, 4, 5)), is(equalTo(5)));
    }

    @Test
    public void shouldFindLastOfCharList() throws Exception {
        assertThat(P01.last(asList('a', 'b', 'c', 'd')), is(equalTo('d')));
    }

    @Test
    public void shouldFindLastOfStringList() throws Exception {
        assertThat(P01.last(asList("a", "b", "c", "d")), is(equalTo("d")));
    }
}