public class AddDigits {
    public int addDigits(int num) {
        int sum = 0;
        int temp = num;
        //if num is zero return 0
        if(temp == 0){
            return temp;
        }
        //continue infinite iteration until the sum becomes less than 10
        while(true){
            //get all the digits and sum them
            while(temp > 0){

                int r = temp % 10;
                temp = temp/ 10;
                sum = sum + r;
            }
            //for the next iteration make temp equal to sum
            temp = sum;
            //reset sum to zero
            sum = 0;
            if(temp < 10){
                //if the sum of the digits become less than 10 simply return it
                return temp;
            }
        }
    }

    public static void main(String[] args) {
        AddDigits ad = new AddDigits();
        System.out.println("Testing out the first test case");
        int res1 = ad.addDigits(38);
        System.out.println(res1);
        System.out.println("Testing out the Second test case");
        int res2 = ad.addDigits(0);
        System.out.println(res2);


    }
}
