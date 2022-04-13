package rebuildBullsandcows;

import java.util.Objects;

public class BallInfo {
    private static final int MAX_NUMBER = 9;
    private static final int MIN_NUMBER = 1;
    private int position;
    private int number;

    private BallInfo(int position, int number) {
        this.position = position;
        this.number = number;
    }

    public static BallInfo of(int position, int number) {
        if(number>=MIN_NUMBER || number<=MAX_NUMBER){
            return new BallInfo(position, number);
        }
        throw new RuntimeException("숫자는 1~9 사이로 입력");
    }

    public BallStatus CheckAnswer(BallInfo ballInfo){
        if(this.equals(ballInfo)) return BallStatus.STRIKE;
        if(this.number==ballInfo.number) return BallStatus.BALL;
        return BallStatus.NOTHING;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BallInfo ballInfo = (BallInfo) o;
        return position == ballInfo.position && number == ballInfo.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, number);
    }
}
