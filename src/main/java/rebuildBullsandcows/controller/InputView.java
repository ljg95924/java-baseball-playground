package rebuildBullsandcows.controller;

public class InputView {
    public static void initView() {
        System.out.print("숫자를 입력해 주세요 : ");
    }
    public static void printStrikeBall(int Strike, int Ball) {
        if (Ball > 0) System.out.print(Ball + "볼 ");
        if (Strike > 0) System.out.println(Strike + "스트라이크");

    }
}
