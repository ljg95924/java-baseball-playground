package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.InstanceOfAssertFactories.spliterator;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");

        String[] values = "1,2".split(",");
        assertThat(values).contains("1","2");

        String[] str = "1".split(",");
        assertThat(str).containsExactly("1");

        String str2 = "(1,2)".substring(1,4);
        assertThat(str2).isEqualTo("1,2");


    }


}
