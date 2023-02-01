import java.util.Scanner;

public class Vowel {

    private static boolean isVowel(char ch) {

        if (ch == 'a' || ch == 'A')
            return true;

        else if (ch == 'e' || ch == 'E')
            return true;

        else if (ch == 'i' || ch == 'I')
            return true;

        else if (ch == 'o' || ch == 'O')
            return true;

        else if (ch == 'u' || ch == 'U')
            return true;

        else
            return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a single character of your choice");
        String s = sc.next();
        boolean ans = isVowel(s.toCharArray()[0]);
        if (ans == true)
            System.out.println("The entered character " + s + " is a vowel");
        else
            System.out.println("The entered character " + s + " is not a vowel");

        sc.close();

    }

}
