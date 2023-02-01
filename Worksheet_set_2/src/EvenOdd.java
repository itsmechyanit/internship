import java.util.Scanner;

public class EvenOdd {

    private static boolean isEven(int num) {
        if (num % 2 == 0)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number for odd/even testing");
        int n = sc.nextInt();
        Boolean ans = isEven(n);
        if (ans == true)
            System.out.println("The entered number is even");
        else {
            System.out.println("The entered number is odd");
        }

        sc.close();
    }

}
