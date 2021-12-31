package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.InstanceOfAssertFactories.spliterator;

public class StringTest {

    @DisplayName("split을 사용한 학습 테스트")
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");

        String[] values = "1,2".split(",");
        assertThat(values).contains("1","2");

        String[] str = "1".split(",");
        assertThat(str).containsExactly("1");

    }
    @DisplayName("substring() 메소드를 사용한 학습 테스트")
    @Test
    void No2(){
        String str2 = "(1,2)".substring(1,4);
        assertThat(str2).isEqualTo("1,2");
    }

    @DisplayName("charAt() 메소드를 활용한 학습 테스트")
    @Test
    void No3(){
        String str = "abc";
        int index = 4;
        if(str.length()<= index){
            assertThatExceptionOfType(IndexOutOfBoundsException.class)
                    .isThrownBy(() -> {
                        str.charAt(index);
                    }).withMessageContaining("%d",index);
        }
        else{
            str.charAt(index);
        }

    }
}
