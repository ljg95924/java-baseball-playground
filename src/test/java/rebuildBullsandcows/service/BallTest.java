package rebuildBullsandcows.service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import rebuildBullsandcows.Validation;
import rebuildBullsandcows.domain.BallInfo;
import rebuildBullsandcows.service.Ball;

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
    void 랜덤숫자생성테스트() {
        ball.generateComNum();
        assertThat(ball.comNum.size()).isEqualTo(3);
        assertThat(ball.comNum.get(0)).isGreaterThan(0).isLessThan(10);
        assertThat(ball.comNum.get(1)).isGreaterThan(0).isLessThan(10);
        assertThat(ball.comNum.get(2)).isGreaterThan(0).isLessThan(10);
    }

    @DisplayName("랜덤숫자정보가 BallInfo에 제대로 들어가는지 테스트")
    @Test
    void 랜덤숫자정보가BallInfo에제대로들어가는지테스트() {
        ball.comNum = Arrays.asList(1, 2, 3);
        ball.ballInfoSave();
        assertThat(ball.answer.size()).isEqualTo(3);
        assertThat(ball.answer.get(0).getNumber()).isEqualTo(ball.comNum.get(0));
        assertThat(ball.answer.get(1).getNumber()).isEqualTo(ball.comNum.get(1));
        assertThat(ball.answer.get(2).getNumber()).isEqualTo(ball.comNum.get(2));

    }


    @DisplayName("낫씽 테스트")
    @Test
    void 낫씽테스트() {
        ball.comNum = Arrays.asList(1, 2, 3);
        ball.ballInfoSave();

        List<BallInfo> userInput = new ArrayList<>();



    }

}
