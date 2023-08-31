
import java.util.Arrays;

public class TripletSum {
  
  public static boolean find3Numbers(int A[], int n, int X) { 
    
    // Your code Here
    //sort the array
    Arrays.sort(A);
    //iterate over the array
    //basically we are iterating over every element and checking if there exists a triplet including that element
    for(int i = 0; i < n -2; i++){
      int left = i + 1;
      int right = n -1;
      while(left < right){
        int currentSum = A[i] + A[left] + A[right];
        if(currentSum == X){
          return true;
        }
        //if the current sum is smaller than the target then we need to increase the sum
        //since the array is sorted we increment left by 1
        else if(currentSum < X){
          left++;
        }
        //if the current sum is bigger than the target then we need to decrease the sum
        //since the array is sorted we decrement right by 1
        else{
          right--;
        }
      }

      
    }

    return false;
 
 }

 public static void main(String[] args) {
  System.out.println("Testing the first test case");
  int n1 = 6;
  int X1 = 13;
  int arr1[] = {1,4,45,6,10,8};
  System.out.println("is there a triplet that sum to 13: " +find3Numbers(arr1, n1, X1));
  System.out.println("Testing the second test case");
  int n2 = 5;
  int X2 = 10;
  int arr2[] = {1,2,4,3,6};
  System.out.println("is there a triplet that sum to 10: " +find3Numbers(arr2, n2, X2));
 }

}
