package calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class StringCalculaotorTest {

    @DisplayName("숫자")
    @ParameterizedTest
    @CsvSource(value = {"3,2", "5,3", "7,4"});

    public void testInputNumbers() {

    }

}
