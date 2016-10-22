package fun.pierre.lists;

import java.util.List;

public class P01 {
    /**
     * Return last element of a list
     * @param _list non-empty list
     * @param <T> type of element in list
     * @return last element in list
     */
    public static<T> T last(List<T> _list) {
        int size = _list.size();
        if (size == 0) {
            throw new IllegalArgumentException("Empty List");
        }
        return _list.get(size - 1);
    }
}
