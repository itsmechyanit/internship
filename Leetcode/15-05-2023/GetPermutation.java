import java.util.ArrayList;
import java.util.List;

public class GetPermutation {
    
    public String getPermutation(int n, int k) {
        //list to hold the numbers 1...N
        //let's say n = 4 and k = 17
        List<Integer>lst = new ArrayList<>();
        int fact = 1;
        //caluclate (n - 1)! factorial
        for(int i = 1; i < n; i++){
            fact = fact * i;
            lst.add(i);
        }

        lst.add(n);
        //ans will hold the final string
        String ans = "";
        //Since the numbers are stored in the zero index based list so k is 16
        k = k -1;
        while(!lst.isEmpty()){
            //when we fix a number then we will have facotial(n - 1) permutation
            ans = ans + String.valueOf(lst.get(k/fact));
            //once you have fixed the number remove it from the list
            lst.remove(k/fact);
            //change k
            k = k % fact;
            if(lst.size() == 0){
                break;
            }
            //adjust fact to reduce the number of permutations
            fact = fact/lst.size();
        }
        //return ans;
        return ans;
    }

    public static void main(String[] args) {
        GetPermutation gp = new GetPermutation();
        int n1 = 3, k1 = 3;
        System.out.println("The 3rd permutation sequence is " +gp.getPermutation(n1, k1));
        System.out.println("We will test another testcase");
        int n2 = 4, k2 = 9;
        System.out.println("The 9th permutation sequence is " +gp.getPermutation(n2, k2));
        System.out.println("We will test another testcase");
        int n3 = 3, k3 = 1;
        System.out.println("The 1st permutation sequence is " +gp.getPermutation(n3, k3));
    }
}
