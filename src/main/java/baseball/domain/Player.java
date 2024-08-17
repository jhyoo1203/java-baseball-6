package baseball.domain;

import java.util.List;

import static baseball.validation.NumberValidator.*;
import static baseball.view.InputView.inputPlayerNumbers;

public class Player {

    private final List<Integer> numbers;

    public Player(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public static String inputNumbers() {
        String playerNumbers = inputPlayerNumbers();

        validateNumberSize(playerNumbers);
        validateNumberDuplicate(playerNumbers);
        validateNumberRange(playerNumbers);
        validateNumberType(playerNumbers);

        return playerNumbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
