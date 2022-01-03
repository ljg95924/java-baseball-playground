package bullsandcows;

public class ResultView {
    public void OutputStrikeBall(int strike, int ball) {
        if (ball == 0 && strike == 0) {
            System.out.println("낫싱");
            return;
        }
        if (ball == 0) {
            System.out.println(strike + "스트라이크");
            return;
        }
        if (strike == 0) {
            System.out.println(ball + "볼");
            return;
        }
        if (ball == 1 || ball == 2) {
            System.out.println(ball + "볼 " + strike + "스트라이크");
            return;
        }
    }
    public void ResultView() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임종료 \n 게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

    }
    public void OutputAnswer(){
        System.out.println("3스트라이크");
    }
}
