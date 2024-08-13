package baseball.domain;

import java.util.ArrayList;
import java.util.List;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class Computer {

    private final List<Integer> numbers;

    public Computer(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public static List<Integer> generateRandomNumbers() {
        List<Integer> randomNumbers = new ArrayList<>();

        while (randomNumbers.size() < 3) {
            int number = pickNumberInRange(1, 9);
            if (!hasDuplicatedNumber(randomNumbers, number)) {
                randomNumbers.add(number);
            }

        }

        return randomNumbers;
    }

    private static boolean hasDuplicatedNumber(List<Integer> randomNumbers, int number) {
        return randomNumbers.contains(number);
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
