package classwork.task;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class HiddenData implements Iterable<String> {
    private final List<String> months = Arrays.asList(
            "Jan","Feb","Mar","Apr","May");

    @Override
    public Iterator<String> iterator() {

        Iterator<String> iterator = new Iterator<String>() {

            int index = 0;

            @Override
            public boolean hasNext() {
                return index < months.size();
            }

            @Override
            public String next() {
                return months.get(index++);
            }
        };

        return iterator;
    }

}
