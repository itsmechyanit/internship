public class SearchRange {
    public int[] searchRange(int[] nums, int target) {

        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;

        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = (start + end)/2;
            if(nums[mid] == target){
                //check in the right hand side
                int temp = mid + 1;
                while(temp < nums.length && nums[temp] == target){
                    temp++;
                }

                int temp1 = mid - 1;
                while(temp1 > -1 && nums[temp1] == target){
                    temp1--;
                }

                if(temp -1 == mid && temp1 + 1 == mid){
                    ans[0] = mid;
                    ans[1] = mid;
                    return ans;
                }

                else{
                    ans[0] = temp1 + 1;
                    ans[1] = temp -1;
                    return ans;
                }

            }

            else if(nums[mid] > target){
                end = mid - 1;
            }

            else{
                start = mid + 1;
            }
        }

        return ans;
}
}
