import java.util.ArrayList;
import java.util.List;

public class MaxNumberString {
    public String generate(int... numbers) {
        List<String> numberStrings = new ArrayList<String>();

        for (int number : numbers)
            numberStrings.add(String.valueOf(number));

        return String.join("", numberStrings);
    }
}
