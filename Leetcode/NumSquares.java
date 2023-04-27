import java.lang.Math;
import java.util.HashMap;
public class NumSquares {

    public int numSquares(int n){
        //This problem can also be solved using dynamic programming or recursion using memoization
        //We will need to use memoization to avoid the time limit exceeded error
        HashMap<Integer, Integer>hm = new HashMap<>();
        return numSquaresHelper(n, hm);
    }

    public int numSquaresHelper(int n, HashMap<Integer, Integer> hm){
        int ans = Integer.MAX_VALUE;
        if(n <= 0 ) return 0;
        //we will only consider perfect squares until sqrt(n)
        int i = (int)Math.sqrt(n);
        int j = 1;
        while(j <= i){
            int tempAns;
            //if the map contains the answer to the smaller problem then directly use it
            if(hm.containsKey(n - j * j)){
                tempAns = 1 + hm.get(n - j * j);
            }
            else{
                //if not then  calculate 
                int temp = numSquaresHelper(n - j*j, hm);
               
                tempAns = 1 + temp;
            }
            
            if(tempAns < ans){
                ans = tempAns;
                //save the answer for future use;
                hm.put(n, tempAns);
            }
            j++;
        }

        return ans;

    }

public static void main(String[] args) {
    NumSquares ns = new NumSquares();
    System.out.println(ns.numSquares(12));
}

    
}
