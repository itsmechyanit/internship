public class Kadane {
  long maxSubarraySum(int arr[], int n){
        
    // Your code here
    //kadens Alogorithm consists of 3 steps
    long temp_sum = 0;
    long maximum = Long.MIN_VALUE;
    for(int i = 0; i < n; i++){
      //Step-1
      //Add the current element to the temp_sum
      temp_sum = temp_sum + arr[i];
      //step-2
      //Compare maximum with the temp_sum
      maximum = Math.max(maximum, temp_sum);
      //step-3
      //if temp_sum is less than 0 then reset it to 0
      if(temp_sum < 0) temp_sum = 0;
    }

    return maximum;
    
  }

  public static void main(String[] args) {
    Kadane kd = new Kadane();
    System.out.println("Testing out the first test case");
    int n1 = 5;
    int arr1[] = {1,2,3,-2,5};
    System.out.println("The maximum subarray sum is: " + kd.maxSubarraySum(arr1, n1));
    System.out.println("Testing out the Second test case");
    int n2 = 4;
    int arr2[] = {-1,-2,-3,-4};
    System.out.println("The maximum subarray sum is: " + kd.maxSubarraySum(arr2, n2));
  }
}
