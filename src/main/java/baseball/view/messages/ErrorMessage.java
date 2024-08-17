package baseball.view.messages;

public enum ErrorMessage {

    ERR_NUMBER_RANGE("숫자는 1 ~ 9 사이의 범위여야 합니다."),
    ERR_NUMBER_DUPLICATE("숫자는 중복될 수 없습니다."),
    ERR_NUMBER_SIZE("숫자는 3자리 수여야 합니다."),
    ERR_NUMBER_TYPE("입력값은 숫자로만 구성되어야 합니다."),
    ERR_INVALID_RESTART_OPTION("잘못된 입력입니다. 1 또는 2를 입력해야 합니다.");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
