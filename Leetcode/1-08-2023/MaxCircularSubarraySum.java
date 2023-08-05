public class MaxCircularSubarraySum {
  static int circularSubarraySum(int a[], int n) {
        
    // Your code here
    //max_straight_sum represents the maximum sum subarray without the looping property
    int max_straight_sum = Integer.MIN_VALUE;
    int temp_max_staright_sum = 0;
    //total sum of the array elements
    int array_sum = 0;
    //min_straight_sum represents the minimum sum subarray without the looping property
    int min_straight_sum = Integer.MAX_VALUE;
    int temp_min_staright_sum = 0;
    //start looping the array
    for(int i = 0; i < n; i++){
      //get the element
      int elem = a[i];
      //add the element to the temp_max_straight_sum array
      temp_max_staright_sum += elem;
      //if the temp maxmum sum array is greater than the overall max sum array then update it
      if(temp_max_staright_sum > max_straight_sum){
        max_straight_sum = temp_max_staright_sum;
      }
      //we have to maximize the max_straight_sum  so if temp_max falls below 0
      //we need to reset it to zero
      if(temp_max_staright_sum < 0) temp_max_staright_sum = 0;
      //We need to minimize the min_straight_sum so the above steps will be reversed
      temp_min_staright_sum = temp_min_staright_sum + elem;
      if(temp_min_staright_sum < min_straight_sum){
        min_straight_sum = temp_min_staright_sum;
      }
      if(temp_min_staright_sum > 0) temp_min_staright_sum = 0;
      array_sum = array_sum + elem;
    }
    //if all the elements are negative then we simply have to return max_straight_sum
    if(array_sum == min_straight_sum){
      return max_straight_sum;
    }
    return Math.max(max_straight_sum, array_sum - min_straight_sum);
  }

  public static void main(String[] args) {
    System.out.println("Testing the first test case");
    int arr1[] = {8,-8,9,-9,10,-11,12};
    int n1 = 7;
    System.out.println("The maximum sum subarray is: " +circularSubarraySum(arr1, n1));
    System.out.println("Testing the second test case");
    int arr2[] = {10,-3,-4,7,6,5,-4,-1};
    int n2 = 8;
    System.out.println("The maximum sum subarray is: " +circularSubarraySum(arr2, n2));
  }
}
