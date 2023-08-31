public class Thief {
  //We will be using dynamic programming to solve this problem
  public int FindMaxSum(int arr[], int n)
    {
        // Your code here
        //if the array has just one element then simply return it
        if(n == 1){
          return arr[0];
         }
        //create a state array and initialize it with -1
        int[] dp = new int[n];
        for(int i = 0; i < n; i ++){
          dp[i] = -1;
        }
        //if the first element is bigger than the second element update the first 2 entety in the state as shown below
        if(arr[0] > arr[1]){
          dp[0] = arr[0];
          dp[1] = arr[0];
        }
        //if the first element is smaller than the second element update the first 2 entety in the state as shown below
        else{
          dp[0] = arr[0];
          dp[1] = arr[1];
        }

     
        //start iterating the array from index 2
        for(int i = 2; i < arr.length; i++){
            int amount = arr[i];
            dp[i] = Math.max(dp[i - 2] + amount, dp[i - 1]);
        }
        //dp[n -1] will hold the maximum amount he can 
        return dp[n -1];
       


    }

    public static void main(String[] args) {
      Thief t = new Thief();
      System.out.println("Testing the first test case");
      int a1[] = {6,5,5,7,4};
      int n1 = 5;
      System.out.println("Maximum amount he can loot is: " + t.FindMaxSum(a1, n1));
      System.out.println("Testing the second test case");
      int a2[] = {1,5,3};
      int n2 = 3;
      System.out.println("Maximum amount he can loot is: " + t.FindMaxSum(a2, n2));
    }
}
