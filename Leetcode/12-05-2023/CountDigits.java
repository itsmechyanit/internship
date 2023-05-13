public class CountDigits {
    public int countDigits(int num) {
        //count holds the total number of digits that divide the number
        int count = 0;
        int temp = num;
        while(temp > 0){
            //start getting the digit from the end
            int digit = temp % 10;
            //if the digit divides the num 
            if(num % digit == 0)count++;
            temp = temp/10;
        }
        
        return count;
        
    }

    public static void main(String[] args) {
        CountDigits cd = new CountDigits();
        int num1 = 7;
        System.out.println("The total number of digits that divide the number is " + cd.countDigits(num1));
        System.out.println("Now We will test another test case");
        int num2 = 121;
        System.out.println("The total number of digits that divide the number is " + cd.countDigits(num2));
        System.out.println("Now We will test another test case");
        int num3 = 1248;
        System.out.println("The total number of digits that divide the number is " + cd.countDigits(num3));




    }
}
