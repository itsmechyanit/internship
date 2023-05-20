import java.lang.Math;
public class CountDigitOne {

    public int countDigitOne(int n) {
        //if n is zero return 0
        if(n == 0){
            return 0;
        }
        //if n is a single digit number then return 1
        if(n < 10){
            return 1;
        }
        //try finding the closest power of 10 less than n and then we will first find the number of ones in the closest power of 10
        int oneInBase = 0;
        //get the number of digits in n
        int lenOfNumber = String.valueOf(n).length();
        //base will be 10^(no of digits -1)
        int base = (int)Math.pow((double)10, (double)lenOfNumber -1);
        //get the remainder
        int remainder = n % base;
        int ans = n/base;

        if(ans == 1){
            //suppose n is 10 then the answer should be 2, However to accomadte 10 we will change oneInbase
            oneInBase = n - base + 1;
        }

        else{
            oneInBase = base;
        }
        //recurrsively break the problem into smaller sub problems
        return oneInBase + countDigitOne(base-1)*ans + countDigitOne(remainder); 

        
    }

    public static void main(String[] args) {
        CountDigitOne cdo = new CountDigitOne();
        System.out.println("Testing out the first testcase");
        int n1 = 13;
        System.out.println("The total number of digit one appearing in all integers less than " +n1 + " is " +cdo.countDigitOne(n1));

        System.out.println("Testing out the Second testcase");
        int n2 = 0;
        System.out.println("The total number of digit one appearing in all integers less than " +n2 + " is " +cdo.countDigitOne(n2));

        
    }
    
}
