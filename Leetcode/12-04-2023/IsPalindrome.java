public class IsPalindrome {
    public boolean isPalindrome(int x) {
        int rev_num = 0;
        //negative numbers cannot be pallindrome
        if(x < 0) return false;

        else if(x == 0) return true;

        else{

            int temp = x;
            while(x > 0){
                //getting the digit in reverse order
                int digit = x % 10;
                x = x/10;
                //This checks if the integer value does not go out of the bounds and this is the most critical step
                //If this is not checked then all the test cases will not pass
                if(rev_num * 10 + digit < Integer.MAX_VALUE){
                    rev_num = rev_num * 10 + digit;
                }
                else break;
                
            }

            if(rev_num == temp) return true;
            else return false;
        }
        
    }
}
