package baseball.view;

import baseball.view.messages.GameMessage;

public class OutputView {

    public static void printGameMessage(GameMessage message) {
        System.out.print(message.getMessage());
    }

    public static void printResultMessage(String resultMessage) {
        System.out.println(resultMessage);
    }
}