public class IsHappy {

    public static boolean isHappy(int n) {
        //1 and 7 are the only single digit happy numbers

        if (n == 1 || n == 7) return true;

        int step_1 = n;
        int temp = n;
        //This checks for a single digit number(Condition for terminating the loop) or else the loop might run infinitely for non happy numbers
        while(step_1 > 9){
            step_1 = 0;
            while(temp > 0){
                int r = temp % 10;
                step_1 = step_1 + r*r;
                temp = temp / 10;
                
            }
            if(step_1 == 1) return true;
            temp = step_1;
            
        }

        if(step_1 == 7) return true;
        return false;

        
        
    }

    public static void main(String[] args) {
        System.out.println(isHappy(4));
    }
    
}
