public class CandyProblem {
  static int minCandy(int N, int ratings[]) {
    // code here
    //We will be using the greedy approach and break the problem into 2 parts
    //first while traversing from left to right
    //second while traversing from right to left
    int[] LTR = new int[N];
    int [] RTL = new int[N];
    //initilize both the arrays with 1 since each student gets 1 candy
    for(int i = 0 ; i < N; i++){
      LTR[i] = 1;
      RTL[i] = 1;
    }

    
    //start traversing from left to right
    for(int i = 1; i < N; i++){
      //if the rating of the current student is greater than the previous one then he should get more candy
      if(ratings[i] > ratings[i - 1]){
        LTR[i] = LTR[i -1] + 1;
      }
    }
    //start traversing from right to left
     for(int i = N - 2; i >= 0; i--){
      //if the rating of the current student is greater than the student to his right then he should get more candy
      if(ratings[i] > ratings[i + 1]){
        RTL[i] = RTL[i + 1] + 1;
      }
    }
    //finally take the maximum of the 2
    int ans = 0;
     for(int i = 0 ; i < N; i++){
      int maximum = Math.max(LTR[i], RTL[i]);
      ans = ans + maximum;
    }

    return ans;
  }

  public static void main(String[] args) {
    System.out.println("Testing out the first test case");
    int[] ratings1 = {1,0,2};
    int N1 = 3;
    System.out.println("The minimum no of candies is: "+ minCandy(N1, ratings1));
    System.out.println("Testing out the Second test case");
    int[] ratings2 = {1,2,2};
    int N2 = 3;
    System.out.println("The minimum no of candies is: " + minCandy(N2, ratings2));
  }
}
