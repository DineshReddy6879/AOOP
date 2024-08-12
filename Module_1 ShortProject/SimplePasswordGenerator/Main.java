public class Main {
    public static void main(String[] args) {
        String password1 = PasswordGenerator.generatePassword(10, true, true, true, true);
        String password2 = PasswordGenerator.generatePassword(12, true, false, true, false);
        String password3 = PasswordGenerator.generatePassword(15, false, true, false, true);

        System.out.println("Password 1: " + password1);
        System.out.println("Password 2: " + password2);
        System.out.println("Password 3: " + password3);
    }
}