package rebuildBullsandcows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
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

    Ball ball = new Ball();

    @DisplayName("랜덤숫자 생성테스트")
    @Test
    void 랜덤숫자생성테스트(){
        ball.generateComNum();
        assertThat(ball.comNum.size()).isEqualTo(3);
        assertThat(ball.comNum.get(0)).isGreaterThan(0).isLessThan(10);
        assertThat(ball.comNum.get(1)).isGreaterThan(0).isLessThan(10);
        assertThat(ball.comNum.get(2)).isGreaterThan(0).isLessThan(10);
    }
    @Test
    void 랜덤숫자정보가BallInfo에잘들어가는지테스트(){
        ball.generateComNum();
        ball.ballInfoSave();
        assertThat(ball.answer.size()).isEqualTo(3);

    }

}
