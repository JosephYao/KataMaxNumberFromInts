import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestMaxNumberStringFromInts {

    @Test
    public void no_int_will_get_empty_string() {
        assertThat(maxNumberStringOf(), equalTo(""));
    }

    @Test
    public void one_int_will_get_itself_as_max_number() {
        assertThat(maxNumberStringOf(1), equalTo("1"));
    }

    private String maxNumberStringOf(int... numbers) {
        return new MaxNumberString().generate(numbers);
    }
}
