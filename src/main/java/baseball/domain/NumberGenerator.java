package baseball.domain;

import java.util.Arrays;
import java.util.List;

import static baseball.domain.Computer.generateRandomNumbers;
import static baseball.domain.Player.inputNumbers;

public class NumberGenerator {

    public static Computer createWithRandomNumbers() {
        List<Integer> randomNumbers = generateRandomNumbers();
        return new Computer(randomNumbers);
    }

    public static Player createPlayerNumbers() {
        String playerNumbers = inputNumbers();

        List<Integer> convertedNumber = Arrays.stream(playerNumbers.split(""))
                .map(Integer::parseInt)
                .toList();

        return new Player(convertedNumber);
    }
}
