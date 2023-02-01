import java.util.Scanner;

public class Table {

    private static void table(int n) {
        for (int i = 1; i < 11; i++) {
            int result = n * i;
            System.out.println(n + " * " + i + " = " + result);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number for which you want to generate a table");
        int n = sc.nextInt();
        System.out.println("Printing the table");
        table(n);
        sc.close();
    }

}
