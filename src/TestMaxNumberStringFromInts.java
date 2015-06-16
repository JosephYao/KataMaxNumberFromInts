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
        assertThat(maxNumberStringOf(10), equalTo("10"));
    }
    
    @Test
    public void two_of_same_digits_ints_in_descending_order_will_just_concat_them_together() {
        assertThat(maxNumberStringOf(2, 1), equalTo("21"));
        assertThat(maxNumberStringOf(20, 10), equalTo("2010"));
    }

    private String maxNumberStringOf(int... numbers) {
        return new MaxNumberString().generate(numbers);
    }
}
