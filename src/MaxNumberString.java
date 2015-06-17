import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaxNumberString {
    public String generate(Integer... numbers) {
        return String.join("", toList(numbers).
                map(this::toString).
                sorted(Collections.reverseOrder()).
                collect(Collectors.toList()));
    }

    private Stream<Integer> toList(Integer[] numbers) {
        return Arrays.asList(numbers).stream();
    }

    private String toString(Integer number) {
        return String.valueOf(number);
    }
}
