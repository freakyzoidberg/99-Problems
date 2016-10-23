package fun.pierre.lists;

import java.util.List;

public class P02 {
    public static<T> List<T> lastAndPenultimate(List<T> _list) {
        int size = _list.size();
        if (size <= 1) {
            throw new IllegalArgumentException("List has less than two elements");
        }

        return _list.subList(size - 2, size);
    }
}
