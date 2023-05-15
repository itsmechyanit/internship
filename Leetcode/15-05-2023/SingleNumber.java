public class SingleNumber {

    public int singleNumber(int[] nums) {
        //We can solve this question using Hashmap or by sorting the array
        //However in this case we will violate the condition

        //The best approach is bit manipulation 
        //The XOR of a number with itself will be 0

        int xor = 0;
        //Taking combined xor will result in a number that appears only once
        for(int num:nums){
            xor = xor ^ num;
        }
        //returns the combined xor
        return xor;
        
    }

    public static void main(String[] args) {
        SingleNumber sn = new SingleNumber();
        int[] nums1 = {2,2,1};
        System.out.println("The single number in the array is "+sn.singleNumber(nums1));
        System.out.println("Now we will test another test case");
        int[] nums2 = {4,1,2,1,2};
        System.out.println("The single number in the array is "+sn.singleNumber(nums2));

        System.out.println("Now we will test another test case");
        int[] nums3 = {1};
        System.out.println("The single number in the array is "+sn.singleNumber(nums3));
        

    }
    
}
