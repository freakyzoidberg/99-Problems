package fun.pierre.lists;

import java.util.List;

public class P03 {
    public static<T> T kThElement(List<T> _list, int _k) {
        int size = _list.size();
        if (size <= _k) {
            throw new IllegalArgumentException(String.format("List has less than %d elements", _k));
        }

        return _list.get(_k - 1);
    }
}
