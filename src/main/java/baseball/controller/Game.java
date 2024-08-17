package baseball.controller;

import baseball.domain.Computer;
import baseball.domain.Player;
import baseball.domain.Result;

import static baseball.domain.NumberGenerator.*;
import static baseball.domain.Result.*;
import static baseball.view.OutputView.*;
import static baseball.view.InputView.*;
import static baseball.validation.NumberValidator.*;
import static baseball.view.messages.GameMessage.*;

public class Game {

    public void start() {
        printGameMessage(GAME_START);
        do {
            Computer computerNumbers = createComputerNumbers();
            play(computerNumbers);
        } while (isRestart());
    }

    private void play(Computer computerNumbers) {
        while (true) {
            Player playerNumbers = createPlayerNumbers();
            Result result = calculateResult(computerNumbers.getNumbers(), playerNumbers.getNumbers());

            printResultMessage(result.toResultMessage());

            if (result.getStrikes() == 3) {
                printGameMessage(GAME_RESTART);
                break;
            }
        }
    }

    private boolean isRestart() {
        String input = inputRestartOrExit();
        validateRestartOption(input);
        return input.equals("1");
    }
}