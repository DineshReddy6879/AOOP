import java.security.SecureRandom;
import java.util.Arrays;

public class PasswordGenerator {

    private static final String LOWER_CASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPER_CASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBERS = "0123456789";
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()_+~";

    public static String generatePassword(int length, boolean useLowerCase, boolean useUpperCase, boolean useNumbers, boolean useSpecialCharacters) {
        StringBuilder password = new StringBuilder();
        String characterSet = getCharacterSet(useLowerCase, useUpperCase, useNumbers, useSpecialCharacters);

        SecureRandom random = new SecureRandom();
        for (int i = 0; i < length; i++) {
            password.append(characterSet.charAt(random.nextInt(characterSet.length())));
        }

        return password.toString();
    }

    private static String getCharacterSet(boolean useLowerCase, boolean useUpperCase, boolean useNumbers, boolean useSpecialCharacters) {
        StringBuilder characterSet = new StringBuilder();

        if (useLowerCase) {
            characterSet.append(LOWER_CASE);
        }
        if (useUpperCase) {
            characterSet.append(UPPER_CASE);
        }
        if (useNumbers) {
            characterSet.append(NUMBERS);
        }
        if (useSpecialCharacters) {
            characterSet.append(SPECIAL_CHARACTERS);
        }

        return characterSet.toString();
    }
}