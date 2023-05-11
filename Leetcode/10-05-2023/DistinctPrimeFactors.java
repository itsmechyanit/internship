import java.util.HashSet;

public class DistinctPrimeFactors {

   
    public int distinctPrimeFactors(int[] nums){
        //use the has set to store the factors
        //we won't multiply the array elements for optimizing our code
        HashSet<Integer> hs = new HashSet<>();
        //we will iterate over the array elements and find the factors and store it in the set
        for(int x : nums){
            int t = 2;
            while(t * t <=x){
                //t is a factor and we will add it to the set
                while(x % t == 0){
                    x = x/t;
                    hs.add(t);
                }
                t++;

                
            }
            //case when x gets reducted to a prime number
            if(x > 1){
                hs.add(x);
            }

        }
        //return the length of the set
        return hs.size();
    }

    public static void main(String[] args) {
        int[] input = { 2,4,3,7,10,6};
        DistinctPrimeFactors dpf = new DistinctPrimeFactors();
        System.out.println("The number of distinct prime factor is " +dpf.distinctPrimeFactors(input));
        System.out.println("Now we will work on another test case");

        int[] input2 = {2,4,8,16};
        System.out.println("The number of distinct prime factor is " +dpf.distinctPrimeFactors(input2));


    }
    
}
