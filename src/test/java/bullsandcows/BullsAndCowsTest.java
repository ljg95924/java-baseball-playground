package bullsandcows;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class BullsAndCowsTest {

    BullsAndCows BAC = new BullsAndCows();

    @BeforeEach
    void DuplicationSetUp() {
        int [] DuplNums = new int[3];
        DuplNums[0] = 1;
        DuplNums[1] = 1;
        DuplNums[2] = 1;
    }
    @DisplayName("랜덤함수가 제대로 동작하는지 확인 TEST")
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5, 6, 7, 8, 9})
    void CreateRamdomNumberTest(int Num) {
        Assertions.assertTrue(Num > 0 && Num < 10);
    }

    @DisplayName("중복검사 TEST")
    @Test
    void CheckDuplicationTest() {
        assertThat()
    }

}
