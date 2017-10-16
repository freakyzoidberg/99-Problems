package fun.pierre.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class P07 {

    public static<T> List<T> flatten(List<?> _list) {
        List<T> flatten = new ArrayList<T>();
        for (Object o : _list) {
            if (o instanceof List) {
                flatten.addAll(flatten((List<?>) o));
            } else {
                flatten.add((T) o);
            }

        }
        return flatten;
    }

    public static<T> List<T> flatten_stream(List<?> _list) {
        return _list
                .stream()
                .flatMap(e -> e instanceof List ? flatten_stream((List<?>) e).stream() : Stream.of(e))
                .map(e -> (T) e)
                .collect(Collectors.toList());

    }
}
