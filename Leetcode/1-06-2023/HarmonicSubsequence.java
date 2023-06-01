import java.util.HashMap;

//The key to solving this problem is to identify that we cannot have more than 2 distinct elements in our sequence

public class HarmonicSubsequence {
    public int findLHS(int[] nums) {
        //To store the count of each element in the array
        HashMap<Integer, Integer> hm = new HashMap<>();
        //ans reperesents the length of the longest harmonious Subsequence
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }
        //iterate over the keys in the hasmap
        for(Integer key: hm.keySet()){
            //check if key + 1 exists so that the diff is one
            if(hm.containsKey(key + 1)){
                //update the ans 
                ans = Math.max(ans, hm.get(key) + hm.get(key + 1));
            }
        }
        //This is an edge case where all the array elements are equal or there is no subsequence where the difference between the max - min is 1
        //In this case we simply return 0
        if(ans == Integer.MIN_VALUE){
            return 0;
        }

        return ans; 
    }

    public static void main(String[] args) {
        HarmonicSubsequence hs = new HarmonicSubsequence();
        System.out.println("Testing out the first test case");
        int[] nums1 = {1,3,2,2,5,2,3,7};
        System.out.println("The length of the longest harmonicSubsequence is: "+hs.findLHS(nums1));

        System.out.println("Testing out the Second test case");
        int[] nums2 = {1,2,3,4};
        System.out.println("The length of the longest harmonicSubsequence is: "+hs.findLHS(nums2));

        System.out.println("Testing out the Third test case");
        int[] nums3 = {1,1,1,1};
        System.out.println("The length of the longest harmonicSubsequence is: "+hs.findLHS(nums3));
    }
}
