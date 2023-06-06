public class StringToLowerCase {
    static String toLower(String S) {
        // code here
        String ans = "";
        //iterate over the string
        for(int i = 0; i < S.length(); i++){
            //grab the individual charater and convert it to lowercase
            char ch = S.charAt(i);
            //append the lowercase letter to the answer
            ans = ans + Character.toLowerCase(ch);
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Testing out the first test case");
        String s1 = "ABCddE";
        System.out.println("Here is the output: " + toLower(s1));

        System.out.println("Testing out the 2nd test case");
        String s2 = "LMNOppQQ";
        System.out.println("Here is the output: " + toLower(s2));
    }
}
