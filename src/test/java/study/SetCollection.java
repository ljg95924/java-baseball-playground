package study;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


import org.assertj.core.internal.Strings;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;


import java.util.Set;
import java.util.HashSet;

public class SetCollection {
    private Set<Integer> numbers;


    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

    }

    @DisplayName("ParameterizedTest을 활용한 중복코드 제거 테스트")
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void Parameterized(int list) {
        assertThat(numbers.contains(list)).isTrue();
    }

    @DisplayName("입력 값에 따라 결과 값이 다른 경우에 대한 테스트")
    @ParameterizedTest
    @CsvSource(value = {"1:True", "2:True", "3:True", "4:False", "5:False"}, delimiter = ':')
    void ShouldGenerateTheExpectedValue(int input, Boolean expected) {
        assertThat(numbers.contains(input)).isEqualTo(expected);
    }
}
