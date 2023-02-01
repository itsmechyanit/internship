import java.util.Scanner;

public class Average {

    private static double calcAvg(double a, double b) {
        double result;
        result = (a + b) / 2.0;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 2 numbers for which you want to calculate the average");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Here is the average of the 2 numbers: " + calcAvg(a, b));
        sc.close();
    }

}
