package baseball.validation;

import baseball.exception.NumberDuplicateException;
import baseball.exception.NumberRangeException;
import baseball.exception.NumberSizeException;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static baseball.validation.RegexPattern.*;
import static baseball.view.ErrorMessage.*;

public class NumberValidator {

    public NumberValidator() {
    }

    public static void validateNumberSize(String number) {
        if (!isValidSize(number)) {
            throw new NumberSizeException(ERR_NUMBER_SIZE.getMessage());
        }
    }

    public static void validateNumberRange(String number) {
        if (!isWithinRange(number)) {
            throw new NumberRangeException(ERR_NUMBER_RANGE.getMessage());
        }
    }

    public static void validateNumberDuplicate(String number) {
        if (hasDuplicatedNumber(number)) {
            throw new NumberDuplicateException(ERR_NUMBER_DUPLICATE.getMessage());
        }
    }

    public static boolean isValidSize(String number) {
        return number.length() == 3;
    }

    public static boolean isWithinRange(String number) {
        Pattern pattern = Pattern.compile(NUMBER_RANGE.getValue());
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();
    }

    public static boolean hasDuplicatedNumber(String number) {
        Set<Character> set = new HashSet<>();

        for (Character c : number.toCharArray()) {
            if (!set.add(c)) {
                return true;
            }
        }
        return false;
    }
}