import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

    //We are using recursion to solve this problem

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        //findAll is a recusive function
        //since all the parenthesis will begin with opening bracket so we will start with (
        findAll("(", 1, 0, res, n);
        return res;
        
    }

    public void findAll(String current, int oc, int cc, List<String> res, int n){

        //base case
        //if n = 2 then each string will have 2 opening brackets and 2 closing brackets so the length will be 4(2 *n)
        if(current.length() == 2 * n){
            //We will add the string to the result
            res.add(current);
            return;
        }
        //check if the opening bracket count is less than n then call the recursive function and increment opening count by 1
        if(oc < n){
           findAll(current + '(', oc + 1, cc, res, n); 
        }
        //if the closing bracket count is less than the opening bracket count then call the function and increment closing count by 1
        if(cc < oc){
            findAll(current + ')', oc, cc + 1, res, n); 
        }
    }

    public static void main(String[] args) {
        GenerateParenthesis gp = new GenerateParenthesis();
        System.out.println("Testing out the first test case");
        int n1 = 3;
        List<String>ans1 = gp.generateParenthesis(n1);
        System.out.println(ans1);
        System.out.println("Testing out the Second test case");
        int n2 = 1;
        List<String>ans2 = gp.generateParenthesis(n2);
        System.out.println(ans2);
    }
    
}
