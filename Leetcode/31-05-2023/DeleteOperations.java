public class DeleteOperations {

   
    public int minDistance(String word1, String word2) {
        //The key to solving the problem is getting the longest common subsequence
        //We will be using dynamic programming to solve this question
        int[][] dp = new int[word1.length()][word2.length()];
        //initialize the 2D dp array to -1
        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp[0].length; j++){
                dp[i][j] = -1;
            }
        }
        //add length of the first word with the length of the 2nd word and then subtract 2 times the longest common sub sequence
        return word1.length() + word2.length() - 2 * lcs(word1, word2, 0, 0, dp);
        
    }

    private int lcs(String word1, String word2, int i, int j, int[][] dp){
        //base case
        if(i >= word1.length()){
            return 0;
        }
        //base case
        if(j >= word2.length()){
            return 0;
        }
        //if we already have a solution then no need for a recursive call
        if(dp[i][j]!= -1){
            return dp[i][j];
        }
        //if the characters at index i in the first string equals character at index j in the second string
        if(word1.charAt(i) == word2.charAt(j)){
            //increment i by 1 and j by 1 and then make a recursive call
            //also save the answer in the dp array
            dp[i][j] =  1 + lcs(word1, word2, i + 1, j + 1, dp);
            return dp[i][j];
        }
        //if the characters are not equal at i and j index then
        //get the max between i, j + 1 and i+1, j
        //save the answer in the dp array
        else{
            dp[i][j] = Math.max(lcs(word1, word2, i, j+1,dp), lcs(word1, word2, i+1, j, dp));
            return dp[i][j];
        }
    }

    public static void main(String[] args) {
       DeleteOperations dop = new DeleteOperations();
       System.out.println("Testing out the first test case");
       String word11 = "sea";
       String word12 = "eat";
       System.out.println("The minimum num of steps required to make " +word11
       +" to " + word12 + " the same: "+dop.minDistance(word11, word12));
       System.out.println("Testing out the second test case");
       String word21 = "leetcode";
       String word22 = "etco";
       System.out.println("The minimum num of steps required to make " +word11
       +" to " + word12 + " the same: "+dop.minDistance(word21, word22));
    }
    
}
