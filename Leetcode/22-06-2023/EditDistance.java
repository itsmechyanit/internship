public class EditDistance {
     public static int editDistance(String s, String t) {
        // Code here
        //This is a classic example of a dynamic programming problem
        int[][] dp = new int[s.length()][t.length()];
        //initialize the dp array with -1
        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp[0].length; j++){
                dp[i][j] = -1;
            }
        }

        return editDistanceHelper(s, t, 0, 0, dp);
    }

    private static int editDistanceHelper(String s, String t, int i, int j, int[][] dp){
        //base case
        if(i >= s.length()){
            return t.length() - j;
        }
        //base case
        if(j >= t.length()){
            return s.length() - i;
        }
        //check if the solution is already present in the dp array
        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int ans = 0;
        //if the character at index i in s and character at index j in t are equal then increment i by 1 and j by 1
        if(s.charAt(i) == t.charAt(j)){
            return editDistanceHelper(s, t, i+1, j+1, dp);
        }

        else{
            //for insert increment j by 1
            int insert = 1 + editDistanceHelper(s, t, i, j+1, dp);
            //for delete increment i by 1
            int delete = 1 + editDistanceHelper(s, t, i+1, j, dp);
            //for replace increment i and j by 1
            int replace = 1 + editDistanceHelper(s, t, i+1, j+1, dp);
            //min of the above 3 operations will be the ans
            ans = Math.min(Math.min(insert, delete), replace);
            //store the ans in the dp array
            dp[i][j] = ans;
        }
        //return the ans
        return ans;


    }

    public static void main(String[] args) {
        System.out.println("Testing the first test case");
        String s1 = "geek";
        String t1 = "gesek";
        System.out.println("The edit distance is: " + editDistance(s1, t1));
        System.out.println("Testing the Second test case");
        String s2 = "gfg";
        String t2 = "gfg";
        System.out.println("The edit distance is: " + editDistance(s2, t2));


    }


}
