import java.util.Scanner;

public class Interest {

    private static double calcSI(double principal, double rate, double tp) {
        double si = (principal * rate * tp) / 100;
        return si;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the principal");
        double p = sc.nextDouble();
        System.out.println("Please enter the rate of interest");
        double r = sc.nextDouble();
        System.out.println("Please enter the time period");
        double tp = sc.nextDouble();
        double si = calcSI(p, r, tp);
        System.out.println("The simple interest is: " + si);
        sc.close();
    }

}
