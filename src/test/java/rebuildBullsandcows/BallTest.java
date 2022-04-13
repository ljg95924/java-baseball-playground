package rebuildBullsandcows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BallTest {

    @DisplayName("숫자1_9검증테스트")
    @Test
    public void 숫자1_9검증테스트() {
        Validation validation = new Validation();
        Boolean num = validation.validateNum(9);
        assertThat(num).isEqualTo(true);
    }

    @DisplayName("랜덤숫자 생성테스트")
    @Test
    void 랜덤숫자생성테스트(){
        Ball ball = new Ball();
        ball.generateComNum();
        assertThat(ball.answer.size()).isEqualTo(3);
        assertThat(ball.answer.get(0)).isGreaterThan(0).isLessThan(10);
        assertThat(ball.answer.get(1)).isGreaterThan(0).isLessThan(10);
        assertThat(ball.answer.get(2)).isGreaterThan(0).isLessThan(10);
    }


}
