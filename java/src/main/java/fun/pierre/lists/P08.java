package fun.pierre.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class P08 {

    public static<T> List<T> consecutiveDedup(List<T> _list) {
        List<T> deduped = new ArrayList<T>();
        T prev = null;
        for (T o : _list) {
            if (!Objects.equals(o, prev)) {
                deduped.add(o);
                prev = o;
            }
        }
        return deduped;
    }
}
