package rebuildBullsandcows;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ball {
    List<Integer> answer = new ArrayList<>();

    public void generateComNum() {
        for (int i = 1; i < 10; i++) {
            answer.add(i);
        }
        Collections.shuffle(answer);
        for (int i = 3; i < 9; i++) {
            answer.remove(3);
        }
    }

    public int countingAnswer(List inputList) {

        return 0;
    }
}
