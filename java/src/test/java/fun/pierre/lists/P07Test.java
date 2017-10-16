package fun.pierre.lists;

import org.junit.Test;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class P07Test {
    @Test
    public void shoulTestNestedIntList() {
        assertThat(P07.flatten(asList(1, 2, 3, 2, 1)), is(asList(1, 2, 3, 2, 1)));
        assertThat(P07.flatten(asList(
                asList(1, 2),
                asList(3, 2, 1)
        )), is(asList(1, 2, 3, 2, 1)));
    }

    @Test
    public void shoulTestNestedCharList() {
        assertThat(P07.flatten(asList('a', 'b', 'b', 'a')), is(asList('a', 'b', 'b', 'a')));
        assertThat(P07.flatten(asList(
                asList('a', 'b'),
                asList('b', 'a')
        )), is(asList('a', 'b', 'b', 'a')));
    }

    @Test
    public void shoulTestNestedIntListStream() {
        assertThat(P07.flatten_stream(asList(1, 2, 3, 2, 1)), is(asList(1, 2, 3, 2, 1)));
        assertThat(P07.flatten_stream(asList(
                asList(1, 2),
                asList(3, 2, 1)
        )), is(asList(1, 2, 3, 2, 1)));
    }

    @Test
    public void shoulTestNestedCharListStream() {
        assertThat(P07.flatten_stream(asList('a', 'b', 'b', 'a')), is(asList('a', 'b', 'b', 'a')));
        assertThat(P07.flatten_stream(asList(
                asList('a', 'b'),
                asList('b', 'a')
        )), is(asList('a', 'b', 'b', 'a')));
    }

}
