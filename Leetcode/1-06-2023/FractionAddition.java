import java.util.ArrayList;
import java.util.List;

public class FractionAddition {

    //The key to solving this question is choosing the right data structures and then preparing the data
    //We will have a sign array to store the signs in the same order that they appear in the string expression
    //We will have a numerator array to store the numerator of each fraction
    //We will have a denominator array to store the denominator of each fraction
    //We will need to equalize all the denominators so that we can easily add all the numerators
    public String fractionAddition(String expression) {
        //array to store the signs 
        //if the expression starts with the - sign, We will deal with that situation later
        List<Character> sign_array = new ArrayList<Character>();
        //store the signs in the array
        for (int i = 1; i < expression.length(); i++) {
            if (expression.charAt(i) == '+' || expression.charAt(i) == '-')
              sign_array.add(expression.charAt(i));
          }
          //List to store the numerator and denominator of every fraction
          List<Integer> numerator = new ArrayList<>();
          List<Integer> denominator = new ArrayList<>();

          //splitting the fractions so that the numerator is stored in the numerator array and the denominator in the denominator array
          for (String subexpression : expression.split("\\+")) {
            for (String subsubexpression : subexpression.split("-")) {
              if (subsubexpression.length() > 0) {
                String[] fraction = subsubexpression.split("/");
                numerator.add(Integer.parseInt(fraction[0]));
                denominator.add(Integer.parseInt(fraction[1]));
              }
            }
            
          }
          //dealing with the situation when the string expression starts with the - sign
          if (expression.charAt(0) == '-') numerator.set(0, -numerator.get(0));
          //calculating the lcm of all the denominators
          int lcm = 1;
          for (int x : denominator) {
            lcm = lcm_(lcm, x);
          }
          //result will hold the accumulated numerator
          int result = lcm / denominator.get(0) * numerator.get(0);
          //get the numerators from the numerator array and then multiply it with the scaling factor and then add it to the result
          for (int i = 1; i < numerator.size(); i++) {
            if (sign_array.get(i - 1) == '+') result += lcm / denominator.get(i) * numerator.get(i);
            //if the sign is negative then we need to subtract from the result
            else result -= lcm / denominator.get(i) * numerator.get(i);
          }
          //convert the result to an irreducible fraction
          int g = gcd(Math.abs(result), Math.abs(lcm));
          return (result / g) + "/" + (lcm / g);
    }
    //helper function to return the lcm of 2 numbers
    private int lcm_(int a, int b) {
        return a * b / gcd(a, b);
      }
    //helper function to return the gcd of 2 numbers
    private int gcd(int a, int b) {
        while (b != 0) {
          int t = b;
          b = a % b;
          a = t;
        }
        return a;
      }

      public static void main(String[] args) {
        FractionAddition fa = new FractionAddition();
        System.out.println("Testing out the first test case");
        String expression1 = "-1/2+1/2";
        System.out.println("The result for the expression " + expression1+" is: "+fa.fractionAddition(expression1));
        System.out.println("Testing out the second test case");
        String expression2 = "-1/2+1/2+1/3";
        System.out.println("The result for the expression " + expression2+" is: "+fa.fractionAddition(expression2));
        System.out.println("Testing out the third test case");
        String expression3 = "1/3-1/2";
        System.out.println("The result for the expression " + expression3+" is: "+fa.fractionAddition(expression3));
      }
}
