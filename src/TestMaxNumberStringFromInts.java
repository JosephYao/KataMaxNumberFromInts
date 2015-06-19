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

    @Test
    public void any_of_same_digits_ints_in_descending_order_will_concat_them_all_together() {
        assertThat(maxNumberStringOf(30, 20, 10), equalTo("302010"));
    }
    
    @Test
    public void ints_with_all_different_digits_will_concat_them_by_number_string_reverse_order() {
        assertThat(maxNumberStringOf(10, 2), equalTo("210"));
        assertThat(maxNumberStringOf(50, 2, 1, 9), equalTo("95021"));
    }

    @Test
    public void if_number_string_x_start_with_y_then_max_number_string_is_yx() {
        assertThat(maxNumberStringOf(5, 50), equalTo("550"));
        assertThat(maxNumberStringOf(50, 5), equalTo("550"));
    }

    @Test
    public void even_x_start_with_y_but_x_still_need_to_be_put_before_y() {
        assertThat(maxNumberStringOf(5, 56), equalTo("565"));
    }

    @Test
    public void acceptance_test() {
        assertThat(maxNumberStringOf(5, 50, 56), equalTo("56550"));
        assertThat(maxNumberStringOf(420, 42, 423), equalTo("42423420"));
    }

    private String maxNumberStringOf(Integer... numbers) {
        return new MaxNumberString().generate(numbers);
    }
}
