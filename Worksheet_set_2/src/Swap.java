import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int firstNum = sc.nextInt();
        System.out.println("Please enter the second number");
        int second = sc.nextInt();
        System.out.println("After swapping");
        int t = second;
        second = firstNum;
        firstNum = t;
        System.out.println("The first number is " + firstNum);
        System.out.println("The second number is " + second);

        sc.close();

    }

}
