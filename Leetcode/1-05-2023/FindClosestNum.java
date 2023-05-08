public class FindClosestNum {

    public int findClosestNumber(int[] nums) {
        int minimum = Integer.MAX_VALUE;
        int ans = Integer.MAX_VALUE;
        //iterate over the array
        for(int i = 0; i < nums.length; i ++){
            //if the number is closer to zero in left or right direction
            if(Math.abs(nums[i] - 0) < minimum){
                ans = nums[i];
                minimum = Math.abs(nums[i] - 0);
            }
            //if the difference is the same check the bigger num
            else if(Math.abs(nums[i] - 0) == minimum){
                if(nums[i] > ans){
                    ans = nums[i];
                }
            }
        }
        
        return ans;
    }
    
}
