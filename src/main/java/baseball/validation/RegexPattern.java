package baseball.validation;

public enum RegexPattern {

    NUMBER_RANGE("[1-9]+"),
    VALID_NUMBER("^[0-9]*$");

    private final String value;

    RegexPattern(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
