import java.util.Scanner;

public class Question10 {

    private static boolean powerOf2(int num){
        if(num == 0) return false;
        if(num == 1) return true;
        int ans = 1;
        for(int i = 1; i < 32; i++){
            if(ans * 2 < Integer.MAX_VALUE){
                ans = ans * 2;
                if(ans == num)return true;
            }
            else{
                if(ans == num) return true;
                else return false;
            }
        }

        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n = sc.nextInt();
        boolean answer = powerOf2(n);
        if(answer == true)System.out.println("The given number is power of 2");
        else System.out.println("The given number is not power of 2");
        sc.close();
    }
}
