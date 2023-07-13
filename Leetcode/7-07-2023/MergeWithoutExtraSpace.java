import java.util.Arrays;

public class MergeWithoutExtraSpace {
   public static void merge(long arr1[], long arr2[], int n, int m) 
    {
       
        //Start with the last element in the first array
        int left = n -1;
        //start with the first element in the 2nd array
        int right = 0;
        while(left >= 0 && right < m){
            //if the element in the first array is greater than the element in the 2nd array
            if(arr1[left] > arr2[right]){
                //swap the element
                long temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right] = temp;
                //decrement left by 1
                left--;
                //increment right by 1
                right++;
            }
            else{
                break;
            }
        }
        //sort both the arrays to get the output 
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
    }

    public static void main(String[] args) {
      System.out.println("Testing the first test case");
      int n1 = 4;
      int m1 = 5;
      long[] arr1 = {1,3,5,7};
      long[] arr2 = {0,2,6,8,9};
      merge(arr1, arr2, n1, m1);
      System.out.println("Here are the merged arrays");
      for(Long i: arr1){
        System.out.print(i +" ");
      }
      for(Long i: arr2){
        System.out.print(i +" ");
      }

      System.out.println();

      System.out.println("Testing the second test case");
      int n2 = 2;
      int m2 = 3;
      long[] arr3 = {10,12};
      long[] arr4 = {5,18,20};
      merge(arr3, arr4, n2, m2);
      System.out.println("Here are the merged arrays");
      for(Long i: arr3){
        System.out.print(i +" ");
      }
      for(Long i: arr4){
        System.out.print(i +" ");
      }

    }
}
