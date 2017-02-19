package fun.pierre.lists;

import java.util.List;

public class P06 {

  public static<T> boolean isPalindrome(List<T> _list) {
    int size = _list.size();
    if (size <= 1) {
      return true;
    }
    return (_list.get(0) == _list.get(size - 1)) && isPalindrome(_list.subList(1, size - 1));
  }
}
