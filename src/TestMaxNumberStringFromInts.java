import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestMaxNumberStringFromInts {

    @Test
    public void no_int_will_get_empty_string() {
        MaxNumberString generator = new MaxNumberString();
        String actual = generator.generate();
        assertThat(actual, equalTo(""));
    }
}
