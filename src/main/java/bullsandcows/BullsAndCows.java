package bullsandcows;

import java.util.Arrays;
import java.util.Scanner;

public class BullsAndCows {


    public int[] CreateRamdomNumber(int[] Num) {
        for (int i = 0; i < 3; i++) {
            Num[i] = (int) (Math.random() * 9) + 1;
        }
        return Num;
    }

    public int[] CheckDuplication(int[] Num) {
        if (Num[0] == Num[1]) {
            Num[1] = ResetNumber(Num[0], Num[1]);
        }
        if (Num[0] == Num[2]) {
            Num[2] = ResetNumber(Num[0], Num[2]);
        }
        if (Num[1] == Num[2]) {
            Num[2] = ResetNumber(Num[0], Num[1], Num[2]);
        }
        return Num;
    }

    public int ResetNumber(int A, int B) {
        do {
            B = (int) (Math.random() * 9) + 1;
        } while (A == B);
        return B;
    }

    public int ResetNumber(int A, int B, int C) {
        do {
            C = (int) (Math.random() * 9) + 1;
        } while (C == A || C == B);
        return C;
    }

    public int[] ChangeArray(int InputNum) {
        int[] Array = new int[3];
        int i = 2;
        while (InputNum > 0) {
            Array[i] = InputNum % 10;
            InputNum /= 10;
            i--;
        }
        return Array;
    }

    public void CheckResult(int[] Answer, int[] InputArray) {
        Boolean Flag = true;
        Flag = AnswerCheck(Answer, InputArray);
        ResultView RV = new ResultView();
        while (Flag) {
            int Strike = StrikeCount(Answer, InputArray);
            int Ball = BallCount(Answer, InputArray);
            RV.OutputStrikeBall(Strike, Ball);
            InputArray = ReInput();
            Flag = AnswerCheck(Answer, InputArray);
        }
        RV.OutputAnswer();
    }

    public boolean AnswerCheck(int[] Answer, int[] InputArray) {
        if (Arrays.equals(Answer, InputArray)) {
            return false;
        }
        return true;
    }

    public int StrikeCount(int[] Answer, int[] InputArray) {
        int Strike = 0;
        if (Answer[0] == InputArray[0]) {
            Strike += 1;
        }
        if (Answer[1] == InputArray[1]) {
            Strike += 1;
        }
        if (Answer[2] == InputArray[2]) {
            Strike += 1;
        }
        return Strike;
    }

    public int BallCount(int[] Answer, int[] InputArray) {
        int Ball = 0;
        if (Answer[0] == InputArray[1] || Answer[0] == InputArray[2]) {
            Ball += 1;
        }
        if (Answer[1] == InputArray[0] || Answer[1] == InputArray[2]) {
            Ball += 1;
        }
        if (Answer[2] == InputArray[0] || Answer[2] == InputArray[1]) {
            Ball += 1;
        }
        return Ball;
    }

    public int[] ReInput() {

        Scanner scanner = new Scanner(System.in);
        int InputNum = scanner.nextInt();

        return ChangeArray(InputNum);
    }


    public void EndingGame(int gameMode) {
        if (gameMode == 2) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        while (true) {
            BullsAndCows BAC = new BullsAndCows();
            InputView IV = new InputView();
            ResultView RV = new ResultView();
            IV.InputVeiw();

            int[] Answer = new int[3];
            int[] InputArray;

            Answer = BAC.CreateRamdomNumber(Answer);
            Answer = BAC.CheckDuplication(Answer);
            System.out.println("Answer:" + Answer[0] + "," + Answer[1] + "," + Answer[2]);
            Scanner scanner = new Scanner(System.in);
            int InputNum = scanner.nextInt();

            InputArray = BAC.ChangeArray(InputNum);

            BAC.CheckResult(Answer, InputArray);

            RV.ResultView();
            int GameMode = scanner.nextInt();
            BAC.EndingGame(GameMode);
        }
    }
}
