import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaxNumberString {
    public String generate(Integer... numbers) {
        return String.join("", toList(numbers).
                map(this::toString).
                sorted(comparator()).
                collect(Collectors.toList()));
    }

    private Comparator<String> comparator() {
        return new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o2.startsWith(o1))
                    return -1;

                if (o1.startsWith(o2))
                    return 1;

                return Collections.reverseOrder().compare(o1, o2);
            }
        };
    }

    private Stream<Integer> toList(Integer[] numbers) {
        return Arrays.asList(numbers).stream();
    }

    private String toString(Integer number) {
        return String.valueOf(number);
    }
}
