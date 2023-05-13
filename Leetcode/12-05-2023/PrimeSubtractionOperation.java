import java.util.ArrayList;

public class PrimeSubtractionOperation {

    //Array list to hold all the prime numbers below 1000
    ArrayList<Integer> al = new ArrayList<>();

    public boolean isPrime(int x){
        for(int i = 2; i <= x/2; i++){
            if(x % i == 0) return false;
        }

        return true;
    }

    //function to fill the array list
    public void primeList(){
        for(int i = 2; i < 1000; i++ ){
            if(isPrime(i)){
                al.add(i);
            }
        }
    }
    //function to check if the array is strictly increasing
    public boolean isStrictlyIncreasing(int[] nums){
        for(int i = 0; i < nums.length -1; i++){
            if(nums[i] >= nums[i + 1]){
                return false;
            }
        }

        return true;
    }

    //This function return the biggest prime number less than or equal to x
    public int primeLessThan(int x){
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i < al.size(); i++){
            int val = al.get(i);
            if(val <= x && val > ans){
                ans = val;
            }
            if(val > x) break;
        }
        return ans;
    }

    public boolean primeSubOperation(int[] nums) {
        //if the given array is a strictly increasing array then return true
        if(isStrictlyIncreasing(nums)){
            return true;
        }
        
        //generate the prime numbers below 1000
        primeList();
        //prev will help us in determining the maximum value we can subtract from the element such that it is bigger than the previous element
        int prev = 0;
        //we are using a greedy approach to minimize the array elemnts sunch that the current element is greater than the previous
        for(int i = 0; i < nums.length; i++){
            int curr = nums[i];
            int diff = curr - prev - 1;
            if(diff == 1 || diff == 0){
                prev = nums[i];
                continue;
            }
            int p = primeLessThan(diff);
            nums[i] = nums[i] - p;
            prev = nums[i];
            //after each iteration check if the array has become strictly increasing 
            if(isStrictlyIncreasing(nums)){
                return true;
            }

        }

        

        return false;

        
    }

    public static void main(String[] args) {
        
        PrimeSubtractionOperation ps = new PrimeSubtractionOperation();
        int[] nums1 = {2,318,42};
        boolean ans1 = ps.primeSubOperation(nums1);
        if(ans1){
            System.out.println("The array can be made into a strictly increasing array");
        }
        else{
            System.out.println("The array can't be made into a strictly increasing array");
        }

        System.out.println("We will test another test case now");
        int[] nums2 = {5,8,3};
        boolean ans2 = ps.primeSubOperation(nums2);
        if(ans2){
            System.out.println("The array can be made into a strictly increasing array");
        }
        else{
            System.out.println("The array can't be made into a strictly increasing array");
        }

        System.out.println("We will test another test case now");
        int[] nums3 = {6,8,11,12};
        boolean ans3 = ps.primeSubOperation(nums3);
        if(ans3){
            System.out.println("The array can be made into a strictly increasing array");
        }
        else{
            System.out.println("The array can't be made into a strictly increasing array");
        }

    }
    
}
