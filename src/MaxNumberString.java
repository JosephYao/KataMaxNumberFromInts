import java.util.Arrays;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MaxNumberString {
    public String generate(Integer... numbers) {
        return String.join("", asList(numbers).
                map(this::toString).
                sorted((o1, o2) -> intOf(o2, o1).compareTo(intOf(o1, o2))).
                collect(toList()));
    }

    private Integer intOf(String o1, String o2) {
        return Integer.parseInt(o1+o2);
    }

    private Stream<Integer> asList(Integer[] numbers) {
        return Arrays.asList(numbers).stream();
    }

    private String toString(Integer number) {
        return String.valueOf(number);
    }
}
