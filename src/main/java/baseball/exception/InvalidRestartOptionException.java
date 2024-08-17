package baseball.exception;

public class InvalidRestartOptionException extends IllegalArgumentException {
    public InvalidRestartOptionException(String message) {
        super(message);
    }
}