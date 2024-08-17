package baseball.view.messages;

public enum ResultMessage {

    ONLY_BALL("%d볼"),
    ONLY_STRIKE("%d스트라이크"),
    BALL_STRIKE("%d볼 %d스트라이크"),
    NOTHING("낫싱");

    private final String result;

    ResultMessage(String result) {
        this.result = result;
    }

    public String getResult() {
        return result;
    }
}
