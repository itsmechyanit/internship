import java.util.Stack;
public class EvaluateRPN {
    public int evalRPN(String[] tokens){
        //maintain a stack for storing the numbers
        Stack<Integer> s = new Stack<>();
        
        for(String ch : tokens){
            //if the sting is "+"
            if(ch.equals("+")){
                //pop out the 2 elements from the stack
                int a = s.pop();
                int b = s.pop();
                //To maintain the order we will perform b + a
                s.add(b + a);
            }
            else if(ch.equals("-")){
                //pop out the 2 elements from the stack
                int a = s.pop();
                int b = s.pop();
                //for minus the order will matter for eg 2 - 1 is not the same as 1 - 2 and we need 2 - 1 as mentioned
                s.add(b -a);
            }
            else if(ch.equals("*")){
                //pop out the 2 elements from the stack
                int a = s.pop();
                int b = s.pop();
                
                s.add(b * a);
            }

            else if(ch.equals("/")){
                //pop out the 2 elements from the stack
                int a = s.pop();
                int b = s.pop();
                //order will also matter for division since 3/1 is not the same as 1/3 and we need 3/1
                s.add(b/a);
            }

            else{
                //if we encounter numbers as strings
                //convert the string to the number and then insert into the stack
                int temp = Integer.parseInt(ch);
                s.add(temp);
            }


        }
        //our output will be the last element
        return s.pop();

    }

    public static void main(String[] args) {
        EvaluateRPN rpn = new EvaluateRPN();
        System.out.println("Testing the first test case");
        String[] tokens1 = {"2","1","+","3","*"};
        System.out.println("The value of the expression is " +rpn.evalRPN(tokens1));
        System.out.println("Testing the Second test case");
        String[] tokens2 = {"4","13","5","/","+"};
        System.out.println("The value of the expression is " +rpn.evalRPN(tokens2));
        System.out.println("Testing the Third test case");
        String[] tokens3 = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println("The value of the expression is " +rpn.evalRPN(tokens3));

    }
    
}
