public class EqSum {
   String equilibrium(int arr[], int n) {
        // code here
        //left sum
        int left = 0;
        //right sum
        int right = 0;
        int i = 0;
        int j = n - 1;
        //iterate while i < j
        while(i <= j){
          //if left sum and right sum are equal and i < j
          //add arr[i] to the left sum
          //add arr[j] to the right sum
          //increment i by 1
          //decrement j by 1
          if(left == right && i < j){
            left = left + arr[i];
            right = right + arr[j];
            i++;
            j--;
          }
          //if left sum and right sum are equal and i == j then return yes
          else if(left == right && i == j){
            return "YES";
          }
          //if left sum > right sum
          //add arr[j] to the right sum
          //decrement j by 1
          else if(left > right){
            right = right + arr[j];
            j--;
          }
          //if right sum > left sum
          //add arr[i] to the left sum
          //increment i by 1
          else{
            left = left + arr[i];
            i++;
          }
        }

        return "NO";
        
    }

    public static void main(String[] args) {
      EqSum e = new EqSum();
      System.out.println("Testing the first test case");
      int arr1[] = {1,2,3,3};
      int n1 = 4;
      System.out.println("Is there an Equilibrium point: "+ e.equilibrium(arr1, n1));
      System.out.println("Testing the Second test case");
      int arr2[] = {1,5};
      int n2 = 2;
      System.out.println("Is there an Equilibrium point: "+ e.equilibrium(arr2, n2));
    }
}
