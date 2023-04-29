import java.util.Stack;
public class BasicCalculator {
    public int calculate(String s){
        int i = 0;
        int calculation = 0;
        int sign = 1;
        Stack <Integer> st = new Stack<>();
        while(i <  s.length()){
            if(s.charAt(i) == ' '){
                i++;
                continue;
            }
            else if(s.charAt(i) >= 48 && s.charAt(i) <= 57){
                //we have a numeric digit
                int num = 0;
                while((i < s.length() && s.charAt(i) >= 48 && s.charAt(i) <= 57)){
                    num = num * 10 + Integer.parseInt(Character.toString(s.charAt(i)));
                    i++;
                }
                calculation = calculation + num * sign;
                i--;

            }
            else if(s.charAt(i) == '+'){
                sign = 1;
            }

            else if(s.charAt(i) == '-'){
                sign = -1;
            }

            else if(s.charAt(i) == '('){
                st.push(calculation);
                st.push(sign);
                calculation = 0;
                sign = 1;
            }
            //(1+(4+5+2)-3)+(6+8)
            else if(s.charAt(i) == ')'){
                if(!st.empty()){
                    calculation = st.peek()*calculation; 
                    st.pop();
                    calculation = calculation + st.peek();
                    st.pop();
                }
                
            }

            i++;


        }

        return calculation;
    }

    public static void main(String[] args) {
        BasicCalculator bc = new BasicCalculator();
        int output = bc.calculate("(1+(4+5+2)-3)+(6+8)");
        System.out.println(output);
    }
       
}
