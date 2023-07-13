import java.util.Arrays;

public class Knegations {
  //helper function to get the minimum value from an array
  public static long getMinimum(long a[], int n){
    long min = Long.MAX_VALUE;
    for(int i = 0; i < n; i++){
      if(a[i] < min){
        min = a[i];
      }
    }

    return min;
  }

   public static long maximizeSum(long a[], int n, int k)
    {
        // Your code goes here 
        //Sort the array so that minimum values come first
        Arrays.sort(a);
        //make the negative numbers positive and decement k
        for(int i = 0; i < n; i++){
          if(a[i] < 0 && k > 0){
            a[i] = -a[i];
            k--;
          }
        }
        //get the sum of all the numbers
        long sum = 0;
        for(int i = 0; i < n; i++){
          sum = sum + a[i];
        }
        //get the minimum value from the array
        long min = getMinimum(a, n);
        //if k is even simply return the sum
        if(k % 2 == 0){
          return sum;
        }
        //if k is odd then decrement sum by 2 * min value
        else{
          return sum - 2 *min;
        }
    }

    public static void main(String[] args) {
      System.out.println("Testing out the first test case");
      long[] arr1 = {1, 2, -3, 4, 5};
      int n1 = 5;
      int k1 = 1;
      System.out.println("The maximum sum after k negations is: " +maximizeSum(arr1, n1, k1));
      System.out.println("Testing out the Second test case");
      long[] arr2 = {5, -2, 5, -4, 5, -12, 5, 5, 5, 20};
      int n2 = 10;
      int k2 = 5;
      System.out.println("The maximum sum after k negations is: " +maximizeSum(arr2, n2, k2));

    }
  
}
