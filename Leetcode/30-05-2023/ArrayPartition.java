import java.util.Arrays;

public class ArrayPartition {

    public int arrayPairSum(int[] nums) {
        //sort the array in place
        Arrays.sort(nums);
        //create a sum variable
        int sum = 0;
        //iterate through the array in the steps of 2
        for(int i = 0; i < nums.length; i = i + 2){
            sum += nums[i];
        }
        //return sum
        return sum;
    }

    public static void main(String[] args) {
        ArrayPartition ap = new ArrayPartition();
        System.out.println("Testing out the first test case");
        int[] nums1 = {1,4,3,2};
        System.out.println("The maximized sum is: " + ap.arrayPairSum(nums1));

        System.out.println("Testing out the Second test case");
        int[] nums2 = {6,2,6,5,1,2};
        System.out.println("The maximized sum is: " + ap.arrayPairSum(nums2));
    }
    
}
