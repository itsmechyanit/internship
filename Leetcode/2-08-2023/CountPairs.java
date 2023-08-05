import java.util.Arrays;
import java.util.HashMap;

public class CountPairs {
  int getPairsCount(int[] arr, int n, int k) {
    // code here
    //HasMap 2 store the frequency of the elements
    HashMap<Integer, Integer> hm = new HashMap<>();
    int cnt = 0;
    //start iterating over the array
    for(int i = 0; i < n; i++){
      //k - arr[i] exixts then we have a pair
      if(hm.containsKey(k - arr[i])){
        cnt += hm.get(k - arr[i]);
      }
      //if arr[i] does not exists then we will insert it into the map
      if(!hm.containsKey(arr[i])){
        hm.put(arr[i], 1);
      }
      //if arr[i] exists then we increment its frequency by 1
      else{
        hm.put(arr[i], hm.get(arr[i]) + 1);
      }
    }

    return cnt;

    
  }
  public static void main(String[] args) {
    CountPairs cp = new CountPairs();
    System.out.println("Testing the first test case");
    int n1 = 4;
    int k1 = 6;
    int[] arr1 = {1, 5, 7, 1};
    System.out.println("The number of pairs are: "+cp.getPairsCount(arr1, n1, k1));
    System.out.println("Testing the Second test case");
    int n2 = 4;
    int k2 = 2;
    int[] arr2 = {1, 1, 1, 1};
    System.out.println("The number of pairs are: "+cp.getPairsCount(arr2, n2, k2));
  }
}
