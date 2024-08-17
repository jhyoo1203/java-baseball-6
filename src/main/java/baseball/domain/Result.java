package baseball.domain;

import java.util.List;
import java.util.stream.IntStream;

import static baseball.view.messages.ResultMessage.*;

public class Result {

    private static final int BALL_COUNT = 3;

    private final int strikes;
    private final int balls;

    public Result(int strikes, int balls) {
        this.strikes = strikes;
        this.balls = balls;
    }

    public static Result calculateResult(List<Integer> computerNumbers, List<Integer> playerNumbers) {
        int strikes = calculateStrikes(computerNumbers, playerNumbers);
        int balls = calculateBalls(computerNumbers, playerNumbers);

        return new Result(strikes, balls);
    }

    private static int calculateStrikes(List<Integer> computerNumbers, List<Integer> playerNumbers) {
        return (int) IntStream.range(0, BALL_COUNT)
                .filter(i -> isStrike(computerNumbers, playerNumbers, i))
                .count();
    }

    private static int calculateBalls(List<Integer> computerNumbers, List<Integer> playerNumbers) {
        return (int) IntStream.range(0, BALL_COUNT)
                .filter(i -> isBall(computerNumbers, playerNumbers, i))
                .count();
    }

    private static boolean isStrike(List<Integer> computerNumbers, List<Integer> playerNumbers, int index) {
        return computerNumbers.get(index).equals(playerNumbers.get(index));
    }

    private static boolean isBall(List<Integer> computerNumbers, List<Integer> playerNumbers, int index) {
        return !computerNumbers.get(index).equals(playerNumbers.get(index))
                && computerNumbers.contains(playerNumbers.get(index));
    }

    public int getStrikes() {
        return strikes;
    }

    public String toResultMessage() {
        if (strikes == 0 && balls == 0) {
            return NOTHING.getResult();
        }
        return formatResultMessage();
    }

    private String formatResultMessage() {
        StringBuilder result = new StringBuilder();
        if (balls > 0) {
            result.append(String.format(ONLY_BALL.getResult(), balls));
        }
        if (strikes > 0) {
            if (balls > 0) {
                result.append(" ");
            }
            result.append(String.format(ONLY_STRIKE.getResult(), strikes));
        }
        return result.toString();
    }
}
