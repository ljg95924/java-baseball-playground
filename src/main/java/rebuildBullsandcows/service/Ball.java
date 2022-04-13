package rebuildBullsandcows.service;

import rebuildBullsandcows.BallStatus;
import rebuildBullsandcows.controller.InputView;
import rebuildBullsandcows.controller.ResultView;
import rebuildBullsandcows.domain.BallInfo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ball {
    List<Integer> comNum = new ArrayList<>();
    List<BallInfo> answer = new ArrayList<>();
    List<BallInfo> inputNum = new ArrayList<>();
    int Strike;
    int Ball;

    public final void generateComNum() {
        for (int i = 1; i < 10; i++) {
            comNum.add(i);
        }
        Collections.shuffle(comNum);
        comNum.subList(3, 9).clear();

        ballInfoSave();
    }

    public final void ballInfoSave() {
        for (int i = 0; i < comNum.size(); i++) {
            answer.add(BallInfo.of(i, comNum.get(i)));
        }
    }

    public final void userNumInput() {
        while (Strike != 3) {
            InputView.initView();
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            String[] ballNumber = input.split("");

            setUpVariable();
            processUserInputNum(ballNumber);

            compareAnswer();
            strikeBallPrint();
        }
        selectGameMode();
    }

    private final void selectGameMode() {
        ResultView.endView();
        Scanner scanner = new Scanner(System.in);
        int gameMode = scanner.nextInt();
        if (gameMode == 1) {
            Ball ball = new Ball();
            ball.generateComNum();
            ball.userNumInput();
        }
    }

    public final void processUserInputNum(String[] ballNumber) {
        for (int i = 0; i < 3; i++) {
            inputNum.add(BallInfo.of(i, Integer.parseInt(ballNumber[i])));
        }

    }

    private final void strikeBallPrint() {
        InputView.printStrikeBall(Strike, Ball);
    }

    private final void setUpVariable() {
        Strike = 0;
        Ball = 0;
        inputNum.clear();
    }

    public final void compareAnswer() {
        for (BallInfo ballInfo : inputNum
        ) {
            comAndUserNum(ballInfo);
        }
    }

    public final void comAndUserNum(BallInfo ballInfo) {
        for (int i = 0; i < 3; i++) {
            BallStatus ballStatus = answer.get(i).CheckAnswer((ballInfo));
            countResult(ballStatus);
        }
    }

    private final void countResult(BallStatus ballStatus) {
        if (ballStatus.equals(BallStatus.STRIKE)) Strike++;
        if (ballStatus.equals(BallStatus.BALL)) Ball++;
    }

}
