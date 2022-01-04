package bullsandcows;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.*;

import java.sql.Array;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.not;
import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;

public class BullsAndCowsTest {
    int[] DuplNums = new int[3];
    int[] ArrayNumber = new int[3];
    BullsAndCows BAC = new BullsAndCows();

    @BeforeEach
    void DuplicationSetUp() {
        DuplNums[0] = 1;
        DuplNums[1] = 1;
        DuplNums[2] = 1;
    }

    @BeforeEach
    void ArrayNumberSetUp() {
        ArrayNumber[0] = 1;
        ArrayNumber[1] = 2;
        ArrayNumber[2] = 3;
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
        int[] DuplArray = new int[3];
        DuplArray[0] = 1;
        DuplArray[1] = 1;
        DuplArray[2] = 1;
        assertThat(BAC.CheckDuplication(DuplNums)).isNotEqualTo(DuplArray);
    }

    @DisplayName("중복숫자 리셋함수 TEST")
    @ParameterizedTest
    @CsvSource(value = {"1,1", "2,2", "3,3", "4,4", "5,5", "6,6", "7,7", "8,8", "9,9"})
    void ResetNumberTest(int A, int B) {
        assertThat(BAC.ResetNumber(A, B)).isNotEqualTo(B);
    }

    @DisplayName("중복숫자 리셋함수 TEST")
    @ParameterizedTest
    @CsvSource(value = {"1,1,1", "2,2,2", "3,3,3", "4,4,4", "5,5,5", "6,6,6", "7,7,7", "8,8,8", "9,9,9"})
    void ResetNumberTest(int A, int B, int C) {
        assertThat(BAC.ResetNumber(A, B, C)).isNotEqualTo(C);
    }

    @DisplayName("입력받은 Int형 값을 배열로 변환 TEST")
    @ParameterizedTest
    @CsvSource(value = {"123,1,2,3", "122,1,2,2", "576,5,7,6", "999,9,9,9", "878,8,7,8", "556,5,5,6"})
    void ChangeArrayTest(int A, int B, int C, int D) {
        int[] Array = new int[3];
        Array[0] = B;
        Array[1] = C;
        Array[2] = D;
        assertThat(BAC.ChangeArray(A)).isEqualTo(Array);
    }

    @DisplayName("Strike 카운트가 잘되는지 TEST")
    @ParameterizedTest
    @CsvSource(value = {"1,2,3,3", "5,2,7,1", "1,6,3,2", "4,5,6,0", "2,1,3,1"})
    void StrikeCountTest(int A, int B ,int C,int D){
        int[] TestNum = new int [3];
        TestNum[0] =A;
        TestNum[1] =B;
        TestNum[2] =C;
        assertThat(BAC.StrikeCount(ArrayNumber,TestNum)).isEqualTo(D);
    }

    @DisplayName("Ball 카운트가 잘되는지 TEST")
    @ParameterizedTest
    @CsvSource(value = {"5,2,3,0", "5,1,2,2", "3,1,2,3", "4,5,6,0", "2,1,3,2"})
    void BallCount(int A, int B ,int C,int D){
        int[] TestNum = new int [3];
        TestNum[0] =A;
        TestNum[1] =B;
        TestNum[2] =C;
        assertThat(BAC.BallCount(ArrayNumber,TestNum)).isEqualTo(D);
    }


}
