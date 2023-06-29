public class NextHappy {
    static int nextHappy(int N){
        // code here
        int next = N + 1;
        while(!isHappy(next)){
            next++;
        }
        
        return next;
    }

    //helper function to check if a given number is a happy number
    public static boolean isHappy(int n) {
        //1 and 7 are the only single digit happy numbers

        if (n == 1 || n == 7) return true;

        int step_1 = n;
        int temp = n;
        //This checks for a single digit number(Condition for terminating the loop) or else the loop might run infinitely for non happy numbers
        while(step_1 > 9){
            step_1 = 0;
            while(temp > 0){
                //get the digit
                int r = temp % 10;
                //square the digit
                step_1 = step_1 + r*r;
                temp = temp / 10;
                
            }
            if(step_1 == 1) return true;
            //continue for the next iteration
            temp = step_1;
            
        }

        if(step_1 == 7) return true;
        return false;

        
        
    }

    public static void main(String[] args) {
        System.out.println("Testing out the first test case");
        int N1 = 8;
        System.out.println("The next happy number after " +N1+" is: " +nextHappy(N1));
        System.out.println("Testing out the Second test case");
        int N2 = 10;
        System.out.println("The next happy number after " +N2+" is: " +nextHappy(N2));
    }
}
