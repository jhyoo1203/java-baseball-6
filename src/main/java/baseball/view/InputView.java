package baseball.view;

import static baseball.view.OutputView.*;
import static baseball.view.messages.GameMessage.*;
import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputView {

    public static String inputPlayerNumbers() {
        printGameMessage(GAME_INPUT);
        return readLine();
    }

    public static String inputRestartOrExit() {
        printGameMessage(GAME_RESTART);
        return readLine();
    }
}
