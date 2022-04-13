package rebuildBullsandcows;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ball {
    List<Integer> comNum = new ArrayList<>();
    List<BallInfo> answer = new ArrayList<>();

    public final void generateComNum() {
        for (int i = 1; i < 10; i++) {
            comNum.add(i);
        }
        Collections.shuffle(comNum);
        comNum.subList(3, 9).clear();
    }

    public final void ballInfoSave() {
        for (int i = 0; i < comNum.size(); i++) {
            answer.add(BallInfo.of(i, comNum.get(i)));
        }
    }


}
