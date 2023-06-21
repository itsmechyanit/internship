public class CoinChange {

     public long count(int coins[], int N, int sum) {
        // code here.
        //This is a classic example of a dynamic programming problem
        long[][] dp = new long[coins.length][sum + 1];
        //fill the base case
        for(int i = 0; i < coins.length; i++){
            dp[i][0] = 1;
        }

         for(int i = 0; i < coins.length; i++){
            for(int j = 1; j <= sum; j++){
                //if the coin denomination is more than the sum
                if(coins[i] > j){
                    //if it is the first row then there is no way of getting the sum using the current coin
                    if(i == 0){
                      dp[i][j] = 0;  
                    }
                    //if it is not the first row then simply copy the previous row's result
                    else{
                      dp[i][j] = dp[i - 1][j];  
                    }
                    
                }
                
                //exclude the coin--->a
                //include the coin--->b
                //total way will be a + b
                else{
                    if(i == 0){
                      dp[i][j] = 0 + dp[i][j - coins[i]];
                    }
                    else{
                       dp[i][j] = dp[i - 1][j] + dp[i][j - coins[i]];   
                    }
                  
                }

                
            }
        }

        
        //return the answer
        return dp[coins.length - 1][sum];


    }

    public static void main(String[] args) {
        CoinChange cc = new CoinChange();
        System.out.println("Testing the first test case");
        int sum1 = 4;
        int[] coins1 = {1,2,3};
        System.out.println("The total number of ways are: " + cc.count(coins1, 3, sum1));
        System.out.println("Testing the Second test case");
        int sum2 = 10;
        int[] coins2 = {2,5,3,6};
        System.out.println("The total number of ways are: " + cc.count(coins2, 4, sum2));
    }
    
}
