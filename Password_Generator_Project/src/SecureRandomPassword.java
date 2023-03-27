import java.util.Random;

public class SecureRandomPassword {
    private char[] capital_letters = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
            'Q', 'R',
            'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
    private char[] small_letters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
            'q', 'r',
            's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
    private char[] digits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
    private char[] symbols = { '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '_', '-', '+', '=', '/', '<', '>', '?',
            '[',
            ']', '{', '}', ' ' };
    private int length = 0;
    private String password = "";

    SecureRandomPassword() {
        Random random = new Random();
        // get a random length between 8 to 16 both inclusive
        int len = random.nextInt(8, 17);
        length = len;
        createSecurePassword();

    }

    void createSecurePassword() {
        // To make the password more scure we will make sure that the characters
        // category are chosen uniformly and the characters do not repeat
        // There is an equal probility of a character being a capital letter, small
        // letter, digits and symbols
        Random random = new Random();
        int i = 1;
        while (i <= length) {
            int charSelectionIndex = random.nextInt(4);
            if (charSelectionIndex == 0) {
                // We will fetch a capital letter
                int charIdx = random.nextInt(capital_letters.length);
                char ch = capital_letters[charIdx];
                // check if the character exists
                while (password.indexOf(ch) != -1) {
                    charIdx = random.nextInt(capital_letters.length);
                    ch = capital_letters[charIdx];
                }
                password = password + ch;
            }

            else if (charSelectionIndex == 1) {
                // We will fetch a small letter
                int charIdx = random.nextInt(small_letters.length);
                char ch = small_letters[charIdx];
                // check if the character exists
                while (password.indexOf(ch) != -1) {
                    charIdx = random.nextInt(small_letters.length);
                    ch = small_letters[charIdx];
                }
                password = password + ch;
            }

            else if (charSelectionIndex == 2) {
                // We will fetch a digit
                int charIdx = random.nextInt(digits.length);
                char ch = digits[charIdx];
                // check if the digit exists
                while (password.indexOf(ch) != -1) {
                    charIdx = random.nextInt(digits.length);
                    ch = digits[charIdx];
                }
                password = password + ch;
            }

            else {
                // We will fetch a symbol
                int charIdx = random.nextInt(symbols.length);
                char ch = symbols[charIdx];
                // check if the symbol exists
                while (password.indexOf(ch) != -1) {
                    charIdx = random.nextInt(symbols.length);
                    ch = symbols[charIdx];
                }
                password = password + ch;
            }

            i++;
        }

    }

    void passwordCategory() {
        if (length >= 8 && length < 10) {
            System.out.println("The password is Very Weak");
        }

        else if (length >= 10 && length < 12) {
            System.out.println("The password is Weak");
        }

        else if (length >= 12 && length < 14) {
            System.out.println("The password is Medium");
        }

        else if (length >= 14 && length < 16) {
            System.out.println("The password is Strong");
        }

        else if (length == 16) {
            // for it to be a Very Strong password it must contain characters from each
            // category
            boolean containCap = false;
            boolean containSmall = false;
            boolean containDig = false;
            boolean containSym = false;
            for (int i = 0; i < capital_letters.length; i++) {
                if (password.indexOf(capital_letters[i]) != -1) {
                    containCap = true;
                    break;
                }
            }

            for (int i = 0; i < small_letters.length; i++) {
                if (password.indexOf(small_letters[i]) != -1) {
                    containSmall = true;
                    break;
                }
            }

            for (int i = 0; i < digits.length; i++) {
                if (password.indexOf(digits[i]) != -1) {
                    containDig = true;
                    break;
                }
            }

            for (int i = 0; i < symbols.length; i++) {
                if (password.indexOf(symbols[i]) != -1) {
                    containSym = true;
                    break;
                }
            }

            if (containCap && containSmall && containDig && containSym) {
                System.out.println("The password is Very Strong");
            } else {
                System.out.println("The password is Strong");
            }
        }
    }

    void printPassword() {
        System.out.println("The length of the password is: " + length);
        System.out.println("Here is the randmly generated password: " + password);

        passwordCategory();
    }

    public static void main(String[] args) {
        System.out.println(
                "This application will create a random password of length between 8 to 16 characters both inclusive");
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Please enter the length of the password that you want to
        // create");
        // int n = sc.nextInt();
        // while (n < 8 || n > 16) {
        // System.out.println("The length of the password should be at least 8 and at
        // most 16");
        // System.out.println("Please enter the valid length in the range 8-16 both
        // inclusive");
        // n = sc.nextInt();
        // }
        SecureRandomPassword sr = new SecureRandomPassword();
        sr.printPassword();

    }

}
