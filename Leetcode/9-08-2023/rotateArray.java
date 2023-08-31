public class rotateArray {
  static void rotateArr(int arr[], int d, int n)
    {
        // add your code here
        //Make sure that d is not bigger than n
        d = d % n;
        // temp array to store the first d elements
        int[] temp = new int[d];
        for(int i = 0; i < d; i++){
          temp[i] = arr[i];
        }
        //shift every element by d position
        for(int i = d; i < n; i++){
          arr[i - d] = arr[i];
        }

        
        //copy the first d elements to the last of the array
        for(int i = n - d; i < n ; i++){
          arr[i] = temp[i - (n - d)];
          
        }
    }

    public static void main(String[] args) {
      System.out.println("Testing the first test case");
      int N = 5, D = 2; 
      int arr1[] = {1,2,3,4,5};

      rotateArr(arr1, D, N);

      System.out.println("Here is the array after rotating it by 2 positions");

      for(Integer i: arr1){
        System.out.print(i + " ");
      }

      System.out.println();

      System.out.println("Testing the second test case");
      int n = 10, d = 3; 
      int arr2[] = {2,4,6,8,10,12,14,16,18,20};

      rotateArr(arr2, d, n);

      System.out.println("Here is the array after rotating it by 3 positions");

      for(Integer i: arr2){
        System.out.print(i + " ");
      }

    }
}
