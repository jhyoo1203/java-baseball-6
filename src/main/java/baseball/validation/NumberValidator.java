package baseball.validation;

import baseball.exception.NumberDuplicateException;
import baseball.exception.NumberRangeException;
import baseball.exception.NumberSizeException;
import baseball.view.ErrorMessage;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberValidator {

    public NumberValidator() {
    }

    public static void validateNumberSize(String number) {
        if (number.length() != 3) {
            throw new NumberSizeException(ErrorMessage.NUMBER_SIZE.getMessage());
        }
    }

    public static void validateNumberRange(String number) {
        Pattern pattern = Pattern.compile(RegexPattern.NUMBER_RANGE.getValue());
        Matcher matcher = pattern.matcher(number);

        if (!matcher.matches()) {
            throw new NumberRangeException(ErrorMessage.NUMBER_RANGE.getMessage());
        }
    }

    public static void validateNumberDuplicate(String number) {
        Set<Character> set = new HashSet<>();

        for (Character c : number.toCharArray()) {
            if (!set.add(c)) {
                throw new NumberDuplicateException(ErrorMessage.NUMBER_DUPLICATE.getMessage());
            }
        }
    }
}
