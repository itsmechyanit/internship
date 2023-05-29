import java.util.HashMap;

public class ContiguousArray {

    public int findMaxLength(int[] nums) {
        //We will treat 0 as -1 and 1 as 1 itself
        //We will be creating a hashmap of sum againt index
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0;
        int ans = 0;
        
        hm.put(0, -1);
        for(int i = 0; i < nums.length; i++){
            //treating 0 as -1
            if(nums[i] == 0){
                sum += -1;
            }
            else{
                sum = sum + 1;
            }
            //if the current sum exists in the map then we have found a subarray with equal number of 0's and 1's
            if(hm.containsKey(sum)){
                int idx = hm.get(sum);
                int len = i - idx;
                //check if the current subarray length is bigger than the previous one then update the ans
                if(len > ans){
                    ans = len;
                }
            }
            //if the sum does not exist then simply put it in the hashMap
            else{
                hm.put(sum, i);
            }
        }

        return ans;
        
    }

    public static void main(String[] args) {
        ContiguousArray ca = new ContiguousArray();
        System.out.println("Testing out the first test case");
        int[] nums1 = {0,1};
        System.out.println("The maximum length of a contiguous subarray with an equal number of 0 and 1: "+ ca.findMaxLength(nums1));

        System.out.println("Testing out the second test case");

        int[] nums2 = {0,1,0};

        System.out.println("The maximum length of a contiguous subarray with an equal number of 0 and 1: "+ ca.findMaxLength(nums2));



    }


    
}
