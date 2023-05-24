public class PerfectNumber {
    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        //odd number can never be a perfect number
        if(num %2 != 0){
            return false;
        }
        //get all the factors of num less than num
        for(int i = 1; i <= num/2;i++){
            if(num % i == 0){
                //add the factor to the sum
                sum = sum + i;
            }
        }
        //if sum is equal to num then return true
        if(sum == num){
            return true;
        }
        //if sum is not equal to num return false
        return false;
    }

    public static void main(String[] args) {
        PerfectNumber pn = new PerfectNumber();
        System.out.println("Testing the first test case");
        int num1 = 28;
        System.out.println("Is 28 a perfect number: "+pn.checkPerfectNumber(num1));

        System.out.println("Testing the Second test case");
        int num2 = 7;
        System.out.println("Is 7 a perfect number: "+pn.checkPerfectNumber(num2));
    }
}
