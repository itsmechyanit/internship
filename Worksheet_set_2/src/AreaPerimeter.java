import java.util.Scanner;

public class AreaPerimeter {

    private static double area(double length, double width) {
        double area = length * width;
        return area;
    }

    private static double perimeter(double length, double width) {
        double per = 2 * (length + width);
        return per;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the length of the rectangle");
        double length = sc.nextDouble();
        System.out.println("Please enter the width of the rectangle");
        double width = sc.nextDouble();
        double a = area(length, width);
        double p = perimeter(length, width);
        System.out.println("The area of the rectangle is " + a);
        System.out.println("The perimeter of the rectangle is " + p);
        sc.close();
    }

}
