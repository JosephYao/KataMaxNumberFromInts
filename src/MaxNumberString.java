public class MaxNumberString {
    public String generate(int... numbers) {
        if (numbers.length == 2)
            return String.valueOf(numbers[0]) + String.valueOf(numbers[1]);

        if (numbers.length == 1)
            return String.valueOf(numbers[0]);

        return "";
    }
}
