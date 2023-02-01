import java.util.Scanner;

public class Prime {

    private static boolean isPrime(int n) {
        if (n == 0 || n == 1)
            return false;
        else if (n == 2)
            return true;
        else {
            int stop = (int) Math.sqrt(n) + 1;
            for (int i = 2; i <= stop; i++) {
                if (n % i == 0) {
                    return false;
                }
            }

            return true;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n = sc.nextInt();
        boolean ans = isPrime(n);
        if (ans == true)
            System.out.println(n + " is a prime number");
        else
            System.out.println(n + " is not a prime number");
        sc.close();
    }

}
