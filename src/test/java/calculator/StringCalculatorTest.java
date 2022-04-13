package calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class StringCalculatorTest {

    StringCalculator SC = new StringCalculator();

    @DisplayName("알맞은 값이 배열에 들어가는지 TEST")
    @ParameterizedTest
    @CsvSource(value = {"3,2", "5,3", "7,4", "9,5"})
    public void testInputNumbers(int input, int expected) {
        assertThat(SC.InputNumbers(input).length).isEqualTo(expected);
    }

    @DisplayName("연산이 제대로 이루어지는지 TEST")
    @ParameterizedTest
    @CsvSource(value = {"+,3,5,8", "-,5,2,-3", "*,2,6,12", "/,5,10,2"})
    public void testcalculate(String Operator,int A, int B, int result){
        assertThat(SC.calculate(Operator,A,B)).isEqualTo(result);
    }
}
