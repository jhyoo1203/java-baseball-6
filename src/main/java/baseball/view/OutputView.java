package baseball.view;

import baseball.view.messages.GameMessage;
import baseball.view.messages.ResultMessage;

public class OutputView {

    public static void printGameMessage(GameMessage message) {
        System.out.print(message.getMessage());
    }

    public static void printResultMessage(ResultMessage result) {
        System.out.println(result.getResult());
    }
}
