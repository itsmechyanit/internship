import java.util.HashMap;

class Frequencies_Of_Limited{
   public static void frequencyCount(int arr[], int N, int P)
    {
        // code here
        //HashMap to store the frequency of every array element
        HashMap<Integer, Integer> hm = new HashMap<>();
        //fill the hasmap
        for(int i = 0; i < arr.length; i++){
          if(hm.containsKey(arr[i])){
            hm.put(arr[i], hm.get(arr[i]) + 1);
          }
          else{
            hm.put(arr[i],1);
          }
        }
        //Modify the array in place
        for(int i = 1; i <= N; i++){
          if(hm.containsKey(i)){
            //modify the array at i -1 since the array starts at index 0
            arr[i - 1] = hm.get(i);
          }
          else{
            arr[i - 1] = 0;
          }
        }
    }

    public static void main(String[] args) {
      System.out.println("Testing out the first test case");
      int N1 = 5;
      int arr1[] = {2,3,2,3,5};
      int p1 = 5;
      frequencyCount(arr1, N1, p1);
      System.out.println("Here is the modified array: ");
      for(Integer i:arr1){
        System.out.print(i +" ");
      }
      System.out.println();
      System.out.println("Testing out the second test case");
      int N2 = 4;
      int arr2[] = {3,3,3,3};
      int p2 = 3;
      frequencyCount(arr2, N2, p2);
      System.out.println("Here is the modified array: ");
      for(Integer i:arr2){
        System.out.print(i +" ");
      }
    }
}