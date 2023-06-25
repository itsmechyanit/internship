import java.util.HashMap;

public class ImplementAtoI {
    int atoi(String str) {
	
        int result = 0;
        char sign = '\0';
        //start iterating over the string
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            //if the first character is - the make sign = -
            if(ch == '-' && i == 0){
                sign = '-';
                continue;
            }

            //if the character is not in the range 0-9 then return -1
            int d = ch - '0';
            if(d > 9 || d < 0){
                return -1;
            }
            else{
               result = result * 10 + d; 
            }
        }
        //if the sign is - then it is a negative number
        if(sign == '-'){
            return -result;
        }

        return result;


    }

    public static void main(String[] args) {
        ImplementAtoI ato = new ImplementAtoI();
        System.out.println("Testing the first test case");
        String st1 = "123";
        System.out.println("The output is: " + ato.atoi(st1));
        System.out.println("Testing the Second test case");
        String st2 = "21a";
        System.out.println("The output is: " + ato.atoi(st2));
    }
}
