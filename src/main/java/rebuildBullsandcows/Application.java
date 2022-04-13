package rebuildBullsandcows;

import rebuildBullsandcows.service.Ball;

public class Application {
    public static void main(String[] args) {
        Ball ball = new Ball();
        ball.generateComNum();

        ball.userNumInput();
    }
}
