package baseball.domain;

import java.util.List;

import static baseball.validation.NumberValidator.*;
import static camp.nextstep.edu.missionutils.Console.readLine;

public class Player {

    private final List<Integer> numbers;

    public Player(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public static String inputNumbers() {
        String playerNumbers = readLine();

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
