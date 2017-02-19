package fun.pierre.lists;

import org.junit.Test;
import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class P06Test {
  @Test
  public void shoulTestPalindromIntList() {
    assertThat(P06.isPalindrome(asList(1, 2, 3, 2, 1)), is(true));
    assertThat(P06.isPalindrome(asList(1, 2, 3, 4, 5)), is(false));
  }

  @Test
  public void shoulTestPalindromCharList() {
    assertThat(P06.isPalindrome(asList('a', 'b', 'b', 'a')), is(true));
    assertThat(P06.isPalindrome(asList('a', 'b', 'c', 'd')), is(false));
  }
}
