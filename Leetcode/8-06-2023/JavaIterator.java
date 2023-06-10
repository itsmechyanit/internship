import java.util.ArrayList;
import java.util.Collections;

public class JavaIterator {
    static ArrayList<Integer> javaIterator(int n, int k, int[] arr) {
        // code here
        //create an arrayList 
        ArrayList<Integer>ans = new ArrayList<>();
        //iterate over the array
        for(int i = 0; i < arr.length; i++){
            //check if the number is greater than or equal to k
            if(arr[i] >=k){
                //if it is then add it to the answer
                ans.add(arr[i]);
            }
        }
        //sort the array list
       Collections.sort(ans);
       return ans;
    }

    public static void main(String[] args) {
        System.out.println("Testing the first test case");
        int n1 = 5;
        int k1 = 8;
        int arr1[] = {1,6,9,2,11};
        ArrayList<Integer>ans1 = javaIterator(n1, k1, arr1);
        System.out.println("Here is the output: " +ans1);
        System.out.println("Testing the Second test case");
        int n2 = 4;
        int k2 = 13;
        int arr2[] = {1,4,6,9};
        ArrayList<Integer>ans2 = javaIterator(n2, k2, arr2);
        System.out.println("Here is the output: " +ans2);
    }
}
