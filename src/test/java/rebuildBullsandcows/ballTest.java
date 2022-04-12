package rebuildBullsandcows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ballTest {

    @DisplayName("숫자1_9검증테스트")
    @Test
    public void 숫자1_9검증테스트() {
        Validation validation = new Validation();
        Boolean num = validation.validateNum(9);
        assertThat(num).isEqualTo(true);
    }

}
