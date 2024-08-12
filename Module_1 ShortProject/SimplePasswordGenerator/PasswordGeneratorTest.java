import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordGeneratorTest {

    @Test
    void testGeneratePasswordWithDifferentLengths() {
        String password1 = PasswordGenerator.generatePassword(5, true, true, true, true);
        String password2 = PasswordGenerator.generatePassword(10, true, true, true, true);
        String password3 = PasswordGenerator.generatePassword(15, true, true, true, true);

        assertEquals(5, password1.length());
        assertEquals(10, password2.length());
        assertEquals(15, password3.length());
    }

    @Test
    void testGeneratePasswordWithDifferentCharacterSets() {
        String password1 = PasswordGenerator.generatePassword(10, true, false, false, false);
        String password2 = PasswordGenerator.generatePassword(10, false, true, false, false);
        String password3 = PasswordGenerator.generatePassword(10, false, false, true, false);
        String password4 = PasswordGenerator.generatePassword(10, false, false, false, true);

        assertTrue(password1.matches("[a-z]+"));
        assertTrue(password2.matches("[A-Z]+"));
        assertTrue(password3.matches("[0-9]+"));
        assertTrue(password4.matches("[!@#$%^&*()_+~]+"));
    }
}