import java.util.Scanner;

public class SumOfNumberAndReverse {

    public boolean sumOfNumberAndReverse(int num) {
        //if num is zero then it can be expressed so we return true
        if(num == 0) return true;
        //we will start with 1 and go until the number
        for(int i = 1; i < num; i++){
            //check if i + reversere(i) == num then return true
            if(i + reverse(i) == num) return true;
        }
        //return false if no such combination exists
        return false;
    }

    //function to get the reverse of a number
    public int reverse(int num){
        

        

        int temp = num;
        int rev = 0;
        while(temp > 0){
            int r = temp % 10;
            temp = temp/10;
            rev = rev * 10 + r;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number of your choice");
        int n = sc.nextInt();
        SumOfNumberAndReverse snr = new SumOfNumberAndReverse();
        boolean ans = snr.sumOfNumberAndReverse(n);
        
        if(ans) System.out.println("The above number can be expressed as sum of a number and its reverse");
        else System.out.println("The above number can't be expressed as sum of a number and its reverse");
        sc.close();
    }
    
}
