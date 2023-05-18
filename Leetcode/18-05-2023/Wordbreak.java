import java.util.ArrayList;
import java.util.List;

public class Wordbreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        //We will be using Dynamic programming here
        //create a dp array of size length of the string plus 1
        boolean[] dp = new boolean[s.length() + 1];
        //The base case where we are at the end of the string
        dp[s.length()] = true;
        //start traversing the string from the end
        //here dp[j] indicates whether we can word break this string from index j
        for(int j = s.length() - 1; j >= 0; j--){
            for(String w : wordDict){
                //check if the substring's length has enough characters for comparision with the given dict word
                //if it has then check if the given substring is equal to the given dictWord
                if(j + w.length() <= s.length() && s.substring(j, j + w.length()).equals(w)){
                    //We can word break the string starting at index j
                    dp[j] = dp[j + w.length()];
                }
                if(dp[j] == true)break;
            }
        }
        //whether we can word break the index starting a index 0
        return dp[0];
    }

    public static void main(String[] args) {
        Wordbreak wb = new Wordbreak();
        System.out.println("Testing the first test case");
        String s1 = "leetcode";
        ArrayList<String> wordDict1 = new ArrayList<>();
        wordDict1.add("leet");
        wordDict1.add("code");
        boolean ans1 = wb.wordBreak(s1, wordDict1);
        if(ans1){
            System.out.println("The string can be segmented into a space separated sequence of one or more dictionary words");
        }

        else{
            System.out.println("The string cannot be segmented into a space separated sequence of one or more dictionary words");
        }
        System.out.println("Testing the Second test case");
        String s2 = "applepenapple";
        ArrayList<String> wordDict2 = new ArrayList<>();
        wordDict2.add("apple");
        wordDict2.add("pen");
        boolean ans2 = wb.wordBreak(s2, wordDict2);
        if(ans2){
            System.out.println("The string can be segmented into a space separated sequence of one or more dictionary words");
        }

        else{
            System.out.println("The string cannot be segmented into a space separated sequence of one or more dictionary words");
        }

        System.out.println("Testing the Third test case");
        String s3 = "catsandog";
        ArrayList<String> wordDict3 = new ArrayList<>();
        wordDict3.add("cats");
        wordDict3.add("dog");
        wordDict3.add("sand");
        wordDict3.add("and");
        wordDict3.add("cat");
        boolean ans3 = wb.wordBreak(s3, wordDict3);
        if(ans3){
            System.out.println("The string can be segmented into a space separated sequence of one or more dictionary words");
        }

        else{
            System.out.println("The string cannot be segmented into a space separated sequence of one or more dictionary words");
        }

    }
}
