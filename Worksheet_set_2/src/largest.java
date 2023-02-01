import java.util.Scanner;

public class largest {

    private static int compare(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        }

        else if (a > b && a < c) {
            return c;
        }

        else if (b > a && b > c) {
            return b;
        }

        else {
            return c;
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int first, second, third;
        System.out.println("Please Enter the first number of your choice");
        first = sc.nextInt();
        System.out.println("Please Enter the second number of your choice");
        second = sc.nextInt();
        System.out.println("Please Ennter the third number of your choice");
        third = sc.nextInt();

        int ans = compare(first, second, third);

        System.out.println("The biggest number is: " + ans);
        sc.close();

    }

}
