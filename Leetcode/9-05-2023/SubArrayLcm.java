public class SubArrayLcm {
    public int subarrayLCM(int[] nums, int k) {
        int i = 0;
        //number of subarrays whose lcm is k
        int total = 0;
        //bruforce approach for testing out all the subarrays
        while(i < nums.length){
            //this will fix one element
            int lcm = nums[i];
            if(lcm == k){
                total++;
            }

            int j = i + 1;
            //this will find all subarrays whose lcm is k containing nums[i]
            while(j < nums.length){
                int g = gcd(nums[j], lcm);
                lcm = lcm * nums[j];
                lcm = lcm/g;
                //found a subarray with lcm k then we need to increment total
                if(lcm == k) total++;
                //There is no subarray containing nums[i] whose lcm is k so we break
                if(lcm > k) break;
                j++;
            }

            i++;
        }

        return total;

    }

    private int gcd(int a, int b){
        if (b == 0){
          return a;  
        }
        return gcd(b, a % b);
      }

      public static void main(String[] args) {
        int[] input1 = {3,6,2,7,1};
        int k1 = 6;
        SubArrayLcm sl = new SubArrayLcm();
        System.out.println("The number of subarrays whose lcm is 6 " +"\n" + sl.subarrayLCM(input1, k1));
        System.out.println("Now we will test another test case");
        int[] input2 = {3};
        int k2 = 2;
        
        System.out.println("The number of subarrays whose lcm is 2 " +"\n" + sl.subarrayLCM(input2, k2));


      }

    



   

   
}
