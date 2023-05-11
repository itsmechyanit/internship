public class MinimumOperations {
    //function to find the gcd
    private int gcd(int a, int b){
        if (b == 0){
          return a;  
        }
        return gcd(b, a % b);
      }

    public int minOperations(int[] nums) {
        //counting the number of 1s already present in the array
        int countOfOne = 0;
        int minimum = Integer.MAX_VALUE;
        for(int n : nums){
            if(n == 1) countOfOne++;
        }

        if(countOfOne > 0){
            //if there are 1s present then we return length - no of 1s
            return nums.length - countOfOne;
        }

        //if there are no 1s then we will find the minimum no of steps required to make each element equal to one
        //and then we will choose the minimum out of that, In short we are trying to find out the smallest subarray whose gcd is 1

        for(int i = 0; i < nums.length; i++){
            int currGcd = 0;
            for(int j = i; j < nums.length; j++){
                currGcd = gcd(currGcd, nums[j]);
                if(currGcd == 1){
                    minimum = Math.min(minimum, j - i + nums.length - 1);
                }
            }
        }
        //if we don't find a subarray whose gcd is 1 then we return -1
        if(minimum == Integer.MAX_VALUE) return -1;
        return minimum;
        
    }

    public static void main(String[] args) {
        MinimumOperations mo = new MinimumOperations();
        int[] input1 = {2,6,3,4};
        System.out.println("The minimum no of operations required to make all array elements equal to 1\n " + mo.minOperations(input1));

        System.out.println("Now we will work on the 2nd test case");
        int[] input2 = {2,10,6,14};
        System.out.println("The minimum no of operations required to make all array elements equal to 1\n " + mo.minOperations(input2));
    }
}
