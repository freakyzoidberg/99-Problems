package fun.pierre.lists;

import java.util.Collections;
import java.util.List;

public class P05 {
    public static<T> List<T> reverseElement(List<T> _list) {
        List<T> shallowCopy = _list.subList(0, _list.size());
        Collections.reverse(shallowCopy);
        return shallowCopy;
    }
}
