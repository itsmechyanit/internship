import java.util.Arrays;
import java.util.Stack;

public class MaximumDifferenceNearest {
  //helper function to reverse the array
  void reverse(int[] a, int n){
     int i = 0;
     int j = n -1;
     while(i < j ){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        i++;
        j--;
     }
  }
  int findMaxDiff(int a[], int n)
    {
	  // Your code here	
      //The key to solving the problem is to identify the right datastructure to use which is stack in this case
      //The clue is since we want to perform some operations to the left of the current element
      Stack<Integer> s = new Stack<>();
      //LSE will hold the nearest left smaller element to the current element
      int LSE[] = new int[n];
      //RSE will hold the nearest RIGHT smaller element to the current element
      int RSE[] = new int[n];
      //initilize LSE with 0
      LSE[0] = 0;

      s.push(a[0]);
      //Start iterating over the array
      for(int i = 1; i < n; i++){
        //if the stack is not empty and the top of the stack is bigger than the current element simply pop it
        while(!s.isEmpty() && s.peek() >= a[i]){
          s.pop();
        }
        //if the stack is empty then the current element has no nearest left smaller element
        if(s.isEmpty()){
          //make the left nearest smaller element equal o of the current element
          LSE[i] = 0;
        }
        else{
          ////make the left nearest smaller element equal to the top of the stack
          LSE[i] = s.peek();
        }
        s.push(a[i]);
      }
      while(!s.isEmpty()){
        s.pop();
      }
     //reverse the array
     //reverse the array so that the left nearest smaller element of the reversed array is the same as the right nearest smaller element of the original array
     reverse(a, n);
     //repeat the process above to get the left nearest smaller element of the reversed array 
     RSE[0] = 0;
      s.push(a[0]);
      for(int idx = 1; idx < n; idx++){
        while(!s.isEmpty() && s.peek() >= a[idx]){
          s.pop();
        }
        if(s.isEmpty()){
          RSE[idx] = 0;
        }
        else{
          RSE[idx] = s.peek();
        }
        s.push(a[idx]);
      }

      //reverse RSE;
     reverse(RSE, n);

     int ans = Integer.MIN_VALUE;
      //find the maximum absolute difference between LSE and RSE
     for(int idx = 0; idx < n; idx++){
      int val = Math.abs(LSE[idx] - RSE[idx]);
      if(val > ans){
        ans = val;
      }
     }

     return ans;


      
     
    }

    public static void main(String[] args) {
      MaximumDifferenceNearest md = new MaximumDifferenceNearest();
      System.out.println("Testing out the first test case");
      int[] arr1 = {2,1,8};
      int n1 = 3;
      System.out.println("The maximum difference is: " +md.findMaxDiff(arr1, n1));
      System.out.println("Testing out the Second test case");
      int[] arr2 = {2, 4, 8, 7, 7, 9, 3};
      int n2 = 7;
      System.out.println("The maximum difference is: " +md.findMaxDiff(arr2, n2));
    }
}
